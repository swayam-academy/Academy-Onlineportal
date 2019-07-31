<html>
<head>
	<title>SignUp Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/icon" href="img/wpf-favicon.png"/>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/superslides.css">
<link href="css/slick.css" rel="stylesheet">
<link rel='stylesheet prefetch' href='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/css/jquery.circliful.css'>
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/queryLoader.css" type="text/css" />
<link type="text/css" media="all" rel="stylesheet" href="css/jquery.tosrus.all.css" />
<link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">
<link href="style.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Merriweather' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Varela' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="basic.css">
<style type="text/css">
	.t4
  {
    text-align: center;
    font-size: 60px;
    font-family: Times new roman;
  }
  .cc
  {
  	background: url("Image/n3.jpg");
  	background-size: 100% 100%;
  	height: 45%;
  }
</style>
</head>
<body>
	<div class="top1">
	<div class = "row">
		<div class="col-md-3">
			<br>
			<h1 class="t4">REGISTER</h1>
		</div>
		<div class="col-md-7"></div>
	</div>
</div>
<div class="container cc">
	<form method="post" action="Signuplogic.jsp" onsubmit=" return validation()">
		<div class="form-group">
			<label></label>
			<input type="text" class="form-control" placeholder="Name" name="user" id="user" autocomplete="off" required="">
			<span id="username" class="text-danger font-weight-bold"></span>
		</div>
		<div class="form-group">
			<label></label>
			<input type="email" class="form-control" placeholder="Email" name="email" id="email" autocomplete="off">
			<span id="em" class="text-danger font-weight-bold"></span>
		</div>
  
  <div class="form-group">
    <label for="exampleInputPassword1"></label> 
    <input type="password" class="form-control"  placeholder="Password" name="pass" id="pass" autocomplete="off">
    <span id="pd" class="text-danger font-weight-bold"></span>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"></label>
    <input type="password" class="form-control"  placeholder="Confirm Password" name="conpass" id="conpass" autocomplete="off">
    <span id="cpd" class="text-danger font-weight-bold"></span>
  </div>
   <div class="form-group">
  <label for="inputState"></label>
      <select id="inputState" class="form-control" name="course">
        <option selected>Courses</option>
        <option>IAS</option>
         <option>CDS</option>
          <option>SSC</option>
      </select>
    </div>
  <center><button type="submit" class="btn btn-danger">Submit</button></center>
  <center><p>Have an account?<a href="index.jsp" class="text-danger"><b>LOGIN NOW</b></a></p></center>
</form>
</div>

<script type="text/javascript">
	function validation()
	{
		var a=document.getElementById('user').value;
		var b=document.getElementById('email').value;
		var c=document.getElementById('pass').value;
		var d=document.getElementById('conpass').value;
		var e=document.getElementById('mob').value;
		if(a=="")
		{
			document.getElementById('username').innerHTML= "**Please fill username";
			return false;
		}
		if(a.length<5|| a.length>20)
		{
			document.getElementById('username').innerHTML="** Username must be in between 5 to 20 characters";
			return false;
 		}
		
		if(b=="")
		{
			document.getElementById('em').innerHTML= "**Please fill email";
			return false;
		}
		
		if(c=="")
		{
			document.getElementById('pd').innerHTML= "**Please fill Password";
			return false;
		}
		if(c.length<8|| c.length>20)
		{
			document.getElementById('em').innerHTML= "**  Password mustbe in between 8 to 20 characters";
			return false;
		}

		if(d=="")
		{
			document.getElementById('cpd').innerHTML= "**Please fill confirm password";
			return false;
		}
		if(c.length<8|| c.length>20)
		{
			document.getElementById('em').innerHTML= "** Confirm Password mustbe in between 8 to 20 characters";
			return false;
		}

		if(e=="")
		{
			document.getElementById('mb').innerHTML= "**Please fill mobile Number";
			return false;
		}



	}
</script>
<footer id="footer">
<div class="footer_top">
<div class="container">
<div class="row">
<div class="col-ld-3  col-md-3 col-sm-3">
<div class="single_footer_widget">
<h3>Contact Us</h3>
<p>ACADEMY - Online Study Portal
<p>Phone: +91-7388616550, +91-8004045940</p>
<p>Fax: 0551-2270011</p>
<p>Email: swayam8jaiswal8@gmial.com</p>
<p>Guidance : 9235500507, 8765783798 </p>
</div>
</div>
<div class="col-ld-3  col-md-3 col-sm-3">
<div class="single_footer_widget">
<h3>Social Links</h3>
<ul class="footer_social">
<li><a data-toggle="tooltip" data-placement="top" title="Facebook" class="soc_tooltip" href=""><i class="fa fa-facebook"></i></a></li>
<li><a data-toggle="tooltip" data-placement="top" title="Twitter" class="soc_tooltip"  href=""><i class="fa fa-twitter"></i></a></li>
<li><a data-toggle="tooltip" data-placement="top" title="Linkedin" class="soc_tooltip"  href=""><i class="fa fa-linkedin"></i></a></li>
<li><a data-toggle="tooltip" data-placement="top" title="Youtube" class="soc_tooltip"  href=""><i class="fa fa-youtube"></i></a></li>
</ul>
</div>
</div>
</div>
</div>
</div>
<div class="footer_bottom">
<div class="container">
<div class="row">
<div class="col-lg-6 col-md-6 col-sm-6">
<div class="footer_bootomLeft">
<p> Copyright &copy; All Rights Reserved</p>
</div>
</div>
<div class="col-lg-6 col-md-6 col-sm-6">
<div class="footer_bootomRight">
<p>Designed by SJ</p>
</div>
</div>
</div>  
    </div>
	</div>
</body>
</html>