<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<form action = "Customer.jsp" method = "POST">
<label for="customerId">customerId:</label><br>
<input type="text" id="customerId" name="customerId"><br>

<label for="customerName">customerName:</label><br>
<input type="text" id="customerName" name="customerName"><br>

<label for="customerUsername">customerUsername:</label><br>
<input type="text" id="customerUsername" name="customerUsername"><br>

<label for="customerPassword">customerPassword:</label><br>
<input type="text" id="customerPassword" name="customerPassword"><br>

<label for="customerEmail">customerEmail:</label><br>
<input type="text" id="customerEmail" name="customerEmail"><br>

<label for="customerPhone">customerPhone:</label><br>
<input type="text" id="customerPhone" name="customerPhone"><br>

<input type="submit" value="Submit">
</form>

 

</body>
</html>