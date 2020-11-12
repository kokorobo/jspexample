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
<body>loginChk.jsp<br>

	<jsp:useBean id="mem" class="members.MemberDTO"/>
	<jsp:setProperty property="*" name="mem"/>
	<%
		String id = mem.getId();
		String pwd = mem.getPwd();
		MemberDTO m = new MemberDTO();
		m.setId("1234"); m.setPwd("1234");
		if(id.equals(m.getId()) && pwd.equals(m.getPwd())){
			out.print(m.getId()+"님 반갑");
			session.setAttribute("id", id);
			%>
			<script type="text/javascript"> alert(<%=id%>+"님 어서와");
				location.href="successLogin.jsp";
			</script>
			
			<% 
		}else if(id.equals(m.getId())){
			%>
			<script type="text/javascript"> alert("비밀번호 틀림");
				location.href="login.jsp";
			</script>
			<%
		}else {
			%>
			<script type="text/javascript"> alert("아이디 없음");
				location.href="login.jsp";
			</script>
			<%
		}
	%>

</body>
</html>