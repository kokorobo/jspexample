<%@page import="java.util.concurrent.Delayed"%>
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
	.login { width: 80%; height: 400px; margin: auto}
	</style>
</head>
<body>
	<header><%@ include file = "../default/header.jsp" %></header>
	<jsp:useBean id="dao" class="members.MemberDAO"/>
	<% 
	MemberDTO dto = new MemberDTO();
	String key1 = (String)request.getParameter("key");
	%><table class="login"> <%
	
	if(key1 != null){
		dto = dao.memberList(key1);
		
		%><tr><td><%out.print("아디 : " + dto.getId()+"</td><tr>");
		%><tr><td><%out.print("비번 : " + dto.getPwd()+"</td><tr>");
		%><tr><td><%out.print("이름 : " + dto.getName()+"</td><tr>");
		%><tr><td><%out.print("주소 : " + dto.getAdd()+"</td></tr>");
		%><tr><td><%out.print("전화 : " + dto.getTel()+"</td></tr>");
		
	}else{
		out.print("a");}%>
		
	<% String id2 = (String)session.getAttribute("id");
	
	%>
	 <tr><td><%
	 if(id2.equals(dto.getId())){
		%><input type="button" onclick="location.href='modifyInfo.jsp'" value="수정"><%
		%></td><td><input type="button" onclick="location.href='deleteInfo.jsp'" value="삭제">
	 <%}else{  %> <a href="memberInfo.jsp">이전</a><%
	 }%></td></tr>
	 </table>
	<footer><%@ include file = "../default/footer.jsp" %></footer>
</body>
</html>