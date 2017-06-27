<%-- 
    Document   : Sortear
    Created on : 25/05/2017, 21:50:09
    Author     : RA21605876
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="red">
        <center>
        <i>
        <h2>O numero sorteado foi</h2>
        <h1>
        <%
         int numero = new Random().nextInt(9)+1;
         out.println(numero);
        %>
       
        </h1>
        </i>
        </center>
    </body>
</html>
