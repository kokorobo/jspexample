<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>list.jsp<br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="board.BoardDAO"></jsp:useBean>
<div align="center">
<table border="1">
	<caption><font size="6">게시판</font></caption>
	<tr>
	<th>번호</th> <th>이름</th> <th>제목</th>
	<th>날짜</th> <th>조회수</th> <th>groupId</th>
	<th>step</th> <th>indent</th> 
	</tr>
	<c:forEach var="dto" items="${dao.list() }">
	<tr>
	<th>${dto.id }</th> <th>${dto.name }</th> 
	<th>
	<c:forEach begin="1" end="${dto.indent }">-></c:forEach>
	<a href="content_view.jsp?id=${dto.id }">${dto.title }</a>
	</th>
	<th>${dto.savedate }</th> <th>${dto.hit }</th> <th>${dto.idgroup }</th>
	<th>${dto.step }</th> <th>${dto.indent }</th> 
	</tr>
	</c:forEach>
	<tr>
		<td colspan="8"><a href="write_view.jsp">글작성</a></td>
	</tr>
</table>
</div>
</body>
</html>