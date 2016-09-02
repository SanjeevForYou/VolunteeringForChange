<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src='<spring:url value="resources/js/vfc.home.js"></spring:url>'></script>
 </head>
<body>
<div id="head">
</div>
<div id = "head_down">
	<div id="img_head_down">
		<div id="logo">
			<img src='<spring:url value="/resources/app-images/vfc-logo.jpg"></spring:url>' alt="image" />
		</div>
		<h2><strong>Volunteering For Change</strong></h2>
		<div class="login_button">
				<security:authorize access="isAuthenticated()">
  					<span class="welcome_note">Welcome <security:authentication property="principal.username" /> </span>
  					<a href="<spring:url  value="/user/profile" />" class="btn btn-warning">View Profile</a>	
  					<a href="<spring:url  value="/doLogout" />" class="btn btn-info">Logout</a>	
				</security:authorize>
				
				<security:authorize access="isAnonymous()">
    					<a href="<spring:url value='/login' />" class="btn btn-info"> Login</a>
    					<a href="<spring:url value='/user/registration' />" class="btn btn-warning"> Register </a>
				</security:authorize>
		</div>
	</div>
	<div id="navigation_part">
		
	</div>
	 
</div>
