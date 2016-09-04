<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value='/resources/css/myStyle.css'></c:url>"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.0/css/bootstrap-select.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.0/js/bootstrap-select.min.js"></script>

<!-- (Optional) Latest compiled and minified JavaScript translation files -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.0/js/i18n/defaults-*.min.js"></script>
	
	<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
	<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">

<script>
$(function(){
	$("#startDate").datepicker();
	$("#endDate").datepicker();
})(jquery);
</script>
<title>Add Event</title>
</head>
<body>
	<main class="col-md-8 col-md-offset-2">
	<div class="container center">

		<h2>Add Event</h2>

		<form:form modelAttribute="event"
			action="/Project4JPA/admin/event/addEvent" method="post"
			class="form-horizontal">

			<div class="form-group">
				<div class="col-md-8 col-md-offset-2">

					<select name="category.categoryId" class="selectpicker">
						<option value=" ">Select Category</option>
						<c:forEach var="category" items="${category}">
							<option value="${category.categoryId}">${category.name}</option>
						</c:forEach>
					</select>

				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="title">Event
					Title</label>
				<div class="col-sm-4">
					<form:input path="title" type="text" class="form-control"
						id="EventTitle" placeholder="Title" />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="startDate"> Event
					Starts on </label>
				<div class="col-sm-4">
					<form:input path="startDate" class="form-control" id="startDate"
						placeholder="mm/dd/yyyy" />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="endDate"> Event
					Ends on </label>
				<div class="col-sm-4">
					<form:input path="endDate" class="form-control" id="endDate"
						placeholder="mm/dd/yyyy" />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="noOfSeats">Required
					Volunteers</label>
				<div class="col-sm-4">
					<form:input path="noOfSeats" type="text" class="form-control"
						id="noOfSeats" placeholder="No.of Volunteer Required" />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="ageCriteria">Required
					age</label>
				<div class="col-sm-4">
					<form:input path="ageCriteria" type="text" class="form-control"
						id="ageCriteria" />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="location">Location</label>
				<div class="col-sm-4">
					<form:input path="location" type="text" class="form-control"
						id="location" placeholder="Location" />
				</div>
			</div>




			<div class="form-group">
				<label class="control-label col-sm-2" for="shortDescription">Short
					Description</label>
				<div class="col-sm-4">
					<form:input path="shortDescription" type="text"
						class="form-control" id="shortDescription"
						placeholder="short Description" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="description">Description</label>
				<div class="col-sm-4">
					<form:textarea path="description" type="text" class="form-control"
						rows="5" id="description" placeholder="description" />
				</div>
			</div>




			<div class="form-group">
				<div class="col-md-8 col-md-offset-2">
					<form:input type="hidden" path="eventId" id="eventId" />
					<button type="submit" class="btn btn-success btn-md">Add</button>
					<a href="<spring:url value='/admin/event/all' />"
						class="btn btn-success btn-md">View Events</a>
				</div>
			</div>
			
			<div class="form-group">
				<a href="<spring:url value="/" />"
					class="btn btn-success">Go Home</a>
			</div>
			
	</div>
	</form:form>
	</div>

	</main>
</body>
</html>



