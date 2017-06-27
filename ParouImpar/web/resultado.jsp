<%-- 
    Document   : resultado
    Created on : 08/06/2017, 21:54:16
    Author     : RA21605876
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Jogo do par ou impar</h1>
        <h2> Numero sorteado: ${requestScope.numsis}</h2>
        <h2> Você venceu: ${requestScope.result}</h2>
        
        <br/>
        
    
        <c:if test ="${scopeScope.result==false}">
            <img src="http://www.criarmeme.com.br/meme/meme-31162--perdi-todos-os-meus-contatos.jpg"
                 width="300px">
        </c:if>
            <c:if test="${requestScope.result==true}">
                <img src="http://www.eudonadecasa.com.br/wp-content/uploads/2013/07/memebaby2.jpg"
                width="300px">
                </c:if>
            
    </body>
</html>
