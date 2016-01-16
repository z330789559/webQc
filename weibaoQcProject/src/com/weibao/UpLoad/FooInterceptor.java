package com.weibao.UpLoad;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class FooInterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		
		ValueStack vs=actionInvocation.getStack();
		System.out.println("FooInterceptor.intercept()-----before");
		System.out.println("FooInterceptor.intercept()-----after");
		return "error";
	}

}
