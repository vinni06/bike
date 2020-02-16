<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table class="table table-dark table-striped" >
		<tr>
			<th>Brand Name</th>
			<th>Investement</th>
		</tr>
		<c:forEach var="brand" items="${ibikes}">
			<tr>
				<td>${brand.brandName}</td>
				<td><c:set var="total" value="${0 }" />
				 <c:forEach var="bike" items="${brand.getBikes()}">
						<c:set var="total" value="${total + bike.bikePrice }" />
					</c:forEach>
					<c:if test="${total != 0 }">${total}</c:if>
				</td>
			</tr>


		</c:forEach>

	</table>

</body>
</html>