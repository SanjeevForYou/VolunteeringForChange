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
<title>Add Category</title>
</head>
<body>
<main class="col-md-8 col-md-offset-2">
<div class="container center">

  <h2>Add Category</h2>
  <form:form modelAttribute="category" action="/Project4JPA/admin/category/addCategory" method="post" class="form-horizontal">
  
 
    <div class="form-group">
      <label class="control-label col-sm-2" for="categoryTitle">Category Title</label>
      <div class="col-sm-4">
        <form:input  path="name" type="text" class="form-control" id="categoryTitle" placeholder="Title"/>
      </div>
    </div>
   
    <div class="form-group">
      <label class="control-label col-sm-2" for="description">Description</label>
      <div class="col-sm-4">
        <form:textarea path="categoryDescription" type="text" class="form-control"  rows="5" id="description" placeholder="description"/>
      </div>
      </div>
      
       
        <div class="col-md-offset-2">
       <form:input type="hidden" path="categoryId" id="categoryId"  />
     <button type="submit" class="btn btn-success btn-md">Add</button>
       <a href="<spring:url value="/admin/category/all" />"
									class="btn btn-success">view List</a>
    </div>
    
    </form:form>
</div>
</main>
</body>
</html>