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

<script
	src='<spring:url value="/resources/js/vfc.admin.event.js"></spring:url>'></script>

<script>
	$(function() {
		$(this).vfc_admin_event({});
	});
</script>
<title>List of User</title>
</head>
<body>
	<section class="container">
	<div class="row">
		<h2>${event.title }</h2>
		<h4>${event.location}</h4>
		<h4>Members interested in this Event</h4>
		<table class="table">
			<th>ID</th>
			<th>Name</th>
			<th>Approval Status</th>

			<tr>


				<c:forEach items="${userInEvent}" var="user">

					<tr>
						<td>${user.id}</td>
						<td>${user.getFullName()}</td>


						<td><select class="user_approval" data-eventid="${eventid}"
							data-userid="${user.id}">
								<c:if test="${user.mark == 0 }">
									<option value="0" selected>Disapprove</option>
									<option value="1">Approve</option>
								</c:if>
								<c:if test="${user.mark == 1}">
									<option value="0">Disapprove</option>
									<option value="1" selected>Approve</option>
								</c:if>
						</select></td>
					</tr>
				</c:forEach>
			</tr>
		</table>


		<div class="form-group">
			<a class="btn btn-success btn-large"
				href="<spring:url value="/admin/event/addEvent"/>"
				class="btn btn-primary"> Add New</a> <a
				href="<spring:url value="/" />" class="btn btn-success">Go Home</a>
		</div>


	</div>
	</section>
</body>
</html>