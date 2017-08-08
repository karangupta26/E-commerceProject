<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<div class="col-md-6">
<img alt="${productDetails.productname}" src="<c:url value="/productImages/${productDetails.pid}.jpeg"/>" class="img-responsive">
</div>
<div class="col-md=6">
<h3>${productDetails.brand} ${productDetails.productname}</h3>
<h4>${productDetails.price}</h4>
<table class="tg">
<tr>
<td colspan="2"></td>
</tr>
<tr>
<td>Model Details
</td>
<td>${productDetails.modelDetails}
</td>
</tr>
<tr>
<td>Colour
</td>
<td>${productDetails.color}
</td>
</tr>
<tr>
<td>Neck Type
</td>
<td>${productDetails.necktype}
</td>
</tr>
<tr>
<td>Pattern
</td>
<td>${productDetails.pattern }
</td>
</tr>
<tr>
<td>Sleeve
</td>
<td>${productDetails.sleeve }
</td>
</tr>
<tr>
<td>Style Code
</td>
<td>${productDetails.sleeve }
</td>
</tr>
<tr>
<td>Fabric care
</td>
<td>${productDetails.fabriccare}
</td>
</tr>
<tr>
<td>Style Type
</td>
<td>${productDetails.styleType }
</td>
</tr>
<tr>
<td>Wear Type
</td>
<td>${productDetails.weartype}
</td>
</tr>
<tr>
<td>Type
</td>
<td>${productDetails.type}
</td>
</tr>
<tr>
<td>Pockets
</td>
<td>${productDetails.pockets }
</td>
</tr>

</table>
</div>

</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>