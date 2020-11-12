<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>adminPage.jsp<br>
	<h3>일반 사용자 페이지 입니다.</h3>
	id : <%=request.getParameter("id") %><Br>
	pwd : <%=request.getParameter("pwd") %><Br>
	user : <%=request.getParameter("user") %><Br>
	param : <%=request.getParameter("name") %><Br>
	<a href="javascript:histroy.back()">이전</a>
	

</body>
</html>