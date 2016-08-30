<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Registration</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Welcome to VFC</h1>
			</div>
		</div>
	</section>
	<div class="container">
		<div class="row">
						<form action="<spring:url value="/registration"></spring:url>" method="post" modelAttribute="userInfo">
							<fieldset>
								<form:errors path="*" cssStyle="color : red;" /> 
						       <form:errors path="lastName" cssStyle="color : red;" /> 
								<div class="form-group">
									<label class="control-label col-lg-4" for="name">First Name</label>
									<div class="col-lg-8">
										<input class="form:input-large" placeholder="First Name"
											name='firstName' type="text" />
									</div>
								</div>
					
								<div class="form-group">
									<label class="control-label col-lg-4" for="name">Last Name </label>
									<div class="col-lg-8">
										<input class="form:input-large" placeholder="Last Name"
											name='lastName' type="text" />
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-lg-4" for="dateOfBirth">DOB </label>
									<div class="col-lg-8">
										<input class="form:input-large" placeholder="Date Of Birth"
											name='dateOfBirth' type="text" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-4" for="name">User
										Name</label>
									<div class="col-lg-8">
										<input class="form:input-large" placeholder="User Name"
											name='credentials.username' type="text">
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-4" for="name">Password</label>
									<div class="col-lg-8">
										<input class=" form:input-large" placeholder="Password"
											name='credentials.password' type="password" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-lg-4" for="name">Re
										type password </label>
									<div class="col-lg-8">
										<input class=" form:input-large"
											placeholder="Re-type password" name='credentials.verifyPassword'
											type="password" value="">
									</div>
								</div>
<div class="form-group">
								<input class="btn btn-primary btn-mini" type="submit"
									value="Register">
									
									<a href="<spring:url value="/welcome"></spring:url>" class="btn btn-primary btn-mini" role="Cancel">Cancel</a>
									</div> 
							</fieldset>
						</form>
	</div>
</body>