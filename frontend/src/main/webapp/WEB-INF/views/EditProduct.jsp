<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Editing</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<form:form  commandName="productEdit">
<div class="form-group">
<form:hidden path="pid"/>
</div>
<div class="form-group">
Enter Model Details:
<form:input path="modelDetails" class="form-control"/>
</div>
<div class="form-group">
Enter brand:
<form:input path="brand" class="form-control"/>
</div>
<div class="form-group">
Enter Pattern:
<form:input path="pattern" class="form-control"/>
</div>
<div class="form-group">
Enter Fabric Care:
<form:input path="fabriccare" class="form-control"/>
</div>
<div class="form-group">
Enter Price:
<form:input path="price" class="form-control"/>
</div>
<input type="submit" value="Edit Product">
</form:form>
</div>
<br><br><br>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>