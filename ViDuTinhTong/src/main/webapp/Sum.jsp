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
	//Lay gia tri tham so tu URL
	// http://localhost:8080/Sum.jsp?a=5&b=3
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	out.println("Tong cua " + a + " va " + b + " la: " + (a + b));
	%>
</body>
</html>