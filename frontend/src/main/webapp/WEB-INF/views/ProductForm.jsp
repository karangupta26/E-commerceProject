<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<!-- Product insertion -->
<div class="container">
<%-- <a:url var="url" value='/saveproduct' /> --%>
<%-- <spring:url value='/saveproduct' var="url"/> --%>
<form:form action="saveproduct" commandName="product" enctype="multipart/form-data">
<div class="form-group">
<form:hidden path="pid" class="form-control" />
</div>
<div class="form-group">
Enter Model Details:
<form:input path="modelDetails" class="form-control" />
</div>
<div class="form-group">
Enter Brand:
<form:input path="brand" class="form-control"/>
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
Enter Pattern:
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
Ideal For:
<form:select path="category.catId">
<form:options items="${categories}" itemValue="catId" itemLabel="idealfor"/>
</form:select>
</div>
<div class="form-group">
Upload Image
<input type="file" name="image">
</div>
<div class="form-group">
<input type="submit" value="Add Product">
</div>
</form:form>
</div>
<div class="container-fluid">
<h3>Product List</h3>
<a:if test="${!empty productList }">
	<table class="tg">
	<tr>
	<th width="80">Product ID</th>
	<th width="80">Brand</th>
	<th width="300">Product Name</th>
	<th width="80">Price</th>
	<th width="120">Category</th>
	<th width="80">Type</th>
	<th width="100">Operation</th>
<!-- 	<th></th> -->
	</tr>
	<a:forEach items="${productList}" var="prod">
	<tr>
	<td>${prod.pid}</td>
	<td>${prod.brand}</td>
	<td>${prod.productname}</td>
	<td>${prod.price}</td>
	<td>${prod.category.idealfor}</td>
	<td>${prod.type}</td>
	<td><a href="<a:url value="/vendor/editProduct/editForm/${prod.pid}"/>">Edit</a>/
	<a>Delete</a></td>
	</tr>
	</a:forEach>	
	</table>
</a:if>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>