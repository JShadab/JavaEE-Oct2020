

<!DOCTYPE html>

<%@page import="p3.LuckyNumber" language="java"  %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
</head>
<body>

	<%
		int x = LuckyNumber.getLuckyNumber();

	
	%>

	Your Lucky Number is:
	<%
		out.print(x);
	%>
	<br> OR
	<br> Your Lucky Number is:
	<%=x%>

</body>
</html>