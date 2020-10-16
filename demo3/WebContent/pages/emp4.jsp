<!DOCTYPE html>
<%@page import="bean.Emp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp JSP</title>
</head>
<body>

	<h1>Emp4</h1>




	Your Name:${EMP.name}
	<br> Your Age:${EMP.age}
	<br> Your Salary: ${EMP.salary}
	<br> Your Dog's Name: ${EMP.dog.dogName}
	<br>


</body>
</html>