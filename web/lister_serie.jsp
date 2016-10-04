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
        <div class="titre">TITRE</div>
        <div class="contenu">
            <c:forEach items="${messeries}" var="maserie">${maserie.titre}<br>
                <a href="supp_serie?monId=${maserie.id}">Supprimer ${maserie.titre} </a><br>
                 <a href="modifier_serie?monId=${monfilm.id}">Modifier ${monfilm.titre}</a><br>
            </c:forEach></div>

        <div class="pied">PIED<c:import url="Pied.jsp"/></div>
    </body>
</html>
