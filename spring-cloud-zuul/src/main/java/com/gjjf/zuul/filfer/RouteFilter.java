package com.gjjf.zuul.filfer;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gjjf.framework.rest.Result;
import com.gjjf.framework.util.JSONUtils;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class RouteFilter extends ZuulFilter  {

    private static Logger log = LoggerFactory.getLogger(RouteFilter.class);

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 4;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        
        log.info("过滤器将请求路由到微服务");
        
        HttpServletResponse response = ctx.getResponse();
        
        Result result = new Result();
		result.setMessage("过滤器将请求路由到微服务");
        
        this.returnFalse(request, response, result);
        
		return null;
    }
    
    private void returnFalse(HttpServletRequest request,HttpServletResponse response,Result result) {
    	
    	ServletOutputStream stream = null;
    	
    	try{
    		
    		stream = response.getOutputStream();
    		
    		response.reset();
    		response.setCharacterEncoding("UTF-8");
    		response.setContentType("application/json;charset=utf-8");
    		response.setHeader("Cache-Control", "no-cache");
    		byte[] buffer = JSONUtils.toJsonString(result).getBytes();
    		
    		stream.write(buffer,0,buffer.length);
    		
    		stream.flush();
    		
    	}catch(Exception e) {
    		log.error("拦截异常：",e);
    	}finally {
    		if(stream != null) {
    			try {
					stream.close();
				} catch (IOException e) {
					log.error("数据流关闭异常：",e);
				}
    		}
    	}
    	
    }
    
}