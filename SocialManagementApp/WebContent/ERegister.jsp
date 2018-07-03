<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ERegister page</title>
</head>
<body>
	<fieldset>

		<legend>Employees Registration form</legend>

		<form action="eregister.do" method="post">

			<table>

				<tr>
					<th>Eid</th>
					<td><input type="text" name="eId" pattern="[1-9]{1}[0-9]{2}" placeholder="Enter employee id" required="required"></td>
				</tr>
				<tr>
					<th>Name</th>
					<!-- <td><input type="text" name="eName" maxlength="20" class="field" required pattern="[a-zA-Z0-9\s]+"  placeholder="Enter your name" required="required"></td> -->
					<td> <input type="text"  name="eName" maxlength="30" class="field" required pattern="[A-Z]{1}[a-z\s]{2,}[A-Z]{1}[a-z\s]{2,}[A-Z]{0,}[a-z\s]{2,}" required="required" /></td>
				</tr>
				<tr>
					<th>Gender</th>
					<td><input type="radio" name="eGender" value="Male" required="required">Male
						<input type="radio" name="eGender" value="Female" required="required">Female <input
						type="radio" name="eGender" value="Other" required="required">Other</td>
				</tr>
				<tr>
					<th>Mobile</th>
					<td><input type="text"  name="eMobile" pattern="[6-9]{1}[0-9]{9}" placeholder="Enter your mobile number" required="required"></td>
				</tr>
				<tr>
					<th>Email</th>
					
					<td><input type="email" name="eEmail" placeholder="Enter your email-id" required="required"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="ePassword" placeholder="Enter your own password" required="required"></td>
				</tr>
				<tr>
					<th>Address 1</th>
					<td><textarea rows="5" cols="35" name="eAddress" placeholder="Enter your address.." required="required"></textarea></td>
				</tr>
				<tr>
					<th>City</th>
					<td><input type="text" name="eCity"placeholder="Enter your city name" required="required"></td>
				</tr>
				<tr>
					<th>Pin</th>
					<td><input type="text" name="ePin" pattern="[1-9]{1}[0-9]{5}" placeholder="Enter your pin code" required="required"></td>
				</tr>
				<tr>
					<th>State</th>
					<td><input type="text" name="eState" placeholder="Enter your state name" required="required"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Register"></td>
				</tr>

			</table>

		</form>

	</fieldset>
</body>
</html>