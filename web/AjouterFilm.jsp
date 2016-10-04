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
        <div class="titre">Nouveau Film</div>
        <div class="contenu">
            <form method="POST">
                <label>Titre</label>
                <label>Genre</label>
                <select name="genreId">
                    <c:forEach items="${lesgenres}" var="genreact">
                        <option value="${genreact.id}">${genreact.nom}</option>
                    </c:forEach>
                </select>
                   
                <input name="titre" type="text"/><br>
                <label>Synopsis</label>
                <textarea name="synopsis"></textarea><br>
                <label>Ann&eacute;e de production</label>
                <input name="annee" type="text"/><br>
                <label>dur&eacute;e du film</label>
                <input name="duree" type="text"/><br>
                <input type="submit" value="Ajouter"/>
            </form>
            CONTENU</div>
        
        <div class="pied">PIED<c:import url="Pied.jsp"/></div>
    </body>
</html>
