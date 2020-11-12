<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.head { color: pink; text-align: center;}
.headtb{ margin: auto 10% auto auto;}
.headtb th{ margin-left: 30%;}
</style>
</head>
<body>
	<h3 class="head">남자는 핑크지</h3>
	<hr style="width: 80%">
	<table class="headtb">
	<tr><th ><a href="index.jsp">HOME</a></th>
	<th ><%if(session.getAttribute("id")!=null){
		%><a href="memberInfo.jsp">회원 정보</a></th>
	<%}else{%>
		<a href="login.jsp">회원 정보</a>
	<% }%>
	<th><% if(session.getAttribute("id")!=null){
		%><a href="logout.jsp">로그아웃</a><% 
	}else{%>
		<a href="login.jsp">로그인</a>
	<% }%>
	</th></tr>
	</table>
	<hr style="width: 80%">
	
</body>
</html>