package com.jwen.struts2.action;

import com.jwen.struts2.user.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegistAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = -642626954207328043L;

	private User user = new User();

	public User getModel() {
		return user;
	}

	public String execute() {
		System.out.println(user);
		return SUCCESS;
	}
}
