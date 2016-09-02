<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
 href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
 src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <script src="<c:url value="/resources/js/rest.js"/>"></script>
</head>
<body>
 <%-- <div class="dropdown">

   <form:form action="viewCategory" method="get">
   
   <select name="category.id" size=5>
   <option value="-"> Volunteering Opportunities </option>
   <c:forEach var="categories" items="${categories}">
   <option value="${category.key}"> ${category.name}</option>
   </c:forEach>
   </select>
   
   
   </form:form>
</div>
 --%>

<div class="dropdownBox">
        <div class="btn-group">
        <inpu>
           <button type="button" id="result" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                Volunteering Categories
  <span class="caret"></span>
            </button>
            <ul id="drop">
            
            </ul> 
           <!--  <button id="result">Click me</button> -->
        </div>
    </div>
    <script>
    /* $(function(){
    	$("#result").click(function(){
    		alert("clicked");
    	});
    	
    }); */
   
	</script>
</body>
</html>
