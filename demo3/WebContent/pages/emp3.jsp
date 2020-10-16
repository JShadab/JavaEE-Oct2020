<!DOCTYPE html>
<%@page import="bean.Emp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp JSP</title>
</head>
<body>

	<h1>Emp3</h1>


	<jsp:useBean id="EMP" class="bean.Emp" scope="request" />

	Your Name:
	<jsp:getProperty property="name" name="EMP" />
	<br> Your Age:
	<jsp:getProperty property="age" name="EMP" /><br> 
	Your Salary:
	<jsp:getProperty property="salary" name="EMP" /><br>
	Your Dog's Name:
    <jsp:getProperty property="dog" name="EMP" /><br>


</body>
</html>