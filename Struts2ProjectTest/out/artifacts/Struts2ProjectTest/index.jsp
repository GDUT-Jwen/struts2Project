<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello,World
	  <a href="${pageContext.request.contextPath}/order_add.action">添加订单</a>
  	  <a href="${pageContext.request.contextPath}/order_delete.action">删除订单</a>
  	   <a href="${pageContext.request.contextPath}/register.action">注册</a>
		<a href="${pageContext.request.contextPath}/register/getUserInfo.jsp">获取用户信息</a>
</body>
</html>