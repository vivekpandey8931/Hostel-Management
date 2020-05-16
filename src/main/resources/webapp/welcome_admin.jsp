<%@page import="java.util.ArrayList"%>
<%@page import="com.hostel.mgt.bean.RoomBean" %>
<%@page import="com.hostel.mgt.model.RoomModel" %>
<jsp:include page="header.jsp"/>

<div id="admin">
<div id="roomBtn">
	<form action="RoomCtl" method="post">
	<input type="hidden" name="param" value="roomDetails" >
    <input type="submit" value="Check Available Room" id="btn">
	</form>
</div>

<div id="roomBtn">
    <form action="RoomCtl" method="post">
     <input type="hidden" name="param" value="AddNewRoom" >
    <input type="submit" value="Add New Room" id="btn">
	</form>
</div>

<div id="roomBtn">
	<form action="RoomCtl" method="post">
	<input type="hidden" name="param" value="AllotARoom" >
     <input type="submit" value="Allot A Room" id="btn">
	</form>
</div>

<div id ="data">
</div>

</div>



