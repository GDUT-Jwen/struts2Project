<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>成功跳转</title>

    <style type="text/css">

        body{
            margin:0 5px;
            padding:0;
        }
    </style>
</head>
<body>
    <h1>hello</h1>
     <a href="${pageContext.request.contextPath}/order_add.action">添加订单</a>
  	  <a href="${pageContext.request.contextPath}/order_delete.action">删除订单</a>
</body>
</html>