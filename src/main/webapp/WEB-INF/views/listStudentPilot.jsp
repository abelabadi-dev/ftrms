<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<title>Your Student Records</title>
</head>
<body>
	<div class="container">
		<h1>Student Records</h1>
		<table class="table">
			<thead>
				<tr>

					<th>First Name</th>
					<th>Last Name</th>
					<th>Gender</th>
					<th>DateBirth</th>
					<th>Address</th>
					<th>Call Sign</th>
					<th>License No</th>
					<th>Medical License</th>
					<th>Medical Exp. Date</th>
					<th>Training Type</th>
					<th>Batch</th>
					<th>Status</th>
					
					<th><a href="j_spring_security_logout">logout</a></th>
				</tr>
			</thead>
			<c:forEach var="item" items="${spList}">
				<tr>
					<td>${item.firstName}</td>
					<td>${item.lastName}</td>
					<td>${item.gender}</td>
					<td>${item.dateofBirth}</td>
					<td>${item.address}</td>
					<td>${item.callSign}</td>
					<td>${item.licenseNo}</td>
					<td>${item.medicalLicenseNo}</td>
					<td>${item.medicalLicenseExpiryDate}</td>
					<td>${item.trainingType}</td>
					<td>${item.batch}</td>
					<td>${item.status}</td>
					<td><a href="editSP/${item.id}" class="btn btn-info"
						role="button">Update</a></td>
					<td><a href="deleteSP/${item.id}"
						class="btn btn-info" role="button">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

		<sec:authorize url="/addSP">
			<a href="addSP" class="btn btn-info" role="button"> Record
				New Student</a>
		</sec:authorize>


		<script src="https://code.jquery.com/jquery-3.1.0.min.js"
			integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="
			crossorigin="anonymous"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
			integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
			crossorigin="anonymous"></script>
	</div>

</body>
</html>