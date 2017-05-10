package com.jwen.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MySecoundInterceptor implements Interceptor {

	private static final long serialVersionUID = 7709681867438771790L;

	@Override
	public void destroy() {
		System.out.println("destroy MySecoundInterceptor");
		
	}

	@Override
	public void init() {
		System.out.println("init MySecoundInterceptor");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("进入第二个拦截器MySecoundInterceptor");
		String result = invocation.invoke();
		System.out.println("结束第二个拦截器MySecoundInterceptor");
		return result;
	}
	
}
