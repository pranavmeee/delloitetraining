<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>

<% int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
%>
<h3><%="Addition: "+(num1+num2) %></h3>



<!-- <h3><%= "Subtraction: "+(num1-num2)%></h3>
<h3><%= "Multiplication: "+(num1*num2)%></h3>
<h3><%= "Division: "+(num1/num2)%></h3>-->


</body>
</html>