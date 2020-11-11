<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	session.setAttribute("id", "길동");
	session.setAttribute("age", "23");
	session.setAttribute("key", "123a");
	%>
	<h1> 세션이 설정 되어습니다.</h1>
	<a href="getSession.jsp">get</a>
	<a href="delSession.jsp">del</a>

</body>
</html>