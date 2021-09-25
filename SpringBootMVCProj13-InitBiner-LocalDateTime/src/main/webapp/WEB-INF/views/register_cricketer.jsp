<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form modelAttribute="cktr">
	<table border="0" bgcolor="grey" align="center">
		<p style="color: red;">
			<form:errors path="*" />
		</p>
		<tr>
			<td>Cricketer Name</td>
			<td><form:input path="cName" /></td>
		</tr>
		<tr>
			<td>Cricketer Type</td>
			<td><form:input path="cType" /></td>
		</tr>
		<tr>
			<td>Cricketer Date of Birth</td>
			<td><form:input path="dob" type="date" /></td>
		</tr>
		<tr>
			<td>Cricketer Time of Birth</td>
			<td><form:input path="tob" type="time" /></td>
		</tr>
		<tr>
			<td>Cricketer Debue Date and Time</td>
			<td><form:input path="doj" type="datetime-Local" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
			<td><input type="reset" value="Reset" /></td>
		</tr>
	</table>
</form:form>
