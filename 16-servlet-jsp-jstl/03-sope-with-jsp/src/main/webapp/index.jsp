<%@page import="com.jdc.mkt.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
<title>Scope Test</title>
</head>
<body>
		
	<div class="container p-5">
	<div class="row">
		<div class="col">
			<h3 class="text-primary">Servlet Scope Test</h3>
		</div>
		<div class="col">
			<a href="./counter" class="btn btn-outline-primary">Count UP</a>
		</div>
	</div>
		
		<div class="row">
			<div class="col">Reques Scope :</div>
			
			<%
				Counter c1 = (Counter)request.getAttribute("counter");
				if(null == c1){
					c1 = new Counter();
				}
			%>
			
			<div class="col">
				<%= c1.getCount() %>
			</div>
		</div>
		
		<div class="row">
			<div class="col">Session Scope :</div>
				<%
					Counter c2 = (Counter)session.getAttribute("counter");
					if(null == c2){
						c2 = new Counter();
					}
				%>		
			<div class="col">
				<%= c2.getCount() %>			
			</div>
		</div>
		
		<div class="row">
			<div class="col">Application Scope :</div>
			<%
				Counter c3 = (Counter)application.getAttribute("counter");
				if(null == c3){
					c3 = new Counter();
				}
			%>
			
			<div class="col">
				<%= c3.getCount() %>
			</div>
		</div>
	</div>
</body>
</html>