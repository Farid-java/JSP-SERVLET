<%@page import="com.logincontroller.Login"%>
<%@page import="com.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 

<!--  USE OF COOKIES - fetch data from cookie -->
<%! String v; %>
<%  Cookie[] cookie= request.getCookies(); 
  for(Cookie c:cookie){
	  if(c.getName().equals("email")){
		  v=c.getValue();
	  }
  }

%>
<h1>Cookie=<%=v %></h1>

<!-- USE OF REQUEST OBJECT -->
<h1>Request=<%=request.getAttribute("Address1") %></h1>

<!-- USE OF SESSION -->
<%  Register o=(Register)session.getAttribute("data");
%>
<h2>Session=<%=o.getAddress2() %></h2>

<!-- USE OF APPLICATION(SERVLET_CONTEXT) -->
<h1>Servlet Context=<%=application.getAttribute("application") %></h1>


<!-- USE OF CONFIG BY USING SERVLET_CONTEXT -->
<h1>Config=<%=application.getAttribute("config") %></h1>


<!-- USE OF PAGE_CONTEXT -->
<% pageContext.setAttribute("pagecontext", o, pageContext.SESSION_SCOPE); %>
 
 <h1>PageContext=<%=pageContext.getAttribute("data", pageContext.SESSION_SCOPE) %></h1>

<hr />


<a href="newpage">new Page</a>
</body>
</html>