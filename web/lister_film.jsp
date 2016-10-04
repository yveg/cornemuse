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
        <title>listage de film</title>
        <c:import url="Head.jsp"/>
    </head>
    <body>

        <div class="menu">MENU <c:import url="Menu.jsp"/></div>
        <div class="titre">TITRE</div>
        <div class="contenu">
            <c:forEach items="${mesfilms}" var="monfilm">${monfilm.titre}<br>
                <a href="supprimer_film?monId=${monfilm.id}">Supprimer ${monfilm.titre}</a> <!-- on definit a route supprimer_film -->
                <a href="modifier_film?monId=${monfilm.id}">Modifier ${monfilm.titre}</a><br>
            </c:forEach></div>
        
        <div class="pied">PIED<c:import url="Pied.jsp"/></div>
    </body>
</html>
