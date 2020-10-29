<%@page import="com.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="True"  	errorPage="exceptionHandlingInJsp.jsp"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Register register=(Register) session.getAttribute("data"); %>
<h1><%=register.getEmail() %></h1>

<a href="logout">Logout</a>
</body>
</html>