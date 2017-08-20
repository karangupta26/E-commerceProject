<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping Confirmation</title>
<style type="text/css" >
.wrapper{
	text-align:center; 
}
.container{
	width: 500px;
	padding: 0px 15px 20px 15px;
}
.form-group{
	padding: 0px 15px 0px 15px;

}
.fgr1{
padding-bottom: 5px;
}
</style>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<c:url value="/cart/order/${cartId}" var="url"/>
<form:form action="${url }" modelAttribute="shippingAddress" >
<form:hidden path="shipId"/>
<div class="boxed" style= "border:1px solid">
<h3 align="center">Shipping Address</h3>
<div class="form-group">
<form:label path="Address" >Enter Address</form:label>
<form:input path="Address" class="form-control"/>
<form:errors path="Address" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="city" >Enter City</form:label>
<form:input path="city" class="form-control"/>
<form:errors path="city" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="state" >Enter State</form:label>
<form:input path="state" class="form-control"/>
<form:errors path="state" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="country" >Enter Country</form:label>
<form:input path="country" class="form-control"/>
<form:errors path="country" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="zipcode" >Enter Zipcode</form:label>
<form:input path="zipcode" class="form-control"/>
<form:errors path="zipcode" cssStyle="color:red"></form:errors>
</div>
<div class="form-group fgr1">
<div class="wrapper">
<button class="btn btn-large btn-primary" type="submit"  >Next</button>
</div>
</div>
</div>
</form:form>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>