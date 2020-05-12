<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BACANATOR</title>
<style type="text/css">
p {
	color: navy;
}

table {
	padding: 1;
	color: green;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Bacanator</h1>
		<h2>...to be in love with bacon</h2>
		<hr />
		<h4>Main Attributes:</h4>
	</div>
	<b> runId : ${BACON.runld}<br /> start&nbsp;&nbsp; : ${BACON.start}<br />
		end&nbsp;&nbsp;&nbsp;&nbsp; : ${BACON.end}<br />
	</b>
	<hr />

	<h4 align="center">Items:</h4>
	<c:forEach var="temp" items="${BACON.items}">
		<div align="center">
			<table border="2">
				<tr>
					<td align="center">Start : ${temp.start}</td>
				</tr>
				<tr>
					<td align="center">End :&nbsp; ${temp.end}</td>
				</tr>
				<tr>
					<td align="center">Duration : ${temp.duration}</td>
				</tr>
			</table>
		</div>
		<p>Data: ${temp.data}</p>
		<br />



	</c:forEach>
	<br />

</body>

</html>