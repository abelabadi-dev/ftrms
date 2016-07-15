<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Reporting</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="resources/style/app.css">
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>
				Admin page: <small>Manage FTMS users. |
					<th><c:url value="/logout" var="logoutUrl" />
						<form id="logout" action="${logoutUrl}" method="post">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form> <c:if test="${pageContext.request.userPrincipal.name != null}">
							<a href="javascript:document.getElementById('logout').submit()">Logout</a>
						</c:if></th>
				</small>
			</h1>
		</div>
		<div>
			<div class="list-group">
				<a href="addIP" class="list-group-item"> Register Instructor
					Pilot </a> <a href="addSP" class="list-group-item ">Register
					Student Pilot</a> <a href="addME" class="list-group-item">Register
					Maintenance Eng.</a>
			</div>
		</div>
		<div>
			<div class="panel panel-primary">
				<div class="panel-heading">Student Pilot List</div>
				<div class="panel-body">
					<p>Update user information here.</p>
				</div>
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
							<td><a href="editSP/${item.id}" role="button">Update</a></td>
							<td><a href="deleteSP?id=${item.id}" role="button">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>

			<div class="panel panel-primary">
				<div class="panel-heading">Instructor Pilot List</div>
				<div class="panel-body">
					<p>Update user information here.</p>
				</div>
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



						</tr>
					</thead>
					<c:forEach var="item" items="${ipList}">
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

							<td><a href="editSP/${item.id}" role="button">Update</a></td>
							<td><a href="deleteIP?id=${item.id}" role="button">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

	</div>
</body>
</html>