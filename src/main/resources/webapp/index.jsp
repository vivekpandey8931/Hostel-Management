
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
           <div id="loginForm">
       		<form action="LoginCtl" method="post">
    		
    		<div class="row">
    			<input type="text" name="email" placeholder="Email"/>
  			</div> 
  			
  			<div class="row">
    			<select name="loginSelector">
     			 <option value="student">Student</option>
   	 			 <option value="admin">Admin</option>
   				 </select>
  			</div> 
  			  
			<div class="row">
    		<input type="password"  name="password" placeholder="Password"/>
			</div>	
			
			<div class="row">	
    			<button type="submit"  value="Login">Login</button>
			</div>	 
			
 </form>
 </div>
 
 </div>

 <jsp:include page="footer.jsp"/>