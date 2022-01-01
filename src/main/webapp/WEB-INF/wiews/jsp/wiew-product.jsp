<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>wiew product</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>List Products</h2>
		<div class="rows">
			<div class="col-sm-9">
				
					<c:forEach items="${LIST_PRODUCT }" var="item"  >
					<tr>
							
							
							<td>${item.id }</td>
							<td>${item.name }</td>
							<td>${item.price}</td>
							<td><a class="btn btn-primary btn-sm" href="">ADD CART</a>
							</td>
						</tr>
						</c:forEach>
						
						
					
				
			</div>
		</div>
		
	</div>
</body>
</html>

