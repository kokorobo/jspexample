<%@page import="java.sql.ResultSet"%>
<%@page import="com.sun.net.httpserver.Authenticator.Result"%>
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
		String sql = "select * from newst";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		out.print("id\tname\tage<hr>");
		while(rs.next()){
			out.print(rs.getString("id")+"\t");
			out.print(rs.getString("name")+"\t");
			out.print(rs.getString("age")+"\t");
		}
	%>

</body>
</html>