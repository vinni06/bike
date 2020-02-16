<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


    

<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>

<style>
 
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=number], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}


input[type=submit] {
  width: 100%;
  background-color: #008CBA;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.btn {
  background-color: DodgerBlue;
  border: none;
  color: white;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer;
}

.btn:hover {
  background-color: RoyalBlue;
}


</style>
</head>
<body>

<h3>Department Registration form</h3>


<div>
    <form  action="/addBikeToBrand" method="post" >
       <label>Select Brand:
       <select name ="brandId">
       <c:forEach var="brand" items="${brands}">
       <option value="${brand.brandId }">${brand.brandName}</option>
       </c:forEach>
       </select></label>
       
       <label>Enter Bike Name:</label>
       <input type="text"  name="bikeName">
       <label>Enter Bike Price:</label>
       <input type="number"  name="bikePrice">
   
       
       <input type="submit" value="ASSIGN">
    
      </form>
</div>

<i class="fa fa-thumbs-up" style="align:center"></i><p>${message}</p>
<a href="/"><button class="btn"><i class="fa fa-home"></i></button></button></a>

</body>
</html>

