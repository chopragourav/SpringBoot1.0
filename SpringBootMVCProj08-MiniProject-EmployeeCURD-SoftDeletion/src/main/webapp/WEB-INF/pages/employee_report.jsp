<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty empsList}">
		<table bgcolor="grey" border="1" align="center">
			<tr bg-color="cyan">
				<th>eno</th>
				<th>ename</th>
				<th>desg</th>
				<th>sal</th>
				<th>deptNo</th>
				<th>status</th>
				<th>Operation</th>
			</tr>
			<c:forEach var="emp" items="${empsList}">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.sal}</td>
					<td>${emp.deptno}</td>
					<td>${emp.status}</td>
					<td><a href="edit_employee?eno=${emp.empno}"><img
							src="images/edit.png" width="50" height="50"></a>&nbsp;&nbsp; <a
						href="delete_employee?eno=${emp.empno}"
						onclick="confirm('Do you want to delete it?')"><img
							src="images/delete.png" width="50" height="50"></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center;">Record not Found</h1>
	</c:otherwise>
</c:choose>
<blink>
	<h1 style="color: green; text-align: center;">${resultMsg }</h1>
</blink>
<br>
<h4 style="text-align: center;">
	<a href="insert_employee"><img src="images/add.jpg" width="50"
		height="50"></a>
</h4>
<br>
<br>
<h4 style="text-align: center;">
	<a href="./"><img src="images/home.png" width="50" height="50"></a>
</h4>
