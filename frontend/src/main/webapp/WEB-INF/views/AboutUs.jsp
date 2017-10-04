<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Us</title>
<style type="text/css">
.bg1{
	background-color:#2f2f2f;
	color: #ffffff;
	height:700px;
}
</style>
</head>
<body>
<%@ include file="Header.jsp" %> 
<div class="container-fluid text-center bg1" >
<h3 class="margin" id="text">Who Am I?</h3>
<img alt="Logo" src="<c:url value="/images/Logo1.jpeg"/>" class="img-responsive img-circle margin" style="display:inline">
<p id="text" align="center" class="text">This is Devloped by Karan Gupta a Student of NIIT Under the guidance of Vandana Ma'am and Vishal Sir.
</p>
</div>


<%@include file="Footer.jsp" %>
</body>
</html>