<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee login page</title>
</head>
<body>
	<fieldset>
		<legend>Welcome to Login page</legend>
		<h1>${msg}</h1>
		<form action="elogin.do" method="post">

			<table>
				<tr>
					<th>Id</th>
					<td><input type="text" name="eId"  pattern="[1-9]{1}[0-9]{2}" placeholder="Enter id" ></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="ePassword" placeholder="Enter password here"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<td><input type="submit" value="Login"></td>
				</tr>
				<tr>
					<td> <a
						href="http://localhost:8081/SocialManagementApp/ForgetPassword.jsp">Forget password</a>
					</td>
				</tr>
				<tr>
					<td>New Employee click <a
						href="http://localhost:8081/SocialManagementApp/ERegister.jsp">here</a>
					</td>
				</tr>
			</table>

		</form>
	</fieldset>
</body>
</html>