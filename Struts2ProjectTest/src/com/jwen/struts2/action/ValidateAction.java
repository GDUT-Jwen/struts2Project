package com.jwen.struts2.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {

	private static final long serialVersionUID = -639631402949171318L;

	public void getUserInfo() {
		ActionContext context = ActionContext.getContext();
		// 获取到请求的参数，封装所有请求的参数
		Map<String, Object> map = context.getParameters();
		// 遍历获取数据
		Set<String> keys = map.keySet();
		for (String key : keys) {
			// 通过key，来获取到值
			String[] vals = (String[]) map.get(key);
			System.out.println(key + " : " + Arrays.toString(vals));
			if("username".equals(key)) {
				context.put("username", Arrays.toString(vals));
			}else if("password".equals(key)) {
				context.put("password", Arrays.toString(vals));
			}
		}

		// 如果向request对象中存入值
		context.put("msg", "小东东");
		// 获取其他map集合
		context.getSession().put("msg", "小苍");
		context.getApplication().put("msg", "小泽");
	}

	public String execute() throws Exception {
		getUserInfo();
		return SUCCESS;
	}
}
