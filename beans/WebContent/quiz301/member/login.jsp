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
	<table class="login">
	<tr><td><h1>로그인 페이지 입니다.</h1></td><td>
	<form action="loginChk.jsp" method="post">
		<table>
		<tr><td><input type="text" name="id"></td>
		<td rowspan="2"><input type="submit" value="로그인" style="width: 60px; height: 50px;"></td></tr>
		<tr><td><input type="text" name="pwd"></td>
		</tr>
		<tr><td><a href="regaster.jsp">회원가입</a></td></tr>
		</table>
	</form>
	</td></tr>
	</table>
	<footer><%@include file = "../default/footer.jsp" %></footer>
</body>
</html>