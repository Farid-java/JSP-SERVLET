<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Exception is comming from NewPage.jsp -->

<!-- Exception handling code -->
<h1><% exception.printStackTrace(response.getWriter()); %></h1>

</body>
</html>