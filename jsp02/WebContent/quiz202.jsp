<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	table th{ border : 1px solid black;}
	table td{ border : 1px solid black;}
	</style>
</head>
<body>
	<% if(application.getAttribute("num") == null){
		application.setAttribute("num",0);
	}%>
	<table style="border : 1px solid black;">
	<tr><th>제목</th><th>조회수</th></tr>
	<tr><td><a href="quiz202-2.jsp">안녕하세요</a></td>
	<td><%= application.getAttribute("num") %></td></tr>
	</table>
	

</body>
</html>