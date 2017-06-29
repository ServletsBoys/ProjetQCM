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
					<th>type</th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<c:forEach var="item" items="${lesTests}">
					<tr>
						<td>${item.libelle}</td>
						<td>${item.utilisateur.nom}</td>
						<td>${item.timer}</td>
						<td>zafzaf</td>
						<td><a href="">modifier</a></td>
						<td><a href="">ajouter participant</a></td>
						<td><a href="">Supprimer</a></td>
					</tr>
				</c:forEach>
				<tr>
					<td>QCM 51234</td>
					<td>23</td>
					<td>15:00</td>
					<td>logique</td>
					<td><a href="">modifier</a></td>
					<td><a href="">ajouter participant</a></td>
					<td><a href="">Supprimer</a></td>
				</tr>
				<tr>
					<td>QCM 51235</td>
					<td>45</td>
					<td>15:00</td>
					<td>servlet</td>
					<td><a href="">modifier</a></td>
					<td><a href="">ajouter participant</a></td>
					<td><a href="">Supprimer</a></td>
				</tr>
				<tr>
					<td>QCM 51236</td>
					<td>60</td>
					<td>15:00</td>
					<td>sql</td>
					<td><a href="">modifier</a></td>
					<td><a href="">ajouter participant</a></td>
					<td><a href="">Supprimer</a></td>
				</tr>
				<tr>
					<td>QCM 51237</td>
					<td>1</td>
					<td>10:00</td>
					<td>mathématiques</td>
					<td><a href="">modifier</a></td>
					<td><a href="">ajouter participant</a></td>
					<td><a href="">Supprimer</a></td>
				</tr>
			</table>
		</div>
	</body>
</html>