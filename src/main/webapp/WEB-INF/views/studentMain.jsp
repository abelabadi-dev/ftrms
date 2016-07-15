<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome student.</title>
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
				Welcome student <small><c:url value="/logout"
						var="logoutUrl" />
					<form id="logout" action="${logoutUrl}" method="post">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form> <c:if test="${pageContext.request.userPrincipal.name != null}">
						<a href="javascript:document.getElementById('logout').submit()">Logout</a>
					</c:if></small>
			</h1>
		</div>
		<div class="panel panel-primary">
			<div class="panel-heading">
				Record List
				<form class="navbar-form navbar-right top-margin" role="search">
					<div class="form-group">
						<input type="text" name="search" class="form-control"
							placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">search
						record</button>
				</form>
			</div>
			<div class="panel-body">
				<p>Go through your reports here.</p>
			</div>
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
					<c:forEach var="flight" items="${flights}">
		                <tr>
		                	<td>${flight.flightDate}</td>
		                	<td>${flight.studentPilot.callSign}</td>
		                    <td>${flight.departureAirport}</td>
		                    <td>${flight.arrivalAirport}</td>
		                    
			                  
		                </tr>
		            </c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>