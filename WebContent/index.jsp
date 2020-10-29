<%@page import="com.dao.Dao"%>
<%@page import="com.daoImplement.DaoImplement"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Register"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp CRUD</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


<body>
<form  action="registered" method="post">
     <div class="form-row">
      <input type="hidden" class="form-control" id="inputid" placeholder="Enter Id" name="id">
    </div>
    
  <div class="form-row">
    <div class="form-group col-md-2">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email" name="email">
    </div>
    <div class="form-group col-md-2">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password" name="password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control col-md-4" id="inputAddress" placeholder="1234 Main St" name="address1">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Address 2</label>
    <input type="text" class="form-control col-md-4" id="inputAddress2" placeholder="Apartment, studio, or floor" name="address2">
  </div>
  <div class="form-row">
    <div class="form-group col-md-2">
      <label for="inputCity">City</label>
      <input type="text" class="form-control col-md-4" id="inputCity" name="city">
    </div>
    <div class="form-group col-md-2">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control" name="state">
        <option selected>Choose...</option>
        <option>MAHARASHTRA</option>
         <option>UP</option>
          <option>MP</option>
           <option>Gujrat</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip" name="zip">
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck" name="check" >
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary " id="submitButton" name="button">Sign in</button>
</form>
<hr />
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Address1</th>
      <th scope="col">Address2</th>
      <th scope="col">City</th>
      <th scope="col">State</th>
      <th scope="col">Zip</th>
      <th scope="col">Check</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%  
  
               Dao dao= new DaoImplement();
    		  List<Register> registers=dao.fetch();
    		   Iterator<Register> i=registers.iterator();
    		   while(i.hasNext()){
    			  Register  register=(Register)i.next();
  %>
  
    <tr>
      <th scope="row"><%=register.getId() %> </th>
      <td><%=register.getEmail()%></td>
      <td><%=register.getPassword()%></td>
      <td><%=register.getAddress1()%></td>
       <th scope="row"><%=register.getAddress2() %></th>
      <td><%=register.getCity()%></td>
      <td><%=register.getState()%></td>
      <td><%=register.getZip() %></td>
       <td><%=register.getCheck()%></td>
       <td><a href="registered?id=<%=register.getId() %>">Delete</a></td>
       <td> <a href="#" onclick="update(<%=register.getId() %>,'<%=register.getEmail()%>','<%=register.getPassword()%>','<%=register.getAddress1()%>',
       '<%=register.getAddress2() %>','<%=register.getCity()%>','<%=register.getState()%>','<%=register.getZip() %>')">Update</a> </td>
    </tr>
 <% } %>
    </tbody>
    </table>
<script type="text/javascript">
function update(id,email,password,add1,add2,city,state,zip){
document.getElementById('inputid').value=id;
document.getElementById('inputEmail4').value=email;
document.getElementById('inputPassword4').value=password;
document.getElementById('inputAddress').value=add1;
document.getElementById('inputAddress2').value=add2;
document.getElementById('inputCity').value=city;
document.getElementById('inputState').value=state;
document.getElementById('inputZip').value=zip;
document.getElementById('submitButton').value="update";
document.getElementById('submitButton').innerHTML="update";

	
}

</script>

<a href="home">Home Page </a>
<br>
<a href="jsp_use_bean">JSPBEAN </a>
</body>
</html>