<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="fetchCryptocurrency">
		<select name="currency" id="currency">
			<option value="select">select</option>
			<option value="cryptocurrency">Cryptocurrency</option>
		</select> <br> <br> 
		<input type="text" id="ipAddress" name="ipAddress" placeholder="IPAddress">
		<span> (Optional)</span> 
		<br> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>