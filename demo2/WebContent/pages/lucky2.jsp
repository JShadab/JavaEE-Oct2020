<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
</head>
<body>

<%!
  int getLuckyNumber1() {

	java.util.Random rand = new java.util.Random();

	return rand.nextInt(10);
}

%>

	<%
		int x = getLuckyNumber1();
	%>

	Your Lucky2 Number is: <%=x%>

</body>
</html>