<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des Acteurs</title>
</head>
<body>
<h2>Liste des Acteurs</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
    </tr>
    <c:forEach items="${acteurs}" var="acteur">
        <tr>
            <td>${acteur.id}</td>
            <td>${acteur.nom}</td>
            <td>${acteur.prenom}</td>
        </tr>
    </c:forEach>
</table>
<form action="${pageContext.request.contextPath}/ajouterActeur" method="post">
    <input type="text" name="nom" placeholder="Nom"/>
    <input type="text" name="prenom" placeholder="Prénom"/>
    <input type="submit" value="Ajouter Acteur"/>
</form>
</body>
</html>
