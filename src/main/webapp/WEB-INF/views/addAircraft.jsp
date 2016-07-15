<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add Aircraft</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<f:form class="form-horizontal" commandName="ac" action="/cs544/aircraft" method="post">
			<fieldset>

				<!-- Form Name -->
				<legend>Add Aircraft Form</legend>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="aircraft Number">Aircraft Number</label>  
					<div class="col-md-4">
						<f:input id="aircraftNumber" path="aircraftNumber" name="aircraftNumber" type="text" placeholder="" class="form-control input-md" required="" value=""/>

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="callSign">Call Sign</label>  
					<div class="col-md-4">
						<f:input id="callsign" path="callSign" name="callSign" type="text" placeholder="" class="form-control input-md" required="" value="${ac.callSign}" />
					</div>
				</div>

				<!-- Select Basic -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="aircraftType">Aircraft Type</label>
					<div class="col-md-4">
						<f:select id="aircrafttype" path="aircraftType" name="aircraftType" class="form-control" value="${ac.aircraftType}">
							<option value="SingleEngine">Single Engine</option>
							<option value="MultiEngine">Multi Engine</option>
						</f:select>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="airworthyDate">Airworthy Date</label>  
					<div class="col-md-4">
						<f:input id="airworthydate" path="airworthyDate" name="airworthyDate" type="date" placeholder="" class="form-control input-md" required="" value="${ac.airworthyDate}"  />
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="nextInspectionDate">Next Inspection Date</label>  
					<div class="col-md-4">
						<f:input id="nextInspectionDate" path="nextInspectionDate" name="nextInspectionDate" type="date" placeholder="" class="form-control input-md" required="" value="${ac.nextInspectionDate}"  />
					</div>
				</div> 
				<!-- Register Button -->
				<div class="form-group">
				<label class="col-md-4 control-label" ></label>
					<div class="col-md-8">
						<f:button id="addaircraft" class="btn btn-success">Add Aircraft</f:button>
						<a href="engineerMain" 	class="btn btn-danger"> Cancel</a>
					</div>
				</div>
			</fieldset>
		</f:form>

	</div>
</body>
</html>