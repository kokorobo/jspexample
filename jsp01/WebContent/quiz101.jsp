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
	String kk = "JSP";
	%>
	<h1><%out.print(kk); %> 시작 입니다.</h1><br>
	<h1><%out.print(kk);%> 끝 입니다.</h1><br>
	<hr>
	<%= kk %>
	<hr>
	<%
	int fr = 10;
	int nd = 20;
	%>
	<%= fr %>+<%= nd %>=<%= fr+nd %>
	<hr>
 	<%  int hol = 0;
		int jjag = 0;
		int sum = 0;
	
		for(int i=1 ; i<=100 ;i++){
			if(i%2 == 0){jjag += i;}
			else {hol += i;}
			sum += i;
		}
	%>
	
	
	1+2+3+...+100 = <%=sum %><br>
	1~100 까지의 짝수의 합 = <%=jjag %><br>
	1~100 까지의 홀수의 합 = <%=hol %><br>
	

	
	<%! int cnt01 =0; %>
	<%= cnt01++ %>
</body>
</html>