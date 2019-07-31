<%-- 
    Document   : Signuplogic
    Created on : 20 Jul, 2019, 1:15:05 PM
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
            String url="jdbc:mysql://localhost:3306/academy";
            try
                
            {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(url,"root","");
             s=con.createStatement();
             String a=request.getParameter("user");
             String b=request.getParameter("email");
             String c=request.getParameter("pass");
             String e=request.getParameter("course");
             int i=s.executeUpdate("insert into registration values('"+a+"','"+b+"','"+c+"','"+e+"') ");
             if(i>0)
             {
                 out.println("Registered successfully");
                 response.sendRedirect("index.jsp");
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
