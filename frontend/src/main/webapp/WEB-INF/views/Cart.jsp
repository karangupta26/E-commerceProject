<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
zz
<title>Cart</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<c:url value="/cart/clearcart/${getCart.cartId}" var="clear"></c:url>
<a href="${clear }" class="btn btn-danger pull-left "  >
<span class="glyphicon glypicon-remove-sign"></span>
Clear Cart
</a>
<a href="<c:url value="/cart/shippingaddressform/${getCart.cartId}"></c:url>" class="btn btn-success pull-right">
<span class="glyphicon glypicon-shopping-cart"></span> Check Out  </a>

</div>
<div class="container">
<table class="table">
<thead>
<tr>
<th>Name</th>
<th>Quantity</th>
<th>Total Price</th>
<th>Operation</th>
</tr>
</thead>
<c:set var="grandTotal" value="0"></c:set>
<c:forEach items="${getCart.cartItems}" var="cartItem">
<tr>
<td>${cartItem.product.productname}</td>
<td>${ cartItem.quantity}</td>
<td>${cartItem.totalPrice}</td>
<c:url value="/cart/removeCartItem/${cartItem.cartItemId }" var="remove"></c:url>
<td class="active"><a href="${remove}"><c:set var="grandTotal" value="${cartItem.totalPrice+grandTotal}"></c:set><span class="glyphicon glyphion-remove"></span> Remove</a></td>
</tr>
</c:forEach>
<tr >
<td colspan="3" align="right">Total Price:</td>
<td>&#8377 ${grandTotal}</td>
</tr>
</table>
</div>
<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>