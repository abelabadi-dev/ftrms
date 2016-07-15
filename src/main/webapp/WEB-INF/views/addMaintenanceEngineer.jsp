<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Maintenance Engineer Registration Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form:form class="form-horizontal" commandName="me"
			action="/cs544/addME" method="post">
			<fieldset>

				<!-- Form Name -->
				<legend>Maintenance Engineer Registration Form</legend>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="firstName">First
						Name</label>
					<div class="col-md-4">
						<form:input path="firstName" type="text" placeholder=""
							class="form-control input-md" />

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="lastnameInput">Last
						Name</label>
					<div class="col-md-4">
						<form:input path="lastName" type="text" placeholder=""
							class="form-control input-md" required="" />

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="dateofBirth">Date
						of Birth</label>
					<div class="col-md-4">
						<form:input path="dateofBirth" type="text" placeholder=""
							class="form-control input-md" required="" />
					</div>
				</div>

				<!-- Select (inline) -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Gender">Gender</label>
					<div class="col-md-4">

						<form:select path="gender" size="1"
							style="width:196px; padding:5px;">
							<option value="male">Male</option>
							<option value="female">Female</option>

						</form:select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="lastnameInput">Address</label>
					<div class="col-md-4">
						<form:input path="address" type="text" placeholder=""
							class="form-control input-md" required="" />

					</div>
				</div>
				
				<!-- Register Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="registerbtn"></label>
					<div class="col-md-8">
						<form:button id="registerbtn" name="registerbtn"
							class="btn btn-success">Register Maintenance Engineer</form:button>
						<a href="admin" 	class="btn btn-danger"> Cancel</a>
					</div>
				</div>
			</fieldset>
		</form:form>

	</div>
	<script src="https://code.jquery.com/jquery-3.1.0.min.js"
		integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous"></script>
</body>
</html>