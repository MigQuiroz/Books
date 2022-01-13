<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <p>Book Title ${book_title}  </p> -->

<% ArrayList<String> bookList = (ArrayList<String>)request.getAttribute("book_list");

	for(int i=0; i<bookList.size(); i++){
%>	
	<p> Book: <%= bookList.get(i).toString() %></p>
	
<%} %>


 
 
</body>
</html>