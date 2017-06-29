<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@include file="header.jsp" %>
	<body>
		<div class="content">
			<a href="creerTest.jsp">Créer un test</a>
			<table class="tableQCM">
				<tr>
					<th>Nom (id)</th>
					<th>nb questions</th>
					<th>temps(min)</th>
					<th>Formateur associé</th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<c:forEach var="item" items="${lesTests}">
					<tr>
						<td>${item.libelle}</td>
						<td>${item.nbQuestion}</td>
						<td>${item.timer}</td>
						<td>${item.utilisateur.nom} ${item.utilisateur.prenom}</td>
						<td><a href="modifTestServlet?idTest=${item.id}">modifier</a></td>
						<td><a href="">ajouter participant</a></td>
						<td><a href="deleteQcmServlet?idTest=${item.id}">Supprimer</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>