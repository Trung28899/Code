<%-- 
    Document   : display
    Created on : 16-Mar-2019, 6:33:43 PM
    Author     : trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using Form</title>
    </head>
    <body>
        <h1>Using Forms</h1>
        <% 
            String firstname = request.getParameter("first") ;
            String lastname = request.getParameter("last") ;
            String email = request.getParameter("email") ;
            String gender = request.getParameter("gender") ;
            String dateOfBirth = request.getParameter("dob") ;
        %>
        
        <table border="1">
            
            <tbody>
                <tr>
                    <td>FirstName: </td>
                    <td><%= firstname%></td>
                </tr>
                <tr>
                   <td>Last Name: </td>
                    <td><%= lastname%></td>
                </tr>
                <tr>
                    <td>Email:  </td>
                    <td><%= email%></td>
                </tr>
                <tr>
                    <td>Gender: </td>
                    <td><%= gender%></td>
                </tr>
                <tr>
                    <td>Date Of Birth: </td>
                    <td><%= dateOfBirth%></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
