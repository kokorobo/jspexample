<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
</head>
<body>popup.jsp<br>
	<script type="text/javascript">
	function close2(){
		window.open("makeCookie.jsp","","width=300,height=200,top=500,left=500")
		
	}
	</script>
	
	
	<h1 align="center">공 구 사 항</h1>
	<h3>오전 03 ~ 06시 까지 집가자!</h3>
	<input type="checkbox" name="season" onclick="window.close(), close2()" >
	5초간 열지 않음.
	
</body>
</html>