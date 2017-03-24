package com.gjjf.commonservice.message.biz;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommonService {

	public abstract void getValidCode(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse);

	public abstract boolean validateCode(String paramString1, String paramString2);

}
