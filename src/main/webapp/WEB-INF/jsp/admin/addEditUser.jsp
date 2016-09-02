<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<title>Registration</title>

<script>
$(function(){
	$("#dateOfBirth").datepicker();
})(jquery);
</script>
</head>
<body>
<div id="maincontainer">
<div id="header">
<h2>VFC Admin</h2>
</div>
<div id="nav">
<a href="<spring:url value="/admin/event/all"></spring:url>">Events</a>
<a href='<spring:url value="/admin/category/addCategory"></spring:url>'>Add Event Category</a>
<a href="<spring:url value="/admin/event/addEvent"></spring:url>">Add Event</a>

<a href="<spring:url value="/user/list"></spring:url>">Manage Users</a>

</div>
</div>
	<div class="main_container">
		<div class="contain">
			<h2>User Manage</h2>
		</div>
		<div class="container center">
			<form:form modelAttribute="profile">
				<fieldset>
					<form:errors path="*" cssStyle="color : red;" />

					<div class="form-group">
						<form:hidden path="credentials.username" />
						<label class="control-label" for="name">First Name</label>
						<form:input path="firstName" class="form-control"
							placeholder="First Name" />
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>

					<div class="form-group">
						<label class="control-label" for="name">Last Name </label>

						<form:input path="lastName" class="form-control"
							placeholder="Last Name" />
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>

					<div class="form-group">
						<label class="control-label" for="dateOfBirth">DOB </label>
						<form:input path="dateOfBirth" class="form-control"
							placeholder="mm/dd/yyyy" />
						<form:errors path="dateOfBirth" cssStyle="color : red;" />

					</div>
					<div class="form-group">
						<label class="control-label" for="name">User Name</label>
						<form:input path="credentials.username" class="form-control"
							placeholder="User Name" />
						<form:errors path="credentials.username" cssStyle="color : red;" />

					</div>
					<div class="form-group">
						<label class="control-label" for="name">Password</label>
						<form:input path="credentials.password" class="form-control"
							placeholder="Password" />
						<form:errors path="credentials.password" cssStyle="color : red;" />

					</div>
					<div class="form-group">
						<label class="control-label" for="name">Re type password </label>
						<form:input path="credentials.verifyPassword" class="form-control"
							placeholder="Password" />
						<form:errors path="credentials.verifyPassword"
							cssStyle="color : red;" />

					</div>

					<div class="form-group">
						<label class="control-label" for="name">User Role </label>

						<%-- 	<form:select path="">
									</form:select> --%>

					</div>
					<div class="form-group">
						<input class="btn btn-primary btn-mini" type="submit"
							value="Register"> <a
							href="<spring:url value="/user/list"></spring:url>"
							class="btn btn-primary btn-mini" role="Cancel">Cancel</a>
					</div>
				</fieldset>
			</form:form>
		</div>
	</div>
</body>