<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="User_update" method="post">
		<input type="hidden" value="${user.id }" name="user.id">
		用户姓名：<input type="text" value="${user.name}" name="user.name"><br/>
		出生日期：<input type="text" value="${user.birthday}" name="user.birthday"><br/>
		用户月薪：<input type="text" value="${user.money}" name="user.money"><br/>
		<button type="submit">修改</button>
	</form>

</body>
</html>