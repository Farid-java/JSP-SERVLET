<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="jspUseBean.jsp" method="post">
<table>
<tr>
<td>Id <input type="text"  name="id"> </td>
</tr>
<tr>
<td>Name<input type="text"  name="name"> </td>
</tr>
<tr>
<td>Password <input type="text"  name="pass"> </td>
</tr> 
<tr>
<td>
<input type="submit"  value="submit">
</td>
</tr>
</table>
</form>

<%-- <jsp:useBean id="bean"  class="com.jsp_use_bean_model.JspUseBean" scope="application"></jsp:useBean>
 <jsp:setProperty property="*" name="bean"/> --%>
 
</body>
</html>