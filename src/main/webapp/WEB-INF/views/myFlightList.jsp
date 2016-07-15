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

<title>Your Flight Records</title>
</head>
<body>
	<div class="container">
		<h1>Flight Records</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Flight Date</th>
					<th>Student</th>
					<th>Aircraft</th>
					<th>Departure Airport</th>
					<th>Destination Airport</th>
					<th>Flight Type</th>
					<th>Instruction Type</th>
					<th>Number of Landings</th>
					<th>Number of Takeoffs</th>
					<th>Aircraft Status</th>
					<th><c:url value="/logout" var="logoutUrl" />
						<form id="logout" action="${logoutUrl}" method="post">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form> <c:if test="${pageContext.request.userPrincipal.name != null}">
							<a href="javascript:document.getElementById('logout').submit()">Logout</a>
						</c:if></th>
				</tr>
			</thead>
			<c:forEach var="flight" items="${flights}">
				<tr>
					<td>${flight.flightDate}</td>
					<td>${flight.studentPilot.callSign}</td>
					<td>${flight.aircraft.callSign}</td>
					<td>${flight.departureAirport}</td>
					<td>${flight.arrivalAirport}</td>
					<td>${flight.flightType}</td>
					<td>${flight.instructionType}</td>
					<td>${flight.numberOfLandings}</td>
					<td>${flight.numberOfTakeoffs}</td>
					<td>${flight.aircraftStatus}</td>
					<td><a href="editFlight?id=${flight.id}" class="btn btn-info"
						role="button"> Edit This Flight</a></td>
					<td><a href="deleteFlight?id=${flight.id}"
						class="btn btn-info" role="button"> Delete Flight</a></td>
				</tr>
			</c:forEach>
		</table>

		<sec:authorize url="/recordFlight">
			<a href="recordFlight" class="btn btn-info" role="button"> Record
				New Flight</a>
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