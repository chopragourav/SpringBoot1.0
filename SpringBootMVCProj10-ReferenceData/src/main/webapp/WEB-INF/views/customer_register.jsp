<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<form:form action="customer_register" modelAttribute="cust">
	<table align="center" bgcolor="grey">
		<tr>
			<td>Customer Name</td>
			<td><form:input path="cname" /></td>
		</tr>
		<br>
		<tr>
			<td>Select Country</td>
			<td><form:select path="country">
					<form:options items="${countriesInfo}" />
				</form:select></td>
		</tr>
		<br>
		<tr>
			<td>Select Languages</td>
			<td><form:select path="languages">
					<form:options items="${languagesInfo}" />
				</form:select></td>
		</tr>
		<tr>
			<td>Select Hobbies</td>
			<td><form:checkboxes items="${hobbiesInfo}" path="hb" /></td>
		</tr>
		<br>
		<tr>
			<td><input type="submit" value="Register" /></td>
			<td><input type="reset" value="Reset" /></td>
		</tr>
	</table>
</form:form>