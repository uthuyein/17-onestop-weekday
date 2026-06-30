<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
	crossorigin="anonymous"></script>
<title>Listener & Filter</title>
</head>
<body>
	<div class="container pt-5 w-50">
				<%
				String message =(String) session.getAttribute("message");
				if(null != message){
				%>
				 <p class="text-primary"> <%= message%></p>
				<% 
				}
				%>
		<p class="text-primary"></p>
		<form action="./savePerson" class="form" method="post">
			<fieldset>
				<legend>Listener Servlet</legend>
				<div class="mb-3 form-group">
					<label for="name" class="form-label">Name</label>
					<input id="name" type="text" name="name" class="form-control" />
				</div>
				<div class="mb-3 form-group">
					<label for="age" class="form-label">Age</label>
					<input id="age" type="number" name="age" class="form-control" />
				</div>
				<div class="mb-3">
				<button class="btn btn-outline-primary">Submit</button>
				<a href="./clear" class="btn btn-outline-secondary">Clear</a>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>