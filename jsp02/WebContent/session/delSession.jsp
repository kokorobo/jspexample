<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>delSession.jsp<br>
<h1>세션 삭제 헿</h1>
<%
	//session.removeAttribute("age");
//	session.setMaxInactiveInterval(5);  전체지움 5초
	session.invalidate();
%>



	<a href="setSession.jsp">set</a>
	<a href="getSession.jsp">get</a>
</body>
</html>