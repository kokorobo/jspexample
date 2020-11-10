<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	table th{border: 1px solid black;}
	table td{border: 1px solid black;}
	</style>
</head>
<body>
	<form action="result201.jsp">
		<table style="border: 1px solid black; align-content: center;">
		<tr><th>이름 :</th><td><input type="text" name="name"></td></tr>
		<tr><th>성별 :</th><td><input type="radio" name="gender" value="남자" checked="">남자<input type="radio" name="gender" value="여자">여자</td></tr>
		<tr><th>계절 :</th><td><input type="checkbox" name="season" value="봄">봄
		<input type="checkbox" name="season" value="여름">여름
		<input type="checkbox" name="season" value="가을">가을
		<input type="checkbox" name="season" value="겨울">겨울
		</td></tr>
		<tr><th><input type="submit" value="전송"></th><td><input type="button" value="취소"></td></tr>
		</table>
	</form>

</body>
</html>