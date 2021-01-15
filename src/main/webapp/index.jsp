<%@page import="com.sun.org.glassfish.gmbal.IncludeSubclass"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="com.helper.ConnectionProvider"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
	integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<!-- url for fond awsome : https://www.w3schools.com/icons/fontawesome_icons_intro.asp -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="js/myjs.js">
	
</script>

</head>
<body>
	<%-- for checking Jquery Work or not 
start---
 
 <script type="text/javascript">
$(document).ready(function(){
	alert("ducument ready1")
})
  


   </script>
---    End  
 

<% Connection con=ConnectionProvider.getConnection(); %>

<h1><%=con %></h1> --%>

	<!-- include Navebar.jsp in index.jsp -->
	<%@include file="navbar.jsp"%>

	<!-- Banner -->
	<div class="container-fluid p-0 m-0">
		<div class="jumbotron primary-background text-white">
			<div class="container">
				<div class="display-3">Welcome To TechBlog</div>
				<p>A programming language is a formal language comprising a set
					of instructions that produce various kinds of output. Programming
					languages are used in computer programming to implement algorithms.</p>
				<p>Most programming languages consist of instructions for
					computers. There are programmable machines that use a set of
					specific instructions, rather than general programming languages.
					Since the early 1800s, programs have been used to direct the
					behavior of ma</p>

				<button class="btn btn-outline-light">
					<span class="fa fa-user-plus"></span>Start ! its Free
				</button>
				<button class="btn btn-outline-light">
					<span class="fa fa-user-circle fa-spin"></span>Login
				</button>

			</div>
		</div>
	</div>


	<!-- card -->
	<div class="container">
		<div class="row mb-2">
			<div class="col-md-4">

				<div class="card"  >
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary text-white">Read More...</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">

				<div class="card"  >
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary text-white">Read More...</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">

				<div class="card"  >
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary text-white">Read More...</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">

				<div class="card"  >
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary text-white">Read More...</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">

				<div class="card"  >
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary text-white">Read More...</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">

				<div class="card"  >
					<div class="card-body">
						<h5 class="card-title">Java Programming Language</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary text-white">Read More...</a>
					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>
