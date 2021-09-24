<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<form:form id="form" action="customer_register" modelAttribute="cust">
	<table align="center" bgcolor="grey">
		<tr>
			<td>Customer Name</td>
			<td><form:input path="cname" /></td>
		</tr>
		<br>
		<script language="JavaScript">
			function sendReqForStates() {
				form.action = "states";
				form.submit();
			}
			function sendReqForDistrict() {
				form.action = "district";
				form.submit();
			}
			function sendReqForBlocks() {
				form.action = "blocks";
				form.submit();
			}
		</script>
		<tr>
			<td>Select Country</td>
			<td><form:select path="country" onchange="sendReqForStates()">
					<form:options items="${countriesInfo}" />
				</form:select></td>
		</tr>
		<br>
		<tr>
			<td>Select State</td>
			<td><form:select path="state" onchange="sendReqForDistrict()">
					<form:options items="${statesList}" />
				</form:select></td>
		</tr>
		<br>
		<tr>
			<td>Select District</td>
			<td><form:select path="dist" onchange="sendReqForBlocks()">
					<form:options items="${districtList}" />
				</form:select></td>
		</tr>
		<br>
		<tr>
			<td>Select Block</td>
			<td><form:select path="block">
					<form:options items="${blockList}" />
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