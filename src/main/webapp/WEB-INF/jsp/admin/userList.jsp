<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<section class="container">
	<div class="row">
		<h3>List of Users</h3>

		<table class="table">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>User Name</th>
			</tr>
			<c:forEach items="${users}" var="member">
				<tr>
					<td> ${member.id}</td>
					<td><a href="<spring:url value='/user/profile/${member.credentials.username}' />">${member.firstName} ${member.lastName}</a></td>
					<td>${member.dateOfBirth}</td>
					<td>${member.credentials.username}</td>
				</tr>
			</c:forEach>

		</table>
     <a class="btn btn-primary btn-mini" href='<spring:url value="/admin/addEditUser"></spring:url>'>Add New</a>
	</div>
	</section>
</body>
</html>