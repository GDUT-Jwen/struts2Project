package com.jwen.struts2.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = "success", location = "/register/validateSuc.jsp"),
        @Result(name = "input", location = "/register/register.jsp")
})
public class User extends ActionSupport {

    public User() {}

    public User(String name) {
        this.username = name ;
    }


    @Action(value = "/userinfo")
    public String execute() {
        return SUCCESS;
    }

    @RequiredFieldValidator( message = "The name is required" )
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @IntRangeFieldValidator(message = "Age must be in between 28 and 65",min = "29", max = "65")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String username;
    private String password;
    private Integer age;

}
