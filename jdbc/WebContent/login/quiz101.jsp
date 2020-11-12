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
	<style type="text/css">
	table tr{ border: 1px solid black;}
	table th{ border: 1px solid black;}
	table td{ border: 1px solid black;}
	</style>
	
</head>
<body>
	<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@192.168.0.46:1521:xe";
		String id = "java" ,pwd ="1234";
		Connection con = DriverManager.getConnection(url, id, pwd);
		String sql = "select * from student";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		%>
		<table style="border: 1px solid black;">
		<tr><th>학번</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th></tr>
		
	<% 
		while(rs.next()){
			%><tr><td><%
			out.print(rs.getString("stunum")+"\t");
			%></td><td><% 
			out.print(rs.getString("name")+"\t");
			 %></td><td><%
			out.print(rs.getString("kor")+"\t");
			 %></td><td><% 
			out.print(rs.getString("eng")+"\t");
			 %></td><td><% 
			out.print(rs.getString("math")+"<br>");
			 %></td></tr><% 
		}
	%>
</table>

<input type="button" onclick='location.href="login.jsp"' value="로그아웃"> 
<input type="button" onclick='location.href="showinfo.jsp"' value="회원정보">


</body>
</html>