<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
	section{
	background-color:#d9d9d9;
	}
	.navbar{
		background-color:#d9d9d9;
	}
	</style>
</head>

<header>
<!-- Getting Category List -->
<sql:setDataSource
	var="categoryDs"
	driver="org.h2.Driver"
	url="jdbc:h2:tcp://localhost/~/project"
	user="project" password="project"
/>
<sql:query var="categoryList" dataSource="${categoryDs }">
	select * from category
</sql:query>
<!-- Ends Here -->
<nav class="navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container-fluid">
	<div class="row">
	<div class="col-xs-1">
	<div class="navbar-header">
		<img src="<c:url value="/images/Logo1.jpeg"/>" alt="FG" class="img-rounded"  width="120" height="50"></img>
		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
	</div>
	<div class="col-xs-6">
	<div class="collapse navbar-collapse clear" id="bs-example-navbar-collapse-1">
		<form class="navbar-form" role="search" >
			<div class="form-group">
				<input type="text" class="form-control" size="90" placeholder="search" />
			</div>
		</form>
		</div>
	</div>
	<div class="col-xs-1">
	<div class="collapse navbar-collapse clear" id="bs-example-navbar-collapse-1">
		<form class="navbar-form" >
			<div class="form-group">
				<button type="button" class="btn btn-default">
      				<span class="glyphicon glyphicon-search"></span> Search
    			</button>
			</div>
		</form>	
	</div>
	</div>
	<div class="col-xs-2">
	<div class="collapse navbar-collapse clear" id="bs-example-navbar-collapse-1">
	<c:if test="${pageContext.request.userPrincipal.name==null }">
	
	<p class="navbarfont navbar-text"><b><a href="<c:url value="/Vendor"/>">SELL ON FASHGEN</a></b></p>
	
	</c:if>
	<c:if test="${pageContext.request.userPrincipal.name!=null }">
	<security:authorize access="hasRole('ROLE_VENDOR')">
	<p class="navbarfont navbar-text"><b><a href="<c:url value="/vendor/Product/ProductForm"/>">PRODUCT OPERATIONS</a></b></p>
	</security:authorize>
	</c:if>
	</div>
	</div>
	<div class="col-xs-2">
	<div class="collapse navbar-collapse clear" id="bs-example-navbar-collapse-1">
	<c:url value="/j_spring_security_logout" var="logoutUrl"></c:url>
	<c:if test="${pageContext.request.userPrincipal.name!=null }">
	<p class="navbarfont navbar-text"><a href="${logoutUrl }"><b>LOGOUT</b></a></p>
	</c:if>
	</div>
	</div>
	</div>
	</div>
</nav>

<nav class="navbar navbar-custom " role="navigation">
	<div class="container-fluid">
		<div class="navbar header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse" >
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav nav-pills"  role="tablist">
				<li><a href="<c:url value="/Home"/>"> HOME</a></li>
				<c:forEach var="category" items="${categoryList.rows }">
					<li><a href="<c:url value="/product/getProductByCategory/${category.catId}"/>"> ${category.idealfor}</a></li>
				</c:forEach>
			</ul>
			<ul class="nav navbar-nav navbar-right nav-pills" role="tablist">
				<c:if test="${pageContext.request.userPrincipal.name==null }">
				<li><a href="<c:url value="/Login"/>"><span class="glyphicon glyphicon-user"></span> Login</a></li>
				<li><a href="<c:url value="/CustomerForm"/>"><span class="glyphicon glyphicon-log-in"></span> Sign Up </a></li>
				</c:if>
				<c:url value="/cart/getcart" var="getCart"></c:url>
				<li> <security:authorize access="hasAnyRole('ROLE_CUSTOMER','')"><a href="${getCart}"><b>Cart</b></a></security:authorize> </li>
			</ul>
		</div>
	</div>
</nav>
</header>
