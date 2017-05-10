package com.jwen.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor extends AbstractInterceptor implements Interceptor{


	private static final long serialVersionUID = 2514715402586767491L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("进入第一个拦截器MyInterceptor");
		
		// 执行下一个拦截器
		String result = invocation.invoke();
		
		System.out.println("结束第一个拦截器MyInterceptor");
		
		return result;
	}

}
