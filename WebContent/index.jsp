<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="Servlet1" >Servlet1</a>
	<a href="Servlet2" >Servlet2</a>
	<a href="timeServlet">get time</a>
	<form action = "timeServlet">
	<button  type = "submit">get time</button>
	</form>
	<form action = Login method = "post">
		<input type = text name = "username"/>
		<input type = password name = "password"/>
		<button  type = "submit">login</button>
	</form>
	<a href="Refresh">Refresh</a>
	<a href="Ispace">Ispace</a>
	
	<form action = "Register" method = "post">
		<div>
			firstname
			<input type = text name = firstname />
		</div>
		<div>
			lastname
			<input type = text name = lastname />
		</div>
		<div>
			password
			<input type = password name = password />
		</div>
		<div>
			gender
			<input type = "radio" name = gender value = male checked/> 
			male
			<input type = "radio" name = gender value = female />
			female
		</div>
		<div>
			skill:
			<input type="checkbox"  name="skill" value="java">
			java
			<input type="checkbox"  name="skill" value=".net">
			.net
			<input type="checkbox"  name="skill" value="testing">
			testing
			<input type="checkbox"  name="skill" value="mainframe">
			mainframe
		</div>
		<div>
			select city
			<select name = city>
			  <option value="Chicago">Chicago</option>
			  <option value="St charles">St charles</option>
			  <option value="Los angle">Los angle</option>
			  <option value="New York">New York</option>
			</select>
		</div>
		<button type = submit>registe</button>
	</form>
	<form action = "Calculate" method = post>
		Consumer number:
		<input type ="text" name ="consumerNumber"/>
		Last Month Meter Reading
		<input type ="text" name ="lastMonthNumber"/>
		Current Month Meter Reading
		<input type ="text" name ="currentMonthNumber"/>
		<button type =submit> Caldute Bill </button>
	</form>

</body>
</html>