<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="header.jsp" %>
	<body>
		<div class="titre">
			<h2>ENI - QCM</h2>
			<h4>Création d'une question</h4>
		</div>
		<div class="container">
			<form id="myform">
				<div class="champ">
					<div class="zonelabel">
						<label>Question:</label>
					</div>
					<div class="zoneinput">
						<input type="text" value="" name="question" />	
					</div>
				</div>
				<hr/>
				<div class="champ">
					<div class="zonelabel">
						<label>Type:</label>
					</div>
			  		<input type="radio" name="type" value="1" > QCU
					<input type="radio" name="type" value="2" checked > QCM
				</div>
				<hr/>
				<div class="champ">
					<div class="zonelabel">
						<label>Réponses:</label>
					</div>
					<div class="zoneinput zoneinputReponse">
			  			<table class="tablereponses table">
			  				
			  			</table>
					</div>
					
				</div>
				<hr/>
				<div class="champ">
					<div class="zonelabel">
						<label>Ajouter une réponse:</label>
					</div>
					<div class="zoneinput">
						<input type="text" value="" name="reponse" id="newresponse" />
							
					</div>
				</div>
				<div class="champ">
					<div class="zonelabel">
						<label>Vérité:</label>
					</div>	
					<input type="radio" class="istrue" name=istrue value="1"> vrai
					<input type="radio" class="istrue" name="istrue" value="0" checked > faux
					<button class="btn btn-info addReponse">+ Ajouter</button>
				
				</div>
				<hr/>
				<div class="champ">
					<div class="zonelabel">
						<label>Section:</label>
					</div>	
					<div class="zoneinput">
						<select name="section">
							<option>diagramme de classe</option>
							<option>diagramme de classe</option>
							<option>diagramme de classe</option>
							<option>diagramme de classe</option>
						</select>
					</div>
				</div>
				<hr/>
				<div class="champ zonebtn">
					<a href="">Retour</a>
					<input type="submit" value="Enregistrer" name="save">
				</div>
			</form>
		</div>
	</body>
</html>