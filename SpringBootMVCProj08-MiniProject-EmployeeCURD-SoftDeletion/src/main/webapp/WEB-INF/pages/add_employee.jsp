<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center;">Add Employee</h1>

<form:form modelAttribute="emp">
	<table bgcolor="cyan" align="center">
		<tr>
			<td>Employee Name</td>
			<td><form:input path="ename" /></td>
		</tr>
		<tr>
			<td>Employee Desg</td>
			<td><form:input path="job" /></td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td><form:input path="sal" /></td>
		</tr>
		<tr>
			<td>Employee DeptNo</td>
			<td><form:input path="deptno" /></td>
		</tr>
		<tr>
			<td><input type="image" src="images/submit.png" width="100"
				height="100" /></td>
			<td><button type="submit">
					<img src="images/reset.png" width="100" height="100" />
				</button></td>
		</tr>
	</table>
</form:form>