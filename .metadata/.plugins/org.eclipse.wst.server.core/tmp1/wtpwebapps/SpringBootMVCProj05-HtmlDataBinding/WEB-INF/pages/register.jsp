<%@ page isELIgnored="false"%>

<h1 style="color: red; text-align: center;">Registration Form</h1>

<form method="POST">

	<table align="center">
		<tr>
			<td>Employee Number :</td>
			<td><input type="number" name="eno"></td>
		</tr>
		<tr>
			<td>Employee Name :</td>
			<td><input type="text" name="ename"></td>
		</tr>
		<tr>
			<td>Employee Address :</td>
			<td><input type="text" name="eaddr"></td>
		</tr>
		<tr>
			<td>Employee Salary :</td>
			<td><input type="text" name="salary"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
	</table>

</form>