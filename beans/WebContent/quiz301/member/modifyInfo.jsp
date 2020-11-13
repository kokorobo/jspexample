<%@page import="members.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header><%@include file = "../default/header.jsp" %></header>
	<jsp:useBean id="dao" class="members.MemberDAO"/>
	<% 
	MemberDTO dto = null;
	dto = dao.memberList2((String)session.getAttribute("id"));
	%>
	<form action="modifyed.jsp" method = "get" style="width: 80%; height: 400px; margin: auto">
	<input type="text" name="name" value="<%=dto.getName()%>"><br>
	<input type="text" name="add" value="<%=dto.getAdd()%>"><br>
	<input type="text" name="tel" value="<%=dto.getTel()%>"><br>
	<input type="submit" value="수정">
	</form>
	<footer><%@include file = "../default/footer.jsp" %></footer>
</body>
</html>