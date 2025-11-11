<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">

<form action="processForm">

  <div class="col-6">
  <div class="row" >  <h1> Login Form </h1></div>

  </br>
    <div class="row">
      <input type="text" class="form-control" placeholder="Enter First name" name="fname">
    </div>
    <div> </br> </div>
    <div class="row">
      <input type="text" class="form-control" placeholder="Enter Last name" name="lname">
    </div>
<div> </br> </div>
    <div class="row">
          <input type="text" class="form-control" placeholder="Enter Email Address"name="email">
        </div>
<div> </br> </div>
        <div class="row">
              <input type="text" class="form-control" placeholder="DD-MM-YYYY"name="date">
            </div>
<div> </br> </div>
            <div class="row">
                  <input type="text" class="form-control" placeholder="Enter City" name="city">
                </div>
<div> </br> </div>
                <div class="row-3 col-3"  >
                                  <input type="submit" class="form-control btn btn-primary" >
                                </div>

  </div>
</form>


    </body>
</html>

