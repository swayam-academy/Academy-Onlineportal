package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Search Page</title>\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
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
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"basic.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.y\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<div class=\"top1\">\r\n");
      out.write("\t<div class = \"row\">\r\n");
      out.write("\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<h1 class=\"t4\">Search Material</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-7\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"body\">\r\n");
      out.write("\t ");

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
             
             String sql="select * from registration where username ='"+a+"'";
             rs=s.executeQuery(sql);
             out.print(rs.getString(1));
             
      out.write("\r\n");
      out.write("             <table border=\"2px\">\r\n");
      out.write("                 <tr><td>UserName</td><td>EmailId</td><td>CourseName</td></tr>\r\n");
      out.write("                \r\n");
      out.write("                 ");

             while(rs.next())
             {
                 
      out.write("\r\n");
      out.write("                 <tr><td>");
rs.getString(1);
      out.write("</td><td>");
rs.getString(2);
      out.write("</td><td>");
rs.getString(3);
      out.write("</td></tr>\r\n");
      out.write("                 \r\n");
      out.write("                 </table>\r\n");
      out.write("                 ");

             }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
         
      out.write("\r\n");
      out.write("\t<font size=\"30px\">\r\n");
      out.write("\t\t<ol type=\"1\">\r\n");
      out.write("\t<table align=\"center\" class=\"y\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\t</font>\r\n");
      out.write("</div>\r\n");
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
