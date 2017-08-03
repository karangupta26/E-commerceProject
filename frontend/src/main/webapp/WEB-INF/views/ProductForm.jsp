<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<!-- Product insertion -->
<%-- <a:url var="url" value='/saveproduct' /> --%>
<%-- <spring:url value='/saveproduct' var="url"/> --%>
<form:form action="saveproduct" commandName="product">
<div class="form-group">
<form:hidden path="pid" class="form-control" />
</div>
<div class="form-group">
Enter Model Details:
<form:input path="modelDetails" class="form-control" />
</div>
<div class="form-group">
Enter Product Name:
<form:input path="productname" class="form-control" />
</div>
<div class="form-group">
Enter Price:
<form:input path="price" class="form-control" />
</div>
<div class="form-group">
Enter Quantity:
<form:input path="qty" class="form-control" />
</div>
<div class="form-group">
Enter Patter:
<form:input path="pattern" class="form-control" />
</div>
<div class="form-group">
Enter Style Type:
<form:input path="styleType" class="form-control" />
</div>
<div class="form-group">
Enter Wear Type
<form:input path="weartype" class="form-control" />
</div>
<div class="form-group">
Enter Style Code:
<form:input path="styleCode" class="form-control" />
</div>
<div class="form-group">
Enter Colour:
<form:input path="color" class="form-control" />
</div>
<div class="form-group">
Enter Fabric Care:
<form:input path="fabriccare" class="form-control" />
</div>
<div class="form-group">
Type:
<form:input path="type" class="form-control" />
</div>
<div class="form-group">
Sleeve:
<form:input path="sleeve" class="form-control" />
</div>
<div class="form-group">
Enter Neck Type:
<form:input path="necktype" class="form-control" />
</div>
<div class="form-group">
Enter Pockets:
<form:input path="pockets" class="form-control" />
</div>
<div class="form-group">
Enter Pockets:
<form:input path="price" class="form-control" />
</div>
<div class="form-group">
Ideal For:
<form:select path="category.catId">
<a:forEach items="${categories} " var="c"  >
<form:option value="${c.catId}">${c.idealfor }</form:option>
</a:forEach>
</form:select>
</div>
<div class="form-group">
<input type="submit" value="Add Product">
</div>
</form:form>

<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>