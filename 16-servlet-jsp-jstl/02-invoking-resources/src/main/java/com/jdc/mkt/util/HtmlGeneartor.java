package com.jdc.mkt.util;

public class HtmlGeneartor {

	private static final String HEADER = """
										<!DOCTYPE html>
										<html>
										<head>
										<meta charset="UTF-8">
										<title>Information</title>
										</head>
										<body>
										""";

	private static final String FOOTER = """
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
