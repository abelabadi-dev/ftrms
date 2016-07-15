<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Flight Record Form</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form:form modelAttribute="spc" class="form-horizontal" commandName="flight" action="recordFlight" method="post">

			<fieldset>

				<!-- Form Name -->
				<legend>Flight Recording Form</legend>


			<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Student Callsign</label>
					<div class="col-md-4">
						<form:select path="" id="spCallsign" name="spCallsign" class="form-control">
						<option value="${flight.studentPilot.callSign}">${flight.studentPilot.callSign}</option>
						 <c:forEach var="s" items="${sp}">
							<option value="${s}">${s}</option>
							</c:forEach>
						</form:select>
					</div>
				</div>
		<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Aircraft Callsign</label>
					<div class="col-md-4">
						<form:select path="" id="acCallsign" name="acCallsign" class="form-control">
							<option value="${flight.aircraft.callSign}">${flight.aircraft.callSign}</option>
						 <c:forEach var="a" items="${ac}">
							<option value="${a}">${a}</option>
							</c:forEach>
						</form:select>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Departured from</label>  
					<div class="col-md-4">
						<form:input path="departureAirport" id="departureFrom" name="departureFrom" type="text" placeholder="" class="form-control input-md" required=""/>

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Arrived To</label>  
					<div class="col-md-4">
						<form:input path="arrivalAirport" id="arrivedTo" name="arrivedTo" type="text" class="form-control input-md" required=""/>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Flight Date</label>  
					<div class="col-md-2">
					<form:input path="flightDate" id="takeOffDate" name="takeOffDate" type="date"  class="form-control input-md" required="" 
					 value="${flight.flightDate}"  />
					</div>
				</div>
				<!-- Landing Time-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Landing Time</label> 
					<div class="col-md-2">
					
					
					</div> 
					<div class="col-md-2">

					</div>
				</div>
				<!-- Select Flight Type -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Flight Type</label>
					<div class="col-md-4">
						<form:select path="flightType" id="flightType" name="flightType" class="form-control">
							<option value="${flight.flightType}">${flight.flightType}</option>
							<option value="CROSS_COUNTRY">Cross Country Flight</option>
							<option value="INSTRUMENT">Instrument Flight</option>
							<option value="VFR">Visual Flight Rule</option>
						</form:select>
					</div>
				</div>
				<!-- Select Instructor Type -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Instructor Type</label>
					<div class="col-md-4">
						<form:select path="instructionType" id="instructionType" name="instructionType" class="form-control">
							
							<option value="DUAL">Dual Flight</option>
							<option value="SOLO">Solo Flight</option>
						</form:select>
					</div>
				</div>
				<!-- number of flights & landing-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput"># of Landing & Take Off</label>  
					<div class="col-md-2">
						<form:input path="numberOfLandings" id="numberOfLanding" name="numberOfLanding" type="number" placeholder="# Landing" class="form-control input-md" required=""/>

					</div>
					<div class="col-md-2">
						<form:input path="numberOfTakeoffs" id="numberOfTakeOff" name="numberOfTakeOff" type="number" placeholder="# Take Off" class="form-control input-md" required=""/>

					</div>
				</div>
				<!-- AirCraft Status -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="radios">Aircraft Status</label>
					<div class="col-md-4"> 
												
						<form:select path="aircraftStatus" id="aircraftStatus" name="aircraftStatus" class="form-control">
							<option value="${flight.aircraftStatus}">${flight.aircraftStatus}</option>
							<option value="IN">IN</option>
							<option value="OUT">OUT</option>
						</form:select>
					</div>
				</div>
				<!-- Register Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="button1id"></label>
					<div class="col-md-8">
						<button id="button1id" name="button1id" class="btn btn-success">Register Flight</button>
						<a href="instructorMain" 	class="btn btn-danger"> Cancel</a>
					</div>
				</div>
			</fieldset>
		 </form:form>

	</div>
	<script   src="https://code.jquery.com/jquery-3.1.0.min.js"   integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="   crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</body>
</html>