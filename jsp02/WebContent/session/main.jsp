<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>main.jsp<br>
<%
	if(session.getAttribute("loginUser") == null){%>
		<script type="text/javascript">
		alert("로그인 먼저해")
		location.href="login.jsp;
		</script>
	<% } %>
%>

	<%= session.getAttribute("loginUser")%> 님 안녕!<br>
	<a href="logout.jsp">록으아웃</a>
	<a href="login.jsp">록으인</a>

</body>
</html>