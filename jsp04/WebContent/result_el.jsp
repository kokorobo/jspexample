<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<fmt:requestEncoding value="utf-8"/>
<body>resut_el<br>
	el id : ${param.id }<br>
	el pwd : ${param.pwd }<br>
<hr>
<jsp:useBean id="dao" class="test.testDAO"/>
	<c:set var="result" value="${ dao.userChk(param.id, param.pwd)}"/>
	<c:if test="${result == 0 }">
	인증 성공입니다.
	</c:if>
	<hr>
	<h3>개인 정보</h3>
	<c:set var="dto" value= "${dao.getUser(param.id) }" />
	이름 : ${dto.name }<br>주소 : ${dto.addr }<hr>
	<hr>
	<table border="1">
		<tr> <th>이름</th> <th>주소</th></tr>
		<c:forEach var="dto" items="${dao.list() }">
			<tr>
				<td>${dto.name }</td><td>${dto.addr }</td></tr>
			</c:forEach>
	</table>
</body>
</html>