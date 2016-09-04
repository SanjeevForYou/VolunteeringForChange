<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>User Profile</title>
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
			<c:if test="${profile != null}">
		Name : ${profile.firstName} ${profile.lastName} <br/>
		User Name : ${profile.credentials.username}
		</c:if>
		
		<a class="btn btn-primary btn-mini" href='<spring:url value="/"></spring:url>'>Go Back</a>
	</div>
</body>