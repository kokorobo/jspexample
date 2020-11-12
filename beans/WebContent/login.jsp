<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header><%@include file ="header.jsp" %></header>
	<form action="prinLogin.jsp" method="post">
		<input type="text" name="id"><br>
		<input type="text" name="pwd"><br>
		<input type="text" name="name"><br>
		<input type="text" name="add"><br>
		<input type="text" name="tel"><br>
		<input type="submit" value="로그인">
	</form>
	<footer><%@include file = "footer.jsp" %></footer>
</body>
</html>