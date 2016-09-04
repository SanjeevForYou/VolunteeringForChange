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
<title>List of Category</title>
</head>
<body>
	<section class="container">
	<div class="row">

		<div>
			<div>
				<div>
					<h3>Title - ${event.title}</h3>
					<h3>Short Description - ${event.shortDescription}</h3>
					<p>Location - ${event.location}</p>
					<p>Start Date - ${event.startDate}</p>
					<p>End Date - ${event.endDate}</p>
					<p>Last Updated - ${event.updateDate}</p>
					<p>Required Volunteer - ${event.noOfSeats}</p>
					<p>Elligible age - ${event.ageCriteria}</p>
					<p>Status - ${event.status}</p>
					<p>Description - ${event.description}</p>

					<p>
						<a href="<spring:url value="/admin/event/addEvent" />"
							class="btn btn-success">Add Event</a> <a
							href="<spring:url value="/admin/event/all" />"
							class="btn btn-success"> <span
							class="glyphicon glyphicon-edit" /></span>Event List
						</a> <a
							href="<spring:url value="/admin/event/edit/${event.eventId}" />"
							class="btn btn-success"> <span
							class="glyphicon glyphicon-edit" /></span> Edit
						</a> <a
							href="<spring:url value="/admin/event/delete/${event.eventId}" /> "
							class="btn btn-danger"><span
							class="glyphicon glyphicon-trash" /></span> Delete</a>
					</p>

				</div>
			</div>
		</div>

	</div>
	</section>
</body>
</html>