<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="cust" class ="com.training.Customer"></jsp:useBean>
<jsp:setProperty property="customerId" name="cust" param="customerId"/>
<jsp:setProperty property="customerName" name="cust" param="customerName"/>
<jsp:setProperty property="customerAddress" name="cust" param="customerAddress"/>
<jsp:setProperty property="billAmount" name="cust" param="billAmount"/>

Customer ID:<jsp:getProperty property="customerId" name="cust"/><br>
Customer Name:<jsp:getProperty property="customerName" name="cust"/><br>
Customer Address:<jsp:getProperty property="customerAddress" name="cust"/><br>
Bill Amount:<jsp:getProperty property="billAmount" name="cust"/>
<body>

</body>
</html>