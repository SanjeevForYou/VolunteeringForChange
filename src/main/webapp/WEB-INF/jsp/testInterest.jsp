<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
 <script src='<spring:url value="resources/js/vfc.home.js"></spring:url>'></script>
 
<%-- //<![CDATA[
    $(function () {
        $(this).vfc_home({
            UserModuleID: '<%=UserModuleID %>',
            rowTotal: '<%=RowTotal %>',
            PageLimit:'<%=PageLimit %>',
            CategoryID: '<%=CategoryID %>'
        });      
    });
    //]]>  --%>


 <script>
 $(function () {
     $(this).vfc_home({
         UserModuleID: '1',
         rowTotal: '1',
         PageLimit:'10',
         CategoryID: '2'
     });      
 });
 </script>
</head>
<body>
<c:forEach var="i" begin="1" end="5">
    <span class="btn btn-primary btn-mini interested" data-eventid="${i}">Interest ${i} </span>
   <br/>
</c:forEach>

</body>
</html>