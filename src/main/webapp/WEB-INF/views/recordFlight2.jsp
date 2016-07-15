<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Flight Record Form</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form:form class="form-horizontal" commandName="flight" action="recordFlight" method="post">
			<fieldset>

				<!-- Form Name -->
				<legend>Flight Recording Form</legend>

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
					<label class="col-md-4 control-label" for="textinput">Take off Time</label>  
					<div class="col-md-2">
						<input path="flightDate" id="takeOffDate" name="takeOffDate" type="date"  class="form-control input-md" required=""/>

					</div>
					<div class="col-md-2">
						<input path="takeoffTime" id="takeOffTime" name="takeOffTime" type="time"  class="form-control input-md" required=""/>

					</div>
				</div>
				<!-- Landing Time-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Landing Time</label> 
					<div class="col-md-2">
						<input  path="flightDate"  id="landingDate" name="landingDate" type="date"  class="form-control input-md" required=""/>

					</div> 
					<div class="col-md-2">
						<input path="landingTime" id="landingTime" name="landingTime" type="time"  class="form-control input-md" required=""/>

					</div>
				</div>
				<!-- Select Flight Type -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Flight Type</label>
					<div class="col-md-4">
						<form:select path="flightType" id="flightType" name="flightType" class="form-control">
							<option value="1">Cross Country</option>
							<option value="2">International</option>
							<option value="3">Visual Flight Route</option>
						</form:select>
					</div>
				</div>
				<!-- Select Instructor Type -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Instructor Type</label>
					<div class="col-md-4">
						<form:select path="instructionType" id="instructionType" name="instructionType" class="form-control">
							<option value="1">Dual Flight</option>
							<option value="2">Solo Flight</option>
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
						<form:input path="numberOfTakeOffs" id="numberOfTakeOff" name="numberOfTakeOff" type="number" placeholder="# Take Off" class="form-control input-md" required=""/>

					</div>
				</div>
				<!-- AirCraft Status -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="radios">Aircraft Status</label>
					<div class="col-md-4"> 
												
						<form:select path="aircraftStatus" id="aircraftStatus" name="aircraftStatus" class="form-control">
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
						<button id="registerBtn" name="registerBtn" class="btn btn-danger">Cancel</button>
					</div>
				</div>
			</fieldset>
		 </form:form>

	</div>
	<script   src="https://code.jquery.com/jquery-3.1.0.min.js"   integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="   crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</body>
</html>