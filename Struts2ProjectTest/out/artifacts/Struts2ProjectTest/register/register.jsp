<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	  <h3>注册页面</h3>
  <s:form action="userinfo" method="post">
      <s:textfield name="username" label="姓名" size="20"/><br/>
      <s:password name="password" label="密码" size="20"/><br/>
      <s:textfield name="age" label="年龄" size="20"/><br/>
      <s:submit name="submit" label="注册" align="center" />
  </s:form>

  <s:debug></s:debug>
  <s:property value="errors.age[0]"/>

</body>
</html>