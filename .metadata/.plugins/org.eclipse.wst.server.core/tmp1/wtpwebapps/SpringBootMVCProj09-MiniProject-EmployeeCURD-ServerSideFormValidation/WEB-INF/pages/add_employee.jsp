<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center;">Add Employee</h1>

<script type="text/javascript" src="myjs/validation_file.js">
	
</script>

<form:form modelAttribute="emp" onsubmit="return validate(this)">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Employee Name</td>
			<td><form:input path="ename" /> <form:errors path="ename"
					cssStyle="color:red" /> <span id="nameError" style="color: red;"></span></td>
		</tr>
		<tr>
			<td>Employee Desg</td>
			<td><form:input path="job" /> <form:errors path="job"
					cssStyle="color:red" /><span id="jobError"
				style="color: red;"></span></td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td><form:input path="sal" /> <form:errors path="sal"
					cssStyle="color:red" /><span id="salError"
				style="color: red;"></span></td>
		</tr>
		<tr>
			<td>Employee DeptNo</td>
			<td><form:input path="deptno" /> <form:errors path="deptno"
					cssStyle="color:red" /><span id="deptnoError" style="color: red;"></span></td>
		</tr>
		<tr>
			<td><input type="image" src="images/submit.png" width="100"
				height="100" /></td>
			<td><input type="reset" value="Reset" /></td>
		</tr>
		<tr>
			<td><form:hidden path="vflag" /></td>
		</tr>
	</table>
</form:form>