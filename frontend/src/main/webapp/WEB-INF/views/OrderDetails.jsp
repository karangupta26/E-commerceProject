<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="Header.jsp" %>
<%@ page isELIgnored="false"%>
<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Details</title>
</head>
<body>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Order</h1>

            <p class="lead">Order confirmation</p>
        </div>

        <div class="container">
        <c:url value="/cart/confirm/${cartId}" var="url"></c:url>
<form:form action="${url }" modelAttribute="customerOrder">
            <div class="row">

                             <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">

                       <div class="txt-center">
                            <h1>Receipt</h1>
                       </div>
                       ORDER ID: ${customerOrder.orderId }
                  
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <address>
                                    <strong>Shipping Address</strong><br/>
                                    ${customerOrder.cart.customer.firstname } ${customerOrder.cart.customer.lastname }
                                <br/>
                                    ${customerOrder.cart.customer.shippingAddress.address}
                                <br/>
                                    ${customerOrder.cart.customer.shippingAddress.city}, ${customerOrder.cart.customer.shippingAddress.state}
                                <br/>
                                     ${customerOrder.cart.customer.shippingAddress.country}, ${customerOrder.cart.customer.shippingAddress.zipcode}
                                </address>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                                <p>Shipping Date: <fmt:formatDate type="date" value="${now}" /></p>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <address>
                                    <strong>Billing Address</strong><br/>
                                    	${customerOrder.cart.customer.firstname } ${customerOrder.cart.customer.lastname }
                                	<br/>
                                        ${customerOrder.cart.customer.billingAddress.address}
                                    <br/>
                                        ${customerOrder.cart.customer.billingAddress.city}, ${customerOrder.cart.customer.billingAddress.state}
                                    <br/>
                                        ${customerOrder.cart.customer.billingAddress.country}, ${customerOrder.cart.customer.billingAddress.zipcode}
                                </address>
                            </div>
                        </div>

                        <div class="row">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <td>Product</td>
                                        <td>#</td>
                                        <td class="text-center">Price</td>
                                        <td class="text-center">Total</td>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:set var="grandTotal" value="0.0"></c:set>
                                <c:forEach var="cartItem" items="${customerOrder.cart.cartItems}">
                                    <tr>
                                        <td class="col-md-9"><em>${cartItem.product.productname}</em></td>
                                        <td class="col-md-1" style="text-align: center">${cartItem.quantity}</td>
                                        <td class="col-md-1" style="text-align: center">${cartItem.product.price}</td>
                                        <td class="col-md-1" style="text-align: center">${cartItem.totalPrice}</td>
                                        <c:set var="grandTotal" value="${grandTotal + cartItem.totalPrice }"></c:set>
                                    </tr>
                                </c:forEach>

                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td class="text-right">
                                        <h4><strong>Grand Total:</strong></h4>
                                    </td>
                                    <td class="text-center text-danger">
                                        <h4><strong>&#8377 ${grandTotal}</strong></h4>
                                    </td>
                                </tr>

                                </tbody>
                            </table>
                            <input type="submit" value="submit">
                        </div>


                      
                    </div>
             
            </div>
            
            </form:form>
        </div>


</div>
</div>
<%@ include file="Footer.jsp" %>
</body>
</html>