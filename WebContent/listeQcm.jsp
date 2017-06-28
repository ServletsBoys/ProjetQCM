<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/bootstrap/bootstrap.min.css">
		<title>SERVLETBOYS - QCMs</title>
		<ul class="liste">
			<li><a href="/">index</a></li>
			<li><a href="/">creation de qcm</a></li>
			<li><a href="/">liste de qcm</a></li>
			<li><a href="/">resultats</a></li>
			<li><a href="/">log-out</a></li>
		</ul>
	</head>
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