package com.gjjf.zuul.filfer;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gjjf.framework.rest.Result;
import com.gjjf.framework.util.JSONUtils;
import com.gjjf.framework.util.StringUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AccessFilter extends ZuulFilter  {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    
    /**
     * 	pre:请求执行之前filter 
	 *  route: 处理请求，进行路由 
	 *	post: 请求处理完成后执行的filter 
	 *	error:出现错误时执行的filter
     */
    @Override
    public String filterType() {
        return "pre";
    }
    
    /**
     * filter执行顺序，通过数字指定
     */
    @Override
    public int filterOrder() {
        return 0;
    }
    
    /**
     * filter是否需要执行 true执行 false 不执行
     */
    public boolean shouldFilter() {
        return true;
    }
    
    /**
     * filter具体逻辑
     */
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        String accessToken = request.getParameter("accessToken");
        if(StringUtil.isEmpty(accessToken)) {
        	
            log.warn("access token 为空");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            
            HttpServletResponse response = ctx.getResponse();
            
            Result result = new Result();
    		result.setMessage("access token is empty");
            
            this.returnFalse(request, response, result);
            
    		return null;
        }
        log.info("access token ok");
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