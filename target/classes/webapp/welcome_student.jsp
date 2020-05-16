<%@page import="com.hostel.mgt.bean.StudentBean"%>
<jsp:include page="header.jsp" /> 


<% StudentBean sb=(StudentBean)request.getAttribute("sb"); %>
<h1 style="margin-left: 70px;">Welcome :<%out.println(sb.getName()); %> </h1>
<div id="welcomeStudent">

 <div id="welcomeStudentrow"><%out.println(sb.getName()); %></div>
 
 <div id="welcomeStudentrow"><%out.println(sb.getPhoneNumber()); %></div>
 
 <div id="welcomeStudentrow"><% out.println(sb.getEmail());%></div>
 

</div>