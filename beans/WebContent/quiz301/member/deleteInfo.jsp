<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dao" class="members.MemberDAO"/>
	
	<% 
		String id = (String)session.getAttribute("id");
	boolean boo = dao.delete(id); 
	if(boo){
		%> <script type="text/javascript"> alert("삭제 성공");
		location.href="login.jsp";
		</script>
		
		<% 
		session.invalidate(); 
		
	}else{
		%> <script type="text/javascript"> alert("삭제 실패");
		location.href="userInfo.jsp";
		</script><%
	}
	%>

</body>
</html>