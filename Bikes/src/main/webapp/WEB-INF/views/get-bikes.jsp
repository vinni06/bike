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

    <form  action="/getAllBikes" method="post" >
  <label>Enter Dealer Name:</label>
      <input type ="text"  name="dealerName" >
       <input type="submit" value="GET">
    
      </form>
      
        	
	
			<table border="2" width="70%"
				cellpadding="2" class="table table-dark table-striped">
				<tr class="info">
					<th>Bike Id</th>
					<th>Bike Name</th>
				
				</tr>
               <c:forEach var="bike" items="${bikes}">
					<tr >
						<td>${bike.bikeId}</td>
						<td>${bike.bikeName}</td>
					
					</tr>
			</c:forEach>
			</table>
		
      
   




</body>
</html>