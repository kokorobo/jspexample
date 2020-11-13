<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
	String idchk = request.getParameter("id");
	String id2 = dao.memberChk(idchk);
	String pw11 = request.getParameter("pwck");
	String pw22 = request.getParameter("pw");
	
	if(request.getParameter("id")==null){
		%>  <script type="text/javascript"> alert("아디 필수 입력");
				location.href="regaster.jsp";
		</script><% 
	}else if(request.getParameter("pwck")==null){
		%> <script type="text/javascript"> alert("비번 필수 입력");
		location.href="regaster.jsp";
		</script><%
	}else if(id2 != null){
		%> <script type="text/javascript"> alert("아디 중복");
		location.href="regaster.jsp";
		</script><%
	}else if(pw11 != pw22){
		dao.register(idchk,pw11,request.getParameter("name"),request.getParameter("add"),request.getParameter("tel") );
		%> <script type="text/javascript"> alert("회원가입 축하");
		location.href="login.jsp";
		</script><%
	}else{
		%> <script type="text/javascript"> alert("비번 다름");
		location.href="regaster.jsp";
		</script><%
	}
	%>

</body>
</html>