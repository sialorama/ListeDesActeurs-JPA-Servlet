<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Films par Acteur</title>
</head>
<body>
<h1>Films réalisés par cet acteur :</h1>
<table border="1">
    <thead>
    <tr>
        <th>Titre</th>
        <th>Année</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="film" items="${films}">
        <tr>
            <td>${film.titre}</td>
            <td>${film.annee}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
