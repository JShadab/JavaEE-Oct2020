<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp JSP</title>
</head>
<body>


<h1>Emp1</h1>

	Your Name:
	<%=request.getAttribute("NAME")%><br> 
	Your Age:
	<%=request.getAttribute("AGE")%><br>
	Your Salary:
	<%=request.getAttribute("SALARY")%><br>



</body>
</html>