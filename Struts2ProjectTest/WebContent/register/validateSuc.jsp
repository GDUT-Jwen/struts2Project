<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Success</title>
</head>
<body>
Employee Information is captured successfully.
<br/>
<b>Example of If and Else</b><br/>
<s:if test="username=='lqw'">
    You have selected 'jwen'.
</s:if>
<s:elseif test="username=='jwen'">
    You have selected 'lqw'
</s:elseif>
<s:else>
    You have not selected 'lqw' or 'jwen'.
</s:else>

UserName : <s:property value="user"/><br/>

<p>The environment name property can be accessed in three ways:</p>

(Method 1) Environment Name:
<s:property value="user.username"/><br/>

(Method 2) Environment Name:
<s:push value="user">
    <s:property value="username"/><br/>
</s:push>

(Method 3) Environment Name:
<s:set name="myenv" value="user.username"/>
<s:property value="myenv"/>


</body>
</html>