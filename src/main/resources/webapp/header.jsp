<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RGBH</title>
<link href="css/sliderResponsive.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js" ></script>
	<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
   
	
	<script>
		$(document).ready(function(){
			
			$("#menu-toggle").click(function(){
				
				$("#menu-wrapper").slideToggle('fast');
			});
			
		});
	</script>
	
	
	<style>

#slider2 {
    max-width: 30%;
    margin-right: 20px;
}

.row2Wrap {
    display: flex;
}

.content {
    padding: 50px;
    margin-bottom: 100px;
}

html {
    height: 100%;
    box-sizing: border-box;
}
*, *:before, *:after {
    box-sizing: inherit;
}
h1, h2, h3 {
    font-family: 'Crimson Text', sans-serif;
    font-weight: 100;
}
body {
    font: 15px 'Titillium Web', Arial, sans-serif;
    background: radial-gradient(#121212, #000);
    height: 100%;
    color: #aaa;
    margin: 0;
    padding: 0;
}

.content {
    padding: 10px 15vw;
}
</style>

</head>
<body>
<div id="header">
				
				<div id="logo">
					<a href="index.jsp"><img src="images/logo.png" alt="LOGO" height="80" width="700"></a>
				</div>
				
				<% 

String n=(String)session.getAttribute("uname");  
//out.print("Hello "+n);  
if(n==null){
	response.sendRedirect("index.jsp");
	
}else{
	%>
	<div style="clear: both; float: right; margin-right: 25px; padding-bottom: 10px; margin-top: -35px;">
	<a href="logout.jsp">Logout</a>
	</div>
	<% 
	
}

%>
				
				<div id="navigation">
					<a href="#" id="menu-toggle">Menu</a>
					<ul id="menu-wrapper">
						<li class="selected">
							<a href="index.jsp">Home</a>
						</li>
						<li>
							<a href="about.jsp">About</a>
						</li>
						<li>
							<a href="rooms.jsp">Rooms</a>
						</li>
						
						<li>
							<a href="food.jsp">Food</a>
						</li>
						<li>
							<a href="registeration.jsp">REGISTER</a>
						</li>
						<li>
							<a href="contact.jsp">Contact Us</a>
						</li>
					</ul>
				</div>
				
			</div>
