<%@page import="java.sql.*" %>
<html>
<head>
<title>Search Page</title>
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
	.y
	{
		font-size: 20px;
	}
</style>
</head>
<body>
    
<div class="top1">
	<div class = "row">
		<div class="col-md-3">
			<br>
			<h1 class="t4">Search Material</h1>
		</div>
		<div class="col-md-7"></div>
	</div>
</div>
<div class="body">
	 <%
            Connection con;
            Statement s;
            ResultSet rs;
            String url="jdbc:mysql://localhost:3306/academy";
            try    
            {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(url,"root","");
             s=con.createStatement();
             String a=request.getParameter("se");
             
             String sql="SELECT * FROM search WHERE bookname LIKE '%"+ a + "%'";
             rs=s.executeQuery(sql);
             while(rs.next())
             {
               %>
               <ul class="list-group justify-content-center op">
                   <li class ="list-group-item"><a href="<% out.print(rs.getString(1));%>"><%out.print(rs.getString(2));%></a></li>
                 <%
             }
             %>
               </ul>
            <%
             String sql1="SELECT * FROM gk WHERE gkmonth LIKE '%"+ a + "%'";
             rs=s.executeQuery(sql1);
             while(rs.next())
             {
               %>
               <ul class="list-group justify-content-center op">
                   <li class ="list-group-item"><a href="<% out.print(rs.getString(1));%>"><%out.print(rs.getString(2));%></a></li>
                 <%
             }
             %>
               </ul>
            <%
            }
            
            catch(Exception e)
            {
                e.printStackTrace();
            }
         %>
	<font size="30px">
		<ol type="1">
	<table align="center" class="y" >
		
	</table>
	</ol>
	</font>
</div>
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