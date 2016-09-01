<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
	<link href="<c:url value="/resources/css/register.css" />" rel="stylesheet">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>	
<title>Registration</title>

<script>
$(function(){
	$("#dateOfBirth").datepicker();
})(jquery);
</script>
</head>
<body>
<div class="main_container">
	<div class="contain"><h2>Register New User</h2></div>
	<div class="container">
						<form action="<spring:url value="/user/registration"></spring:url>" method="post" modelAttribute="userInfo">
							<fieldset>
								<form:errors path="*" cssStyle="color : red;" /> 
						       <form:errors path="firstName" cssStyle="color : red;" /> 
								<div class="form-group">
									<label class="control-label" for="name">First Name</label>
										<input class="form-control" placeholder="First Name"
											name='firstName' type="text" />
							
								</div>
					
								<div class="form-group">
									<label class="control-label" for="name">Last Name </label>
										<input class="form-control" placeholder="Last Name"
											name='lastName' type="text" />
								</div>
								
								<div class="form-group">
									<label class="control-label" for="dateOfBirth">DOB </label>
	
										<input class="form-control" placeholder="mm/dd/yyyy"
											name="dateOfBirth" id="dateOfBirth" type="text" />
							
								</div>
								<div class="form-group">
									<label class="control-label" for="name">User
										Name</label>
					
										<input class="form-control" placeholder="User Name"
											name='credentials.username' type="text">

								</div>
								<div class="form-group">
									<label class="control-label" for="name">Password</label>
			
										<input class="form-control" placeholder="Password"
											name='credentials.password' type="password" value="">
				
								</div>
								<div class="form-group">
									<label class="control-label" for="name">Re
										type password </label>

										<input class="form-control"
											placeholder="Re-type password" name='credentials.verifyPassword'
											type="password" value="">
			
								</div>
								<div class="form-group">
								<input class="btn btn-primary btn-mini" type="submit"
									value="Register">
									
									<a href="<spring:url value="/welcome"></spring:url>" class="btn btn-primary btn-mini" role="Cancel">Cancel</a>
									</div> 
							</fieldset>
						</form>
						</div>
</div>
</body>