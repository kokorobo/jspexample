<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<hr>
 <c:import url="login_el.jsp" />
 <%-- <c:redirect url="login_el.jsp"/> --%>
 <c:set var="name" value="홍길동" scope="session"/>
 <c:remove var="name"/>
 <c:set var="name" value="김개똥"/>
 <c:choose>
 	<c:when test="${name eq '홍길동' }">홍길동이군요</c:when>
 	<c:when test="${name == '김개똥' }">김개똥이군요</c:when>
 	<c:otherwise>엘스가 동작하는군요</c:otherwise>
 </c:choose>
<hr>
	<form action="test.jsp">
		<input type="checkbox" name="se" value="sptring">봄
		<input type="checkbox" name="se" value="summer">여름
		<input type="checkbox" name="se" value="fall">가을
		<input type="checkbox" name="se" value="winter">겨울
		<input type="submit">
	</form>

</body>
</html>