<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="url" value="/registercustmer"/>
<form:form action="${url }" modelAttribute="customer">
<div class="form-group">
First Name:
<form:input path="firstname"/>
</div>
<div class="form-group">
Last Name:
<form:input path="lastname"/>
</div>
<div class="form-group">
Enter Email:
<form:input path="email"/>
</div>
<div class="form-group">
Enter Phone:
<form:input path="phone"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="billingAddress.Address"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="billingAddress.city"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="billingAddress.state"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="billingAddress.country"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="billingAddress.zipcode"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="shippingAddress.Address"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="shippingAddress.city"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="shippingAddress.state"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="shippingAddress.country"/>
</div>
<div class="form-group">
Enter Address:
<form:input path="shippingAddress.zipcode"/>
</div>
</form:form>


</body>
</html>