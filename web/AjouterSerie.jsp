<%-- 
    Document   : AjouterSerie
    Created on : 30 sept. 2016, 11:33:56
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Serie</title>
        <c:import url="Head.jsp"/>
    </head>
    <body>
        
        <div class="menu">MENU <c:import url="Menu.jsp"/></div>
        <div class="titre">Nouvelle Serie</div>
        <div class="contenu">
            <form method="POST">
                <label>Titre</label>
                <input name="titre" type="text"/><br>
                <label>Synopsis</label>
                <textarea name="synopsis"></textarea><br>
                <!--<label>Genre de s&acute;rie</label>
                <input name="genre" type="text"/><br>-->
                <input type="submit" value="Ajouter"/>
            </form>
            CONTENU</div>
        
        <div class="pied">PIED<c:import url="Pied.jsp"/></div>
    </body>
</html>
