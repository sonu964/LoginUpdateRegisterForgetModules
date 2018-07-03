<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password page</title>
</head>
<body>
	<fieldset>
		<legend>Welcome to Forget password page</legend>
		<h1>${msg}</h1>
		<form action="eloginforgetpassword.do" method="post">

			<table>
				<tr>
					<th>Email Id:</th>
					<td><input type="email" name="eEmail"  placeholder="Enter email-id here" required="required"></td>
				</tr>
				<tr>
					<th>New Password</th>
					<td><input type="password" name="NewPassword" placeholder="Enter new password here"> </td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<td><input type="submit" value="Change Password"></td>
				</tr>
				
			</table>

		</form>
	</fieldset>
</body>
</html>