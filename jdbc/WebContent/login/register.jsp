<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<% 
	
	String pw11 = request.getParameter("pwck");
	String pw22 = request.getParameter("pw");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@192.168.0.46:1521:xe";
	String id = "java" ,pwd ="1234";
	Connection con = DriverManager.getConnection(url, id, pwd);
	String sql = "select * from student where stunum = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,request.getParameter("id"));
	ResultSet rs = ps.executeQuery();

	String id2 = null;

	while(rs.next()){
		id2 = rs.getString("stunum");

	}	
	
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
		String sql2 ="INSERT INTO student VALUES (?, ? ,? ,? ,?)";
		PreparedStatement ps2 = con.prepareStatement(sql2);
		ps2.setString(1,request.getParameter("id"));
		ps2.setString(2,request.getParameter("name"));
		ps2.setString(3,request.getParameter("pw"));
		ps2.setString(4,request.getParameter("add"));
		ps2.setString(5,request.getParameter("tel"));
		ResultSet rs2 = ps2.executeQuery();
		%> <script type="text/javascript"> alert("회원가입 축하");
		location.href="quiz101.jsp";
		</script><%
		
	}else{
		%> <script type="text/javascript"> alert("비번 다름");
		location.href="regaster.jsp";
		</script><%
		
	}
	%>

</body>
</html>