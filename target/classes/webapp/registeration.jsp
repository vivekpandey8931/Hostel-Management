<script>
function myFunction() {
    alert("Register Succesfull");
}
</script>
	
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
			<h1>JoinUs:</h1>
	
           <div id="loginForm">
       		<form action="RegisterCtl" method="post">
    		
    		<div class="row">
    			<input type="text" name="name" placeholder="Name"/>
  			</div> 
  			
  			<div class="row">
    			<input type="email" name="email" placeholder="Email"/>
  			</div> 
  			
  			<div class="row">
    		<input type="text"  name="phoneNumber" placeholder="PhoneNumber"/>
			</div>	
  			  
			<div class="row">
    		<input type="text"  name="gender" placeholder="Gender"/>
			</div>	
						
			<div class="row">
    			<input type="text" name="joinDate" placeholder="JoinDate"/>
  			</div> 
  			
  			<div class="row">
    			<input type="text" name="address" placeholder="Address"/>
  			</div> 
  			
  			<div class="row">
    			<input type="password" name="password" placeholder="Password"/>
  			</div> 
			
			
  			<div class="row">	
    			<button type="submit"  value="Login" onclick="myFunction()">Register</button>
			</div>
			
		
 </form>
 </div>
 
 </div>

 <jsp:include page="footer.jsp"/>