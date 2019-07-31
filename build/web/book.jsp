<html>
<head>
  <title>Admin book</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="admin1.css">
  <link rel="stylesheet" type="text/css" href="Front.css">
</head>
<body>
<div class = "container-fluid con">
  <div class = "row">
  <div class = "col-md-5"></div>
  <div class = "col-md-6">
    <h2 class = "text-danger h">CONTENT</h2>
    <br>
  <form method ="post" action="Submit">
  <div class="form-row">
     <div class="form-group col-md-4">
    <input type="text" name = "book_name" class="form-control" id="example Name" placeholder="Book Name">
  </div>
</div>
 <div class="form-row">
     <div class="form-group col-md-4">
    <input type="text" name = "id" class="form-control" id="example Name" placeholder="Book Id">
  </div>
</div>
  <div class="form-row">
  <div class="form-group col-md-4">
    <input type="text" name = "ct" class="form-control" id="example Name" placeholder="Current Affairs"> 
</div>
</div>
  <div class="form-row">
    <div class="form-group col-md-4">
      <input type="text" name = "news"class="form-control" id="example Name" placeholder="News"> 
    </div>
</div>
  <div class="form-row">
    <div class="form-group col-md-4">
      <input type="text" name = "note" class="form-control" id="example Name" placeholder="Notes"> 
    </div>
</div>
<div class="form-row">
    <div class="form-group col-md-4">
      <input type="text" name = "paper" class="form-control" id="example Name" placeholder="Previous paper"> 
    </div>
</div>
  <div class="form-row">
    <div class="form-group col-md-4">
  <button type="submit" class="btn btn-danger btn-lg btn-block">Submit</button>
  <center><p>Have an account?<a href="Index.htm" class="text-danger"><b>LOGIN NOW</b></a></p></center>
  </div>
</div>
</form>
</div>
<div class="col-md-1"></div>
</div>
</div>
</body>
</html>