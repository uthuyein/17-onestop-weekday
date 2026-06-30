package com.jdc.mkt.util;

public class HtmlGeneartor {

private static final String HEADER = """
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Information</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
	</head>
	<body>
	<div class='container p-5'>
	""";

	private static final String FOOTER = """
	</div>
	</body>
	</html>
	""";
	
	public static  String getHtmlHeader() {
		return HEADER;
	}
	
	public static  String getHtmlFooter() {
		return FOOTER;
	}
}
