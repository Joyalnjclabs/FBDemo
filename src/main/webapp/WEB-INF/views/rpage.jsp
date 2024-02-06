<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Regiter Page</title>
</head>
<body>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<link
		href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
		rel="stylesheet">
<body>
	<div class="container">
		<div class="col-md-6 mx-auto text-center">
			<img alt="fblogo" src='<c:url value="/resources/images/fb.png"/>' height="65px" width="160px">
			<h2>Register</h2>
		</div>
		<div class="row">
			<div class="col-md-4 mx-auto">
				<div class="myform form ">
					<form action="savedata" method="post" name="login">
						<div class="form-group">
							<input type="text" name="name" class="form-control my-input"
								id="name" placeholder="Name" required="required">
						</div>
						<div class="form-group">
							<input type="email" name="email" class="form-control my-input"
								id="email" placeholder="Email" required="required">
						</div>
						<div class="form-group">
							<input type="text" name="city" class="form-control my-input"
								id="city" placeholder="City">
						</div>

						<div class="form-group">
							<input type="number" min="0" name="phone" id="phone"
								class="form-control my-input" placeholder="Phone">
						</div>
						<div class="form-group">
							<input type="password" name="pass" class="form-control my-input"
								id="pass" placeholder="Password" required="required">
						</div>
						<div class="text-center ">
							<button type="submit" class=" btn btn-block send-button tx-tfm">Create
								Your Free Account</button>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</body>
</html>