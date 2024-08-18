<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    <%@ page import= "java.util.Scanner" %>
 <%@ include file="insert.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- scriplet --%>
<b>
<% 
out.print(new java.util.Date());
%>
</b>

<%-- expression --%>

<h1>
<%= new java.util.Date()  %>
</h1>

<%-- declaration --%>
<%! String name = "Gaurav";  %>

Welcome
<h2>
	<%= name  %>
</h2>


<%-- <%
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();


--%> 
<h1>Implicit objects</h1>
<h2>2.) request</h2>

<form >  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  

<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  



<h1>Implicit objects</h1>
<h2>2.) response</h2>

<form action="index.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go" name="goButton"><br/>  
</form>  
<%  
if(request.getParameter("goButton")!= null) {
 
response.sendRedirect("insert.jsp");  

}
%>

</body>
</html>