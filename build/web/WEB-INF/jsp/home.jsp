
   <%@include file="includes/header.jsp" %>

        <form:form  class="form-horizontal" role="form" action="HSpringHiber/AddBook" commandName="booksForm" method="POST">
            
            <div class="form-group has-success has-feedback">
            <label class="col-sm-2 control-label"  for="title">Book Title</label>
             <div class="col-xs-10">
            <form:input path="title"  class="form-control" />
             </div>
            </div>
             <div class="form-group has-success has-feedback">
                 <label for="author" class="col-sm-2  control-label" >Author Name</label>
                 <div class="col-xs-10">
                     <form:input path="author"  class="form-control" />
                 </div>
                 
             </div>
             <div class="form-group has-success has-feedback">
                 <label for="isbn" class="col-sm-2 control-label"  >Book ISBN</label>
                 <div class="col-xs-10">
                     <form:input path="isbn"  class="form-control"  />
                 </div>
                 
             </div>
             <div class="form-group has-success has-feedback">
                  <label for="price" class="col-sm-2 control-label" >book Price </label>
                  <div class="col-xs-10">
                      <form:input path="price" class="form-control"  />
                  </div>
                  
             </div>
           
                      <center> 
                          <form:button class="btn btn-info" name="submit">Submit</form:button>
                          
                      </center>
            
        </form:form>
        </div>
    </body>
</html>
