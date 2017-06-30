<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@include file="header.jsp" %>
	<body>
		<div class="content">
			<a href="creerQuestion">Creer une Question</a>
		</div>
		<table class="tableQCM">
			<tr>
				<th>Nom </th>
				<th>image</th>
				<th>type</th>
				<th>section</th>
				<th></th>
				<th></th>
			</tr>		
			<c:forEach var="item" items="${lesQuestions}">
				<tr>
					<td>${item.libelle}</td>
					<td>${item.image}</td>
					<td>${item.type_question.libelle}</td>
					<td>${item.section.libelle }</td>
					<td><a href="modifQuestionServlet?idQuestion=${item.id}">modifier</a></td>
					<td><a href="deleteQuestionServlet?idQuestion=${item.id}">Supprimer</a></td>
				</tr>
			</c:forEach>	
		</table>
	</body>
</html>