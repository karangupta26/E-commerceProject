<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
<title>Customer Sign up</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<%-- <c:url var="url" value="registercustomer"/> --%>
<form:form action="registercustomer" modelAttribute="customer">
<div class="form-group">
First Name:
<form:input path="firstname" class="form-control"/>
</div>
<div class="form-group">
Last Name:
<form:input path="lastname" class="form-control"/>
</div>
<div class="form-group">
Enter Email:
<form:input path="email" type="email" class="form-control"/>
</div>
<div class="form-group">
Enter Password:
<form:input path="password" type="password" class="form-control"/>
</div>
<div class="form-group">
Enter Phone:
<form:input path="phone" class="form-control"/>
</div>
<div class="form-group">
Enter Billing Address:
<form:input path="billingAddress.Address" class="form-control"/>
</div>
<div class="form-group">
Enter Billing City:
<form:input path="billingAddress.city" class="form-control"/>
</div>
<div class="form-group">
Enter Billing State:
<form:input path="billingAddress.state" class="form-control"/>
</div>
<div class="form-group">
Enter Billing Country:
<form:input path="billingAddress.country" class="form-control"/>
</div>
<div class="form-group">
Enter Billing Zip Code:
<form:input path="billingAddress.zipcode" class="form-control"/>
</div>
<div class="form-group">
Enter Shipping Address:
<form:input path="shippingAddress.Address" class="form-control"/>
</div>
<div class="form-group">
Enter Shipping City:
<form:input path="shippingAddress.city" class="form-control"/>
</div>
<div class="form-group">
Enter Shipping State:
<form:input path="shippingAddress.state" class="form-control"/>
</div>
<div class="form-group">
Enter Shipping country:
<form:input path="shippingAddress.country" class="form-control"/>
</div>
<div class="form-group">
Enter Shipping Zip Code:
<form:input path="shippingAddress.zipcode" class="form-control"/>
</div>
<div class="form-group">
<input type="submit" value="Sign Up">
</div>
</form:form>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>