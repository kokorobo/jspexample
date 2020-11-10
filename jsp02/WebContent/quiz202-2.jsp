<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	int num = (int)application.getAttribute("num");
	application.setAttribute("num", num +1);
	%>
	<h3>게시글 임메다</h3>
	<h4>공지 입메다</h4>
	jsp application을 이용한 조회수 올리기 입니다.<br>
	<a href="quiz202.jsp">돌아가기</a>

</body>
</html>