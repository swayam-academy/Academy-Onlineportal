package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>SignUp Page</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/icon\" href=\"img/wpf-favicon.png\"/>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/superslides.css\">\r\n");
      out.write("<link href=\"css/slick.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel='stylesheet prefetch' href='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/css/jquery.circliful.css'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/queryLoader.css\" type=\"text/css\" />\r\n");
      out.write("<link type=\"text/css\" media=\"all\" rel=\"stylesheet\" href=\"css/jquery.tosrus.all.css\" />\r\n");
      out.write("<link id=\"switcher\" href=\"css/themes/default-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Merriweather' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Varela' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"basic.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.t4\r\n");
      out.write("  {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 60px;\r\n");
      out.write("    font-family: Times new roman;\r\n");
      out.write("  }\r\n");
      out.write("  .cc\r\n");
      out.write("  {\r\n");
      out.write("  \tbackground: url(\"Image/i2.jpg\");\r\n");
      out.write("  \tbackground-size: 100% 100%;\r\n");
      out.write("  \theight: 45%;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top1\">\r\n");
      out.write("\t<div class = \"row\">\r\n");
      out.write("\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<h1 class=\"t4\">REGISTER</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-7\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container cc\">\r\n");
      out.write("\t<form method=\"post\" action=\"Signuplogic.jsp\" onsubmit=\" return validation()\">\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label></label>\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Name\" name=\"user\" id=\"user\" autocomplete=\"off\" required=\"\">\r\n");
      out.write("\t\t\t<span id=\"username\" class=\"text-danger font-weight-bold\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label></label>\r\n");
      out.write("\t\t\t<input type=\"email\" class=\"form-control\" placeholder=\"Email\" name=\"email\" id=\"email\" autocomplete=\"off\">\r\n");
      out.write("\t\t\t<span id=\"em\" class=\"text-danger font-weight-bold\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputPassword1\"></label> \r\n");
      out.write("    <input type=\"password\" class=\"form-control\"  placeholder=\"Password\" name=\"pass\" id=\"pass\" autocomplete=\"off\">\r\n");
      out.write("    <span id=\"pd\" class=\"text-danger font-weight-bold\"></span>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputPassword1\"></label>\r\n");
      out.write("    <input type=\"password\" class=\"form-control\"  placeholder=\"Confirm Password\" name=\"conpass\" id=\"conpass\" autocomplete=\"off\">\r\n");
      out.write("    <span id=\"cpd\" class=\"text-danger font-weight-bold\"></span>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("  <label for=\"inputState\"></label>\r\n");
      out.write("      <select id=\"inputState\" class=\"form-control\" name=\"course\">\r\n");
      out.write("        <option selected>Courses</option>\r\n");
      out.write("        <option>IAS</option>\r\n");
      out.write("         <option>CDS</option>\r\n");
      out.write("          <option>SSC</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  <center><button type=\"submit\" class=\"btn btn-danger\">Submit</button></center>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction validation()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar a=document.getElementById('user').value;\r\n");
      out.write("\t\tvar b=document.getElementById('email').value;\r\n");
      out.write("\t\tvar c=document.getElementById('pass').value;\r\n");
      out.write("\t\tvar d=document.getElementById('conpass').value;\r\n");
      out.write("\t\tvar e=document.getElementById('mob').value;\r\n");
      out.write("\t\tif(a==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('username').innerHTML= \"**Please fill username\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(a.length<5|| a.length>20)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('username').innerHTML=\"** Username must be in between 5 to 20 characters\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write(" \t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(b==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('em').innerHTML= \"**Please fill email\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(c==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('pd').innerHTML= \"**Please fill Password\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(c.length<8|| c.length>20)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('em').innerHTML= \"**  Password mustbe in between 8 to 20 characters\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif(d==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('cpd').innerHTML= \"**Please fill confirm password\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(c.length<8|| c.length>20)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('em').innerHTML= \"** Confirm Password mustbe in between 8 to 20 characters\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif(e==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('mb').innerHTML= \"**Please fill mobile Number\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("<div class=\"footer_top\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-ld-3  col-md-3 col-sm-3\">\r\n");
      out.write("<div class=\"single_footer_widget\">\r\n");
      out.write("<h3>Contact Us</h3>\r\n");
      out.write("<p>ACADEMY - Online Study Portal\r\n");
      out.write("<p>Phone: +91-7388616550, +91-8004045940</p>\r\n");
      out.write("<p>Fax: 0551-2270011</p>\r\n");
      out.write("<p>Email: swayam8jaiswal8@gmial.com</p>\r\n");
      out.write("<p>Guidance : 9235500507, 8765783798 </p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-ld-3  col-md-3 col-sm-3\">\r\n");
      out.write("<div class=\"single_footer_widget\">\r\n");
      out.write("<h3>Social Links</h3>\r\n");
      out.write("<ul class=\"footer_social\">\r\n");
      out.write("<li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Facebook\" class=\"soc_tooltip\" href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("<li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Twitter\" class=\"soc_tooltip\"  href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("<li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Linkedin\" class=\"soc_tooltip\"  href=\"\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("<li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Youtube\" class=\"soc_tooltip\"  href=\"\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer_bottom\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("<div class=\"footer_bootomLeft\">\r\n");
      out.write("<p> Copyright &copy; All Rights Reserved</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("<div class=\"footer_bootomRight\">\r\n");
      out.write("<p>Designed by SJ</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>  \r\n");
      out.write("    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
