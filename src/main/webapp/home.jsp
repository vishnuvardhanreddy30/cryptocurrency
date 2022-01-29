<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<form action="fetchCryptocurrency" align="center">

		<table align="center">
			<tr>
				<th><select name="currency" id="currency" required
					class="form-control">
						<option value="">select</option>
						<option value="cryptocurrency">Cryptocurrency</option>
				</select></th>
			<tr>
				<td><br><input type="text" id="ipAddress" name="ipAddress"
					placeholder="IPAddress" class="form-control"></td>
				<td><label>(Optional)</label></td>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>