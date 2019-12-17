<%-- 
    Document   : index
    Created on : 16-Mar-2019, 6:05:43 PM
    Author     : trung
--%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using Form</title>
    </head>
    
    <%
        //Date date = new Date(); 
        %>
    <body>
        <h1>Using Form</h1>
        <p></p>
        <form name="myForm" action="display.jsp" method="POST">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>First Name: </td>
                        <td><input type="text" name="first" value="" size="50" /> </td>
                    </tr>
                    <tr>
                        <td>Last Name: </td>
                        <td><input type="text" name="last" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Email: </td>
                        <td><input type="text" name="email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Gender: </td>
                        <td><select name="gender">
                                <option>Male</option>
                                <option>Female</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Date of Birth: </td>
                        <td><input type="text" name="dob" value="MM/YY/YYYY" size="15" /></td>
                    </tr>
                    
                </tbody>
                
            </table>
            <input type="reset" value="Clear" name="clear" />
            <input type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
