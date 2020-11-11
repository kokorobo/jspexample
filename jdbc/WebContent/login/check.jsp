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
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@192.168.0.46:1521:xe";
	String id = "java" ,pwd ="1234";
	Connection con = DriverManager.getConnection(url, id, pwd);
	String sql = "select * from student where stunum = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,request.getParameter("id"));
	ResultSet rs = ps.executeQuery();
	String chkpw = null;
	String id2 = null;
	String name2=null;
	while(rs.next()){
		id2 = rs.getString("stunum");
		chkpw = rs.getString("kor");
		name2 =rs.getString("name");
	}
	
	if(request.getParameter("pw").equals(chkpw)){
		
		session.setAttribute("id", id2);
		String heer= name2+"님 어서와";
		%> <script type="text/javascript"> alert("<%= name2 %>"+"어서와");
		location.href="quiz101.jsp";
	</script><% 
	}else if(chkpw == null){
		%> <script type="text/javascript"> alert("아디 틀림");
				location.href="login.jsp";
		</script><% 
	}else{
		%> <script type="text/javascript"> alert("비번 틀림");
		location.href="login.jsp";
		</script><% 
	}
	%> <br>



</body>
</html>