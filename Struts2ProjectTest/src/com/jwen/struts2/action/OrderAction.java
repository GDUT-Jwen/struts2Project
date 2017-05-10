package com.jwen.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class OrderAction extends ActionSupport{
	
	public String add() {
		System.out.println("增加订单");
		return "add";
	}
	
	public String delete() {
		System.out.println("删除订单");
		return "delete";
	}
	
}
