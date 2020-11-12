<%@page import="members.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.login { width: 400px;  margin: auto; border:1px solid black;}
		.login td{border:1px solid black;}
		.login th{border:1px solid black; }
	</style>
</head>
<body>
	<header><%@ include file = "../default/header.jsp" %></header>
	<jsp:useBean id="dao" class="members.MemberDAO"/>
	<h1 style="text-align: center; margin: 20 auto">회원 목록</h1>
	<table class="login">
	<tr><th>이름</th><th>주소</th><th>전화번호</th></tr>
	<%
		ArrayList<MemberDTO> list = dao.memberList();
		for(MemberDTO d : list){%>
			<tr><td>
			<jsp:forward page="userInfo.jsp">
			<jsp:param value="<%=d.getName() %>" name="name"/>
			</jsp:forward>
			<%=d.getName() %></td>
			<td><%=d.getAdd() %></td>
			<td><%=d.getTel() %></td></tr>
		<% } %>
		
	</table>
	<footer><%@ include file = "../default/footer.jsp" %></footer>
</body>
</html>