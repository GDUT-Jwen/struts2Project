<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
	<h3>使用EL表达式获取值</h3>
<%-- 	${ sessionScope.msg }
	${ requestScope.msg }
	${ applicationScope.msg } --%>
	
	${ requestScope.username }
	${ requestScope.password }
	${ requestScope.age }
</body>
</html>