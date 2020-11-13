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
	String name = request.getParameter("name");
	String add = request.getParameter("add");
	String tel = request.getParameter("tel");
	String id = (String)session.getAttribute("id");
	boolean boo = dao.modifyed(id,name,add,tel); 
	if(boo){
		%> <script type="text/javascript"> alert("수정 성공");
		location.href="memberInfo.jsp";
		</script><%
	}else{
		%> <script type="text/javascript"> alert("수정 실패");
		location.href="modifyInfo.jsp";
		</script><%
	}
	%>
	
	

</body>
</html>