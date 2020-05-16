<script>
function myFunction() {
    alert("Quuery Submited Succesfully");
}
</script>
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
    <h1 style="color:rgb(0,0,0)";">Contact Us:-</h1>
               <div id="loginForm">
       		<form action="ContactCtl" method="post">
    		
    		<div class="row">
    			<input type="text" name="name" placeholder="Name"/>
  			</div> 
  			
  			<div class="row">
    			<input type="text" name="email" placeholder="Email"/>
  			</div> 
  			  
  			<div class="row">
    			<textarea  name="textMsg" placeholder="Enter your message...."></textarea>
  			</div> 
		
			
  			<div class="row">	
    			<button type="submit"  value="Login" >Submit to us</button>
			</div>
		
		
 </form>
 </div>
 </div>

 <jsp:include page="footer.jsp"/>