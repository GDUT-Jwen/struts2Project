package com.jwen.struts2.user;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Jw on 2017/5/15.
 */
public class UserConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        User usr = new User(strings[0]);
        return usr;
    }

    @Override
    public String convertToString(Map map, Object o) {
        User user = (User) o;
        return user == null?null : user.getUsername();
    }
}
