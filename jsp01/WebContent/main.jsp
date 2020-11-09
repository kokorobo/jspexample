<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>main.jsp<br>
	<table>
	<tr style="width: 80%; height: 500px; boder: 1px solid black;"> <td >
		<%@ include file = "header01.jsp" %></td></tr>
	<tr><td><h1>인클루드 사이에 들어갈 내용!</h1></td></tr>
		<tr><td><%@ include file = "footer01.jsp" %></td></tr>
	</table>
	

</body>
</html>