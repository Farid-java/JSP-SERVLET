<%@page import="com.jsp_use_bean_model.JspUseBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="bean"  class="com.jsp_use_bean_model.JspUseBean"></jsp:useBean>
 <jsp:setProperty property="*" name="bean" />
 
 <hr />
 Welcome
 <jsp:getProperty property="name" name="bean"/>
 <jsp:getProperty property="pass" name="bean"/>
 
 <% JspUseBean bean1=new JspUseBean();
 out.println(bean1);
 %>
</body>
</html>