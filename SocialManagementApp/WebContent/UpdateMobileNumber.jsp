<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update mobile number</title>
</head>
<body>

	<fieldset>

		<legend>This is update form for mobile number</legend>
		<form action="updatemobilenumber.do" method="post">
			${msg}
			<table>
				<tr>
					<th>Email</th>
					<td><input type="text" name="eEmail"></td>
				</tr>
				<tr>
					<th>Mobile No:</th>
					<td><input type="text" name="eMobile"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>

					<td><input type="submit" value="Update Mobile"></td>
				</tr>
			</table>

		</form>

	</fieldset>

</body>
</html>