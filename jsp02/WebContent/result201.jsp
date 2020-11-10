<%@page import="java.util.Enumeration"%>
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
	request.setCharacterEncoding("utf-8");
	
	Enumeration paramEunm = request.getParameterNames();
	
	String[] chk = request.getParameterValues("season");
	String name2 = request.getParameter("name");
	String gender2 = request.getParameter("gender");
	while(paramEunm.hasMoreElements()){
		String n = (String)paramEunm.nextElement();
		switch(n){
		case "name": out.print(n+" : "+name2+"<br>"); break;
		case "gender": out.print(n+" : "+gender2+"<br>"); break;
		case "season":{
			if(chk != null){
				for(String s:chk){
					out.print(n+" : "+s+"<br>");
				}
		}
	}
	}
	}
	%>
</body>
</html>