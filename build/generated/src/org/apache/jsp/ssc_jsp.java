package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ssc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>SSC content</title>\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Front.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"admin1.css\">\r\n");
      out.write("   <script src=\"http://code.jquery.com/jquery-latest.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("   \r\n");
      out.write("<style>\r\n");
      out.write("  /* Make the image fully responsive */\r\n");
      out.write("  .carousel-inner img {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  .t4\r\n");
      out.write("  {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 60px;\r\n");
      out.write("    font-family: Times new roman;\r\n");
      out.write("  }\r\n");
      out.write("  .t2\r\n");
      out.write("  {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 80px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-family: Times new roman;\r\n");
      out.write("  }\r\n");
      out.write("  .ii\r\n");
      out.write("  {\r\n");
      out.write("    background-color: red;\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("<div class = \"itop\">\r\n");
      out.write("  <div class = \"row\">\r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <h1 class=\"t4\">Clear SSC</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-7\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bar0\">\r\n");
      out.write("  <br><br><br>\r\n");
      out.write("    <h1 class = t2><b>Clear SSC-CGL by self-study</b></h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  <div class=\"col-md-12\" id='cssmenu'>\r\n");
      out.write("<ul class=\"nav justify-content-center\">\r\n");
      out.write("   <li class=\"active\"><a href='Index.htm'><span>Home</span></a></li>\r\n");
      out.write("   <li class=\"active has-sub\"><a href='#'><span>Books</span></a>\r\n");
      out.write("    <ul>\r\n");
      out.write("         <li class='has-sub'><a href='#'><span>History</span></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li><a href='BOOK/Spectrum.pdf'><span>Modern History</span></a></li>\r\n");
      out.write("               <li><a href='BOOK/Ancient.pdf'><span>Ancient History</span></a></li>\r\n");
      out.write("              <li><a href='BOOK/Art&Culture.pdf'><span>Art & Culture</span></a></li>\r\n");
      out.write("               <li class='last'><a href='BOOK/RomilaThappar.pdf'><span>Mediaval History</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li class='has-sub'><a href='#'><span>Apptitude</span></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li><a href='BOOK/Indian_Economy.pdf'><span>RS Aggarwal</span></a></li>\r\n");
      out.write("               <li class='last'><a href='#'><span>Arun Sharma</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li class='has-sub'><a href='#'><span>Geography</span></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href='BOOK/GC leong.pdf'><span>GC Leong</span></a></li>\r\n");
      out.write("              <li class='has-sub'><a href='#'><span>NCERT</span></a>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href='#'><span>Class 11</span></a></li>\r\n");
      out.write("                <li class='last'><a href='#'><span>Class 12</span></a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("         <li class='has-sub'><a href='#'><span>Environment & Ecology</span></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li><a href='BOOK/ShankarIAS.pdf'><span>Shankar IAS</span></a></li>\r\n");
      out.write("               <li class='last'><a href='#'><span>NCERT Biology12th</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("\r\n");
      out.write("   <li class='active has-sub'><a href='#'><span>Current Affairs</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li class='has-sub'><a href='#'><span>Vision IAS</span></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li><a href='BOOK/ct/february2019.pdf'><span>February</span></a></li>\r\n");
      out.write("               <li><a href='BOOK/ct/march2019.pdf'><span>March</span></a></li>\r\n");
      out.write("               <li class='last'><a href='BOOK/ct/april2019.pdf'><span>April</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li class='has-sub'><a href='Basic.html'><span>Infographics</span></a>\r\n");
      out.write("         </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   <li class='active has-sub'><a href='#'><span>Newspaper</span></a>\r\n");
      out.write("    <ul>\r\n");
      out.write("         <li class='has-sub'><a href='#'><span>The Hindu</span></a>\r\n");
      out.write("        <ul>\r\n");
      out.write("               <li><a href='#'><span>May</span></a></li>\r\n");
      out.write("               <li><a href='#'><span>June</span></a></li>\r\n");
      out.write("               <li class='last'><a href='#'><span>July</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class='has-sub'><a href='#'><span>Indian Express</span></a>\r\n");
      out.write("           <ul>\r\n");
      out.write("               <li><a href='#'><span>May</span></a></li>\r\n");
      out.write("               <li><a href='#'><span>June</span></a></li>\r\n");
      out.write("               <li class='last'><a href='#'><span>July</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</li>\r\n");
      out.write("   <li class='active has-sub'><a href='#'><span>Paper solution</span></a>\r\n");
      out.write("    <ul>\r\n");
      out.write("               <li><a href='#'><span>Pre-2019</span></a></li>\r\n");
      out.write("               <li><a href='#'><span>Pre-2018</span></a></li>\r\n");
      out.write("               <li class='last'><a href='#'><span>Pre-2017</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("    <li class=\"active has-sub\"><a href='#'><span>Notes</span></a>\r\n");
      out.write("    <ul>\r\n");
      out.write("               <li><a href='BOOK/Vajiram.pdf'><span>Unacademy</span></a></li>\r\n");
      out.write("               <li class='last'><a href='#'><span>Others</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class = \"imid\">\r\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Indicators -->\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("  \r\n");
      out.write("  <!-- The slideshow -->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("      <img src=\"Image/ssc1.jpg\" class=\"d-block w-100\" alt=\"upsc\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"Image/q8.jpg\" class = \"d-block w-100\" alt=\"Syllabus\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"Image/q10.jpg\" class=\"d-block w-100\"alt=\"Motivation\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" role =\"button\"data-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\" area-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" role =\"button\"data-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\" area-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Next</span>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class = \"ibottom2\">\r\n");
      out.write("  <br><br>\r\n");
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
      out.write("<p>Email: swayam8jaiswal8@gmail.com</p>\r\n");
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
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
