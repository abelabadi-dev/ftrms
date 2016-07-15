<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Maintenance Dashboard.</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="style/app.css">
</head>
<body>

	<div class="container">
		<div class="page-header">
			<h1>Welcome Engineer. <small>aircraft status here.</small></h1>
		</div>
		<div class="aside">
			<div class="list-group">
				<a href="aircraft" class="list-group-item"> Add new Aircraft. </a>
					<th><c:url value="/logout" var="logoutUrl" />
						<form id="logout" action="${logoutUrl}" method="post">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form> <c:if test="${pageContext.request.userPrincipal.name != null}">
							<a href="javascript:document.getElementById('logout').submit()">Logout</a>
						</c:if>
				<!-- <a href="studentRegistrationForm.html" class="list-group-item ">Register Student Pilot</a>
				<a href="maintenanceRegistrationForm.html" class="list-group-item">Register Maintenance Eng.</a> -->
			</div>
		</div>
		<div class="panel panel-primary">
			<div class="panel-heading">
				Aircraft List
				
			</div> 
			<div class="panel-body"> 
				<p>Update and Delete Aircarft</p> </div>  
							<table class="table">
				<thead>
					<tr>
						<th>fDate</th>
						<th>Callsign</th>
						<th>Departure</th>
						<th>Arrival</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${ac}">
		                <tr>
		                	<td>${a.aircraftNumber}</td>
		                	<td>${a.callSign}</td>
		                    <td>${a.aircraftType}</td>
		                    <td>${a.airworthyDate}</td>
		                    <td>${a.nextInspectionDate}</td>
			                  
		                </tr>
		            </c:forEach>
				</tbody>
			</table>
</div>
</div>

</body>
</html>