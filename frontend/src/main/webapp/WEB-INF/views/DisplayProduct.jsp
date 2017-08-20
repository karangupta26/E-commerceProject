<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<c:forEach items="${productListByCategory}"  var="products">
<div class="row">
<div class="col-md-4">
<div class="card">
<div class="row">
<div class="col-md-4">
<img alt="${products.productname }" src="<c:url value="/productImages/${products.pid}.jpeg"/>" class="img-thumbnail" >
</div>
</div>
<div class="row">
<div class="col-md-4">
<a href="<c:url value="/product/details/${products.pid}" />">${products.productname }</a><br>
&#8377 ${products.price }<br>
${products.type}
</div>
</div>
</div>
</div>
<div class="col-md-4">
<div class="card">
<div class="row">
<div class="col-md-4">
<img alt="${products.productname }" src="<c:url value="/productImages/${products.pid}.jpeg"/>" class="img-thumbnail" >
</div>
</div>
<div class="row">
<div class="col-md-4">
<a href="<c:url value="/product/details/${products.pid}" />">${products.productname }</a><br>
&#8377 ${products.price }<br>
${products.type}
</div>
</div>
</div>
</div>

</div>
</c:forEach>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>