package com.jwen.struts2.action;

import com.jwen.struts2.user.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Result(name = "success", location = "/register/validateSuc.jsp")
public class GetUserInfoAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = -642626954207328043L;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private User user = new User();

	public User getModel() {
		return user;
	}

	@Action(value = "/getuser")
	public String execute() {
		System.out.println(user);
		return SUCCESS;
	}
}
