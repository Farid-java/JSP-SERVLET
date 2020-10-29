<%@page import="com.jsp_use_bean_model.JspUseBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Use of JSP_INCLUDE -->
<jsp:include page="jspUseBeanIndex.jsp" />

<!-- Use of JSP_FORWARD -->
<jsp:forward page="index.jsp"></jsp:forward>
</head>
<body>
<!-- USE OF JSP_USE-BEAN -->
 <jsp:useBean id="bean"  class="com.jsp_use_bean_model.JspUseBean" scope="session"></jsp:useBean>
 <jsp:setProperty property="*" name="bean" />
 
 <hr />
 Welcome
 <jsp:getProperty property="name" name="bean"/><br>
 <jsp:getProperty property="pass" name="bean"/><br>
 <jsp:getProperty property="id" name="bean"/>
 
  
</body>
</html>