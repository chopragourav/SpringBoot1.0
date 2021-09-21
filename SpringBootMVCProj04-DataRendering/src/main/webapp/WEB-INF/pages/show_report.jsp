<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--  <h1 style="color: red;text-align: center;">Show Input Values</h1>

<b>Name : ${name}</b><br>
<b>Age : ${age}</b><br>
<b>Address : ${addr}</b><br>
--%>

<%-- <h1 style="color: red;text-align: center;">Show Arrays, Set, List, Map</h1>

<b>Name(Arrays) : </b>
<br>
<c:forEach var="names" items="${nickNames}">
${names}<br>
</c:forEach>
<hr>

<b>Mobiles(Set) : </b>
<br>
<c:forEach var="ph" items="${mobile}">
${ph}<br>
</c:forEach>
<hr>

<b>Courses(List) : </b>
<br>
<c:forEach var="course" items="${courses}">
${course}<br>
</c:forEach>
<hr>

<b>Ids(List) : </b>
<br>
<c:forEach var="id" items="${ids}">
${id.key} ===> ${id.value}<br>
</c:forEach>
<hr>--%>


<h1 style="color: red; text-align: center;">Reading List of Model
	Object</h1>
<br>
<table border="1" align="center">
	<tr>
		<th>Eno</th>
		<th>Ename</th>
		<th>Desg</th>
		<th>Salary</th>
	</tr>
	<c:forEach var="emp" items="${empsInfo}">
		<tr>
			<td>${emp.Eno}</td>
			<td>${emp.Ename}</td>
			<td>${emp.Desg}</td>
			<td>${emp.Salary}</td>
		</tr>
	</c:forEach>
</table>