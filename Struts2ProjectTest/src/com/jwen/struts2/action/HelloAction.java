package com.jwen.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jw on 2017/5/8.
 */
/**
 * Stuts2框架都使用Action类处理用户的请求
 * 
 * @author Administrator
 */
@SuppressWarnings("serial")
public class HelloAction extends ActionSupport{

	/**
	 * Action类中的方法签名有要求的，必须这么做 public 共有的 必须有返回值，必须String类型 方法名称可以是任意的，但是不能有参数列表
	 */
	public String sayHello() {
		// 编写代码 接收请求的参数
		System.out.println("Hello Struts2!!");
		return SUCCESS;
	}
	
	public String doNothing() {
		// 编写代码 接收请求的参数
		System.out.println("Do Nothing!");
		return NONE;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}
}