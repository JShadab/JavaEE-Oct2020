<!DOCTYPE html>
<%@page import="bean.Emp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp JSP</title>
</head>
<body>

	<h1>Emp2</h1>

	<%
		Emp e = (Emp) request.getAttribute("EMP");
	%>

	Your Name:
	<%=e.getName()%><br> 
	Your Age:
	<%=e.getAge()%><br> 
	Your Salary:
	<%=e.getSalary()%><br>	
	Your Dog's Name:
	<%=e.getDog().getDogName()%><br>



</body>
</html>