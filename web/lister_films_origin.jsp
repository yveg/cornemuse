<%-- 
    Document   : lister_films
    Created on : 28 sept. 2016, 11:52:16
    Author     : yves
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Formation Java HTML">
        <meta name="keywords" content="Java,HTML,CSS,XML,JavaScript">
        <meta name="author" content="Eve">
        <style type="text/css">
            html, body {
                margin: 0;
                padding: 0;
                text-align: center;
                background-color: #3B0B0B;
                color:  pink;
                font: 1.2em bradley hand itc, sans-serif;
                font-family: ""Bradley Hand ITC", "Comic Sans MS", sans-serif;";
            }
            a { font-weight: bold;}
            a:link {
                color: white;
                text-decoration: none;
            }
            a:hover {
                color: grey;
                text-decoration: underline;

            }
            a:visited {
                color: white;
            }
            a:focus {
                color: bisque;
            }
            h1 { color:  pink;
                 font: 1.3em bradley hand itc, sans-serif;
                 font-family: ""Bradley Hand ITC", "Comic Sans MS", sans-serif;";
                 font-weight: bold;
            }
        </style> 
    </head>
    <body>
        <h1 align="center">Lista de peliculas JSP </h1>
        <h2>${titre}</h2>
        <ul>
            <li>Star Wars</li>
            <li>Dr Strange</li>
            <li>Ghost in The Shell</li>
            <li>Suicide SQuad</li>
            <li>Dracula</li>
            <li>Kung Fu Panda</li>
        </ul> 
        <p align="left"></p>
        
        <div><c:forEach items="${mesfilms}" var="monfilm">${monfilm.titre}<br></c:forEach></div>
        
        <a href="index.html" target="self_">retour</a>
        ${pied2page}
    </body>
</html>
