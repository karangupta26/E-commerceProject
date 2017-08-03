<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<form>
<table> 
<tr>
<td>Username:</td>
<td><input type="text"/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="Password"/></td>

</tr>
<tr><td colspan="2"><button type="submit" vale="Log in"></button></td></tr>
</table>
</form>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>