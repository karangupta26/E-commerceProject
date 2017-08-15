<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<c:url value="/j_spring_security_check" var="security"></c:url>
<form class="form-signin"  action="${security }" method=post>
 <h3 class="form-signin-heading" align="center">Please sign in as</h3> <h2>Vendor Or Customer</h2>
 <div class="form-group">
 Enter User Name:
 <input name="SpringSecurityUsername" type="text" class="form-control" placeholder="User Name"/>
 </div>
 <div class="form-group">
 Enter User Name:
 <input name="SpringSecurityPassword" type="password" class="form-control" placeholder="Password">
 </div>
 <div class="wrapper">
<button class="btn btn-large btn-primary" type="submit" >Sign in</button>
</div> 
 </form>
 </div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>