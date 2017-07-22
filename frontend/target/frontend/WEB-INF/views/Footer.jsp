<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/034feea29c.js"></script>
	<base href="resources\images\" target="_blank">
	<style type="text/css">
	#footer {
  	position: relative;
  	left:0;
	bottom: 0;
	width: 100%;
	/* Set the fixed height of the footer here */
	height: 45px;
	background-color:black;
	}
	
	</style>
<title>Insert title here</title>
</head>

<footer class="footer" id="footer">
<div class="container">
     <div class="row">
        <div class="col-sm-6">
        <h4><span class="copyright text-inverse">Copyright © Karan Gupta Under the Guidance of Vishal Sir</span></h4>
        </div>
        <div class="col-sm-2">
		<h4><b><a href="<c:url value="/AboutUs" />">About Us</a></b></h4>
		</div>
        <div class="col-sm-4">
            <div class="row">
              <div class="col-md-12 hidden-xs text-right">
                <a href="#"><i class="fa fa-2x fa-fw fa-instagram text-inverse"></i></a>
                <a href="#"><i class="fa fa-2x fa-fw fa-twitter text-inverse"></i></a>
                <a href="#"><i class="fa fa-2x fa-fw fa-facebook text-inverse"></i></a>
              </div>
            </div>
        </div>
      </div>		
    </div>
</footer>
</body>
</html>