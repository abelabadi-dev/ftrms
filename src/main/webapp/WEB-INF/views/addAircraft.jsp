<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="sp" action="/addStudentPilots" method="post">
		<table>
			<tr>
				<td>Air Craft Number:</td>
				<td><input type="text" name="aircraftNo" /></td>
			</tr>
			<tr>
				<td>Call Sign:</td>
				<td><input type="text" name="aircraftNo" /></td>
			</tr>
			<tr>
				<td>Aircraft Type:</td>
				<td><select name="aircraftType">
						<option value="singleEngine">Single Engine</option>
						<option value="doubleEngine">Double Engine</option>
				</select></td>
			</tr>
			<tr>
				<td>AirWorthy Date:</td>
				<td><input type="text" name="aircraftNo" /></td>
			</tr>

			<tr>
				<td>Next Inspection Date:</td>
				<td><input type="text" id="nextInspectionDate"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>