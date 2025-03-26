<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String a,b,c,d;
a=request.getParameter("t1");
b=request.getParameter("t2");
c=request.getParameter("t3");
d=request.getParameter("t4");


Class.forName("org.postgresql.Driver");
Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","rajeshwari123");

PreparedStatement ps=  con.prepareStatement("insert into Student1 (susername,semail,spass,scpass)values('"+a+"','"+b+"','"+c+"','"+d+"')");

if(c.equals(d))
{
	

ps.executeUpdate();
out.println(" <script>");
out.println("alert('Registration Succesfull')");
out.println("window.location.href='display.jsp'");
out.println(" </script>");

}
else
{
	out.println(" <script>");

	out.println(" alert('password does not matched')");
	out.println("window.location.href='reg.html'");
	out.println(" </script>");


}
%>

</body>
</html>