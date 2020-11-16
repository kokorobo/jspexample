<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>login_el.jsp<br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<form action="result_el.jsp" method="post">
		<input type="text" name="id"><br>
		<input type="text" name="pwd"><br>
		<input type="submit">
	</form>
	
	<c:import url="login_el(setEncoding).jsp"></c:import>
   
   <%--<c:redirect url="login_el.jsp"></c:redirect> --%>
   
   <c:set var="name" value="홍길동" scope="session"></c:set> <!-- session 설정 -->
   ${sessionScope.name }<br> <!-- 세션 확인 -->
   
   <c:remove var="name"/> <!-- 세션 삭제 -->
   
   <c:set var="name" value="김개똥"></c:set>
   
   <c:choose>
      <c:when test="${name == '홍길동' }">홍길동임 - if</c:when>
      <c:otherwise>홍길동 아님</c:otherwise>
   </c:choose>
	

</body>
</html>