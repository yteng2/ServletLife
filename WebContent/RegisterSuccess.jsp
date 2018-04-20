<%@page import="rjt.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
<% User user = (User)request.getAttribute("user"); %>
		<div>
			firstname
			<p><%= user.getFirstname() %></p>
		</div>
		<div>
			lastname
			<p><%= user.getLastname() %></p>
		</div>
		<div>
			password
			<p><%= user.getPassword() %></p>
		</div>
		<div>
			gender
			<p><%= user.getGender() %></p>
		</div>
		<div>
			skill:
			<p><%= user.getSkills() %></p>
		</div>
		<div>
			city
			<p><%= user.getCity() %></p>
		</div>
</body>
</html>