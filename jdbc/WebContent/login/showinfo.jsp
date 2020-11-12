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
<h1>회원 정보 수정 및 삭제</h1>
	<%
	String id3 = (String)session.getAttribute("id");
	out.print(id3);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@192.168.0.46:1521:xe";
	String id = "java" ,pwd ="1234";
	Connection con = DriverManager.getConnection(url, id, pwd);
	String sql = "select * from student where stunum = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id3);
	ResultSet rs = ps.executeQuery();
	String chkpw = null;
	String id2 = null;
	String name2=null;
	String add2=null;
	String tel2=null;
	while(rs.next()){
		id2 = rs.getString("stunum");
		chkpw = rs.getString("kor");
		name2 = rs.getString("name");
		add2 = rs.getString("eng");
		tel2 = rs.getString("math");
	}
	%>
	<form action="modifyinfo.jsp" method = "get">
	<input type="text" name="id" value="<%=id2%>"><br>
	<input type="text" name="pw" value="<%=chkpw%>"><br>
	<input type="text" name="name" value="<%=name2%>"><br>
	<input type="text" name="add" value="<%=add2%>"><br>
	<input type="text" name="tel" value="<%=tel2%>"><br>
	<input type="submit" value="수정">
	<input type="button" onclick='location.href="showinfo.jsp"' value='취소'>
	</form>

</body>
</html>