<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seller On FasGen</title>
<style type="text/css">
.wrapper {
    text-align: center;
}
</style>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<div class="row">
 
<div class="col-lg-6 ">
<form:form action="VendorSignUpRegister" modelAttribute="vendor">
<div class="form-group">
<H3 align="center">Vendor Sign Up</H3>
</div>
<div class="form-group">
Enter User Name:
<form:input path="vuser.username" class="form-control" placeholder="User Name"/>
<p>${duplicateVendor}</p>
</div>
<div class="form-group">
Enter Password:
<form:input path="vuser.password" class="form-control" type="password" placeholder="Password"/>
</div>
<div class="wrapper">
<button class="btn btn-large btn-primary" type="submit" >Sign Up</button>
</div>
</form:form>
 </div>
 
 <div class="col-lg-6">
 <c:url value="/j_spring_security_check" var="security"/>
<form class="form-signin" action="${security}" method=post>
 <h3 class="form-signin-heading" align="center">Please sign in</h3>
 <div class="form-group">
 Enter User Name:
 <input name="SpringSecurityUsername" type="text" class="form-control" placeholder="User Name"/>
 </div>
 <div class="form-group">
 Enter User Name:
 <input name="SpringSecurityPassword"type="password" class="form-control" placeholder="Password">
 </div>
 <div class="wrapper">
<button class="btn btn-large btn-primary" type="submit" >Sign in</button>
</div> 
 </form>
 </div>
</div>
 
</div>

<br><br><br>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>