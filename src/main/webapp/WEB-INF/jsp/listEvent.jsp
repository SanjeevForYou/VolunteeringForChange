<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="<c:url value='/resources/css/myStyle.css'></c:url>" rel="stylesheet">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>List of Events</title>
</head>
<body>
<section class="container">
		<div class="row">
		 <h3>List of Events </h3>
        
        <table class="table">
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Location</th>
            <th>Start Date</th>
            
            <tr>
                        
            
			<c:forEach items="${events}" var="event">
			
			<tr>
                <td>${event.eventId}</td>
                <td>${event.title}</td>
                <td> ${event.shortDescription}</td>
                <td> ${event.location}</td>
                 <td> ${event.startDate}</td>
               

                <td>
                <a href="<spring:url value="/admin/memberEvent/members/${event.eventId}" />"
									class="btn btn-success"> <span
									class="glyphicon glyphicon-edit" /></span>Members</a>
									
									
                <a href="<spring:url value="/admin/event/getdetails/${event.eventId}" />"
									class="btn btn-success"> <span
									class="glyphicon glyphicon-edit" /></span>Details</a>
									
                
                 <a href="<spring:url value="/admin/event/edit/${event.eventId}" />"
									class="btn btn-success"> <span
									class="glyphicon glyphicon-edit" /></span> Edit</a>
									
                <a href="<spring:url value="/admin/event/delete/${event.eventId}" /> "
									class="btn btn-danger"><span
									class="glyphicon glyphicon-trash"/></span> Delete</a>
                </td>
                </tr>
                   </c:forEach>
            </tr>
         
            
        </table>
                       
        <a class="btn btn-success btn-large" href="<spring:url value="/admin/event/addEvent"/>"
									class="btn btn-primary"> Add New</a>
   

							
		</div>
	</section>
</body>
</html>