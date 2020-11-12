<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>chkUser.jsp<br>
	<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String user = request.getParameter("user");
	
	if(user.equals("user")){%>
	<jsp:forward page="userPage.jsp">
		<jsp:param value="일반사용자값" name="name"/>
	</jsp:forward>
	<%}else{ %>
		<jsp:forward page="adminPage.jsp">
		<jsp:param value="관리자 입니다" name="name"/>
	</jsp:forward>
	<%}%>

</body>
</html>