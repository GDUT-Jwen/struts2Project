<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
<form action="uploadDemo" method="post" enctype="multipart/form-data">
    <input type="file" name="myFile" />
    <input type="submit" value="Upload"/>
</form>
</body>
</html>