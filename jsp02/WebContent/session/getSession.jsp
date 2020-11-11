<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>getSession.jsp<br>
<h1> 세션의 설정값 가져오기 </h1>
	<%
	String id = (String)session.getAttribute("id");
	String age = (String)session.getAttribute("age");	
	String key = (String)session.getAttribute("key");
	%>
	id:<%=id %><br>
	age:<%=age %><br>
	key:<%=key %><br>
	<a href="setSession.jsp">set</a>
	<a href="delSession.jsp">del</a>
</body>
</html>