<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	.login { width: 80%; height: 400px; margin: auto}
	</style>
</head>
<body>
	<header><%@include file = "../default/header.jsp" %></header>
	<form action="register.jsp" method = "get" class="login">
	<input type="text" name="id" placeholder="아이디">(*필수 항목)<br>
	<input type="text" name="pw" placeholder="비번"><br>
	<input type="text" name="pwck" placeholder="비번확인">(*필수 항목)<br>
	<input type="text" name="name" placeholder="이름"><br>
	<input type="text" name="add" placeholder="주소"><br>
	<input type="text" name="tel" placeholder="전화"><br>
	<input type="submit" value="회원가입">
	</form>
	<footer><%@include file = "../default/footer.jsp" %></footer>
</body>
</html>