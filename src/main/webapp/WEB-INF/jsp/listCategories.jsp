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
<title>List of Category</title>
</head>
<body>
<section class="container">
		<div class="row">
		 <h3>List of Categories </h3>
        
        <table class="table">
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Last Update</th>
            
            <tr>
                        
            
			<c:forEach items="${categories}" var="category">
			
			<tr>
                <td>${category.categoryId}</td>
                <td> ${category.name}</td>
                <td> ${category.categoryDescription}</td>
               

                <td>
                 <a href="<spring:url value="/admin/category/edit/${category.categoryId}" />"
									class="btn btn-success"> <span
									class="glyphicon glyphicon-edit" /></span> Edit</a>
									
                <a href="<spring:url value="/admin/category/delete/${category.categoryId}" /> "
									class="btn btn-danger"><span
									class="glyphicon glyphicon-trash"/></span> Delete</a>
                </td>
                </tr>
                   </c:forEach>
            </tr>
         
            
        </table>
                       
        <a class="btn btn-success btn-large" href="<spring:url value="/admin/category/addCategory"/>"
									class="btn btn-primary"> Add New</a>
   

							
		</div>
	</section>
</body>
</html>