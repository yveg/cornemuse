<%-- 
    Document   : Template
    Created on : 28 sept. 2016, 16:09:13
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="Head.jsp"/>
    </head>
    <body>
        
        <div class="menu">MENU <c:import url="Menu.jsp"/></div>
        <div class="titre">Modifier Serie</div>
        <div class="contenu">
            <form method="POST">
                <input type="hidden" value="${maserie.id}" name="id" />
                <label>Titre</label>
                <input name="titre" type="text" value="${maserie.titre}"/><br>
                <label>Synopsis</label>
                <textarea name="synopsis">${maserie.synopsis}</textarea><br>
                <input type="submit" value="Modifier"/>
            </form>
            CONTENU</div>
        
        <div class="pied">PIED<c:import url="Pied.jsp"/></div>
    </body>
</html>
