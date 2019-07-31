<%-- 
    Document   : loginlogic
    Created on : 20 Jul, 2019, 1:28:18 PM
    Author     : swayamjaiswal
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
             String b=request.getParameter("email");
             String c=request.getParameter("pass");
             out.print("Demo");
             String sql=("select course from registration where emailid='"+b+"' and password='"+c+"'");
             rs=s.executeQuery(sql);
             if(rs.next())
             {
                if(rs.getString(1).equals("IAS"))
                {
                    response.sendRedirect("ias.jsp");
                }
                else if(rs.getString(1).equals("CDS"))
                {
                    response.sendRedirect("cds.jsp");
                }
                else if(rs.getString(1).equals("SSC"))
                {
                    response.sendRedirect("ssc.jsp");
                }
                else
                {
                    out.print("Error");
                }
             }
             else
             {
                    out.print(" Login Error"); 
             }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            %>
    </body>
</html>
