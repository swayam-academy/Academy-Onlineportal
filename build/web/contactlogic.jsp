<%-- 
    Document   : contactlogic.jsp
    Created on : 21 Jul, 2019, 11:31:14 AM
    Author     : swayamjaiswal
--%>

<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            Connection con;
            Statement s;
            String url="jdbc:mysql://localhost:3306/academy";
            try{
                
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(url,"root","");
             s=con.createStatement();
             String a=request.getParameter("name");
             String b=request.getParameter("email");
             String c=request.getParameter("sub");
             String e=request.getParameter("sugg");
             int i=s.executeUpdate("insert into feedback values('"+a+"','"+b+"','"+c+"','"+e+"') ");
             if(i>0)
             {
                 response.sendRedirect("index.jsp");
              out.println("Feedback submitted successfully");   
                 
             }
             else
             {
                 out.println("Something went wrong!!");
             }
             }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            %>
    </body>
</html>
