package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Contact Page</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.z1\r\n");
      out.write("\t{\r\n");
      out.write("\t\theight: 50%;\r\n");
      out.write("\t\tbackground-image: url(\"Image/full01.png\");\r\n");
      out.write("\t\tbackground-size:100% 100%;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\"> \r\n");
      out.write("\t<div class=\"row z1\">\r\n");
      out.write("\t</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-lg-12 col-md-12\">\r\n");
      out.write("<div class=\"title_area\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-lg-8 col-md-8 col-sm-8\">\r\n");
      out.write("<div class=\"contact_form wow fadeInLeft\">\r\n");
      out.write("<form class=\"submitphoto_form\">\r\n");
      out.write("<input type=\"text\" class=\"wp-form-control wpcf7-text\" placeholder=\"Your name\" name=\"name\">\r\n");
      out.write("<input type=\"mail\" class=\"wp-form-control wpcf7-email\" placeholder=\"Email address\" name=\"email\">\r\n");
      out.write("<input type=\"text\" class=\"wp-form-control wpcf7-text\" placeholder=\"Subject\" name=\"sub\">\r\n");
      out.write("<textarea class=\"wp-form-control wpcf7-textarea\" cols=\"30\" rows=\"10\" placeholder=\"What would you like to tell us\" name=\"sugg\"></textarea>\r\n");
      out.write("<input type=\"submit\" value=\"Submit\" class=\"wpcf7-submit\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("<div class=\"contact_address wow fadeInRight\">\r\n");
      out.write("<h3>Contact Us</h3>\r\n");
      out.write("<p>ACADEMY - Online Study Portal\r\n");
      out.write("<p>Phone: +91-7388616550, +91-8004045940</p>\r\n");
      out.write("<p>Fax: 0551-2270011</p>\r\n");
      out.write("<p>Email: swayam8jaiswal8@gmial.com</p>\r\n");
      out.write("<p>Guidance : 9235500507, 8765783798 </p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"address_group\">\r\n");
      out.write("<ul class=\"footer_social\">\r\n");
      out.write("<li><a href=\"https://www.facebook.com/mmmut.ac.in\" class=\"soc_tooltip\" title=\"\" data-placement=\"top\" data-toggle=\"tooltip\" data-original-title=\"Facebook\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("<li><a href=\"https://twitter.com/MMMUTgkp\" class=\"soc_tooltip\" title=\"\" data-placement=\"top\" data-toggle=\"tooltip\" data-original-title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("<li><a href=\"http://in.linkedin.com/edu/madan-mohan-malaviya-university-of-technology-43540\" class=\"soc_tooltip\" title=\"\" data-placement=\"top\" data-toggle=\"tooltip\" data-original-title=\"Linkedin\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("<li><a href=\"https://www.youtube.com/user/mmmut1\" class=\"soc_tooltip\" title=\"\" data-placement=\"top\" data-toggle=\"tooltip\" data-original-title=\"Youtube\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("<footer id=\"footer\">\r\n");
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
      out.write("<p>Designed by SJ</a></p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/queryloader2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/slick.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.animate-enhanced.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.superslides.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/js/jquery.circliful.min.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\" src=\"js/jquery.tosrus.min.all.js\"></script>\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
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
