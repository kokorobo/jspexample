<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>fileFormOk.jsp<br>
	<%
		String path = application.getRealPath("fileUpDown");
	out.print("path : " +path);
	int size = 1024*100;
	String file = ""; String oriFile="";
	MultipartRequest multi = new MultipartRequest(request, path, size, "utf-8", new DefaultFileRenamePolicy());
	file = multi.getOriginalFileName("file");
	oriFile = multi.getOriginalFileName("file");
	out.print("저장될파일이름 : "+file);
	out.print("저장된파일이름 : "+oriFile);
	response.sendRedirect("fileForm.jsp");
	%>

</body>
</html>