<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Student Pilot</title>
</head>
<body>
	<form:form commandName="sp" action="/addStudentPilots" method="post">
	<table>
		<tr>
			<td>First Name:</td>
			<td><input type="text" name="firstName" /> </td>
			<td>Last Name:</td>
			<td><input type="text" name="lastName" /> </td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><input type="text" name="gender" /> </td>
			<td>Age:</td>
			<td><input type="text" name="age" /> </td>
		</tr>
		<tr>
			<td>Nationality:</td>
			<td><input type="text" name="nationality" /> </td>
			<td>Call Sign:</td>
			<td><input type="text" name="callSign" /> </td>
		</tr>
		<tr>
			<td rowspan=2>License No:</td>
			<td><input type="text" name="licenseNo" /> </td>
		</tr>
		<tr>
			<td>Medical License No:</td>
			<td><input type="text" name="medicalLicenseNo" /> </td>
			<td>Medical License Expiry Date:</td>
			<td><input type="text" name="medicalLicenseExpiryDate" /> </td>
		</tr>
		<tr>
			<td>Training Type:</td>
			<td><input type="text" name="trainingType" /> </td>
			<td>Batch:</td>
			<td><input type="text" name="batch" /> </td>
		</tr>
		<tr>
			<td>Status:</td>
			<td rowspan=2><input type="text" name="status" /> </td>
		</tr>
	</table>
	<input type="hidden"
	name="${_csrf.parameterName}"
	value="${_csrf.token}"/>
	<input type="submit"/>
	 </form:form>
</body>
</html>