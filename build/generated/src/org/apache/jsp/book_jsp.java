package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Admin book</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"admin1.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"Front.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class = \"container-fluid con\">\r\n");
      out.write("  <div class = \"row\">\r\n");
      out.write("  <div class = \"col-md-5\"></div>\r\n");
      out.write("  <div class = \"col-md-6\">\r\n");
      out.write("    <h2 class = \"text-danger h\">CONTENT</h2>\r\n");
      out.write("    <br>\r\n");
      out.write("  <form method =\"post\" action=\"Submit\">\r\n");
      out.write("  <div class=\"form-row\">\r\n");
      out.write("     <div class=\"form-group col-md-4\">\r\n");
      out.write("    <input type=\"text\" name = \"book_name\" class=\"form-control\" id=\"example Name\" placeholder=\"Book Name\">\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write(" <div class=\"form-row\">\r\n");
      out.write("     <div class=\"form-group col-md-4\">\r\n");
      out.write("    <input type=\"text\" name = \"id\" class=\"form-control\" id=\"example Name\" placeholder=\"Book Id\">\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"form-row\">\r\n");
      out.write("  <div class=\"form-group col-md-4\">\r\n");
      out.write("    <input type=\"text\" name = \"ct\" class=\"form-control\" id=\"example Name\" placeholder=\"Current Affairs\"> \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"form-row\">\r\n");
      out.write("    <div class=\"form-group col-md-4\">\r\n");
      out.write("      <input type=\"text\" name = \"news\"class=\"form-control\" id=\"example Name\" placeholder=\"News\"> \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"form-row\">\r\n");
      out.write("    <div class=\"form-group col-md-4\">\r\n");
      out.write("      <input type=\"text\" name = \"note\" class=\"form-control\" id=\"example Name\" placeholder=\"Notes\"> \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-row\">\r\n");
      out.write("    <div class=\"form-group col-md-4\">\r\n");
      out.write("      <input type=\"text\" name = \"paper\" class=\"form-control\" id=\"example Name\" placeholder=\"Previous paper\"> \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"form-row\">\r\n");
      out.write("    <div class=\"form-group col-md-4\">\r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-danger btn-lg btn-block\">Submit</button>\r\n");
      out.write("  <center><p>Have an account?<a href=\"Index.htm\" class=\"text-danger\"><b>LOGIN NOW</b></a></p></center>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-1\"></div>\r\n");
      out.write("</div>\r\n");
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
