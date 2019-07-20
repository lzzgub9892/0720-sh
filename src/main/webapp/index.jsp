<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="User_save" method="post">
		用户姓名：<input type="text" name="user.name"><br/>
		出生日期：<input type="text" name="user.birthday"><br/>
		用户月薪：<input type="text" name="user.money"><br/>
		<button type="submit">新增</button>
	</form>
	<hr/>
	<table width="800px" border="">
			<caption>用户管理系统</caption>
			<tr>
				<td>用户ID</td>
				<td>用户姓名</td>
				<td>出生日期</td>
				<td>用户月薪</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.birthday}</td>
					<td>${user.money}</td>
					<td>
						<a href="User_updateUI?user.id=${user.id}">修改</a>
						<a href="User_delete?user.id=${user.id}">删除</a>
					</td>
				</tr>	
			</c:forEach>
			
	</table>

</body>
</html>