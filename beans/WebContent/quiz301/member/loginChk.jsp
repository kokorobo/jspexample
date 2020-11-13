<%@page import="com.sun.jdi.Location"%>
<%@page import="members.MemberDTO"%>
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
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		MemberDTO dto = dao.memberList2(id);
		System.out.print(dto.getId());
		
		 if(dto.getId() == null){
			%>
		<script type="text/javascript"> alert("아이디 없음");
			location.href="login.jsp";
		</script>
		<%
		
		}else if(id.equals(dto.getId()) && pwd.equals(dto.getPwd())){
			out.print(dto.getId()+"님 반갑");
			session.setAttribute("id", id);
			%>
			<script type="text/javascript"> alert(<%=id%>+"님 어서와");
				location.href="successLogin.jsp";
			</script>
			
			<% 
		}else if(id.equals(dto.getId())){
			%>
			<script type="text/javascript"> alert("비밀번호 틀림");
				location.href="login.jsp";
			</script>
			<%
	
		}else{
			%>
			<script type="text/javascript"> alert("아이디 없음"+
				"<%=dto.getId()%>"
				"<%=dto.getPwd()%>"
				location.href="login.jsp";
			</script>
			<%
		}
			
	%>
</body>
</html>