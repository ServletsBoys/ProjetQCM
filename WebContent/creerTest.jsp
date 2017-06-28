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
		<div class="titre">
			<h2>ENI - QCM</h2>
			<h4>Création d'un test</h4>
		</div>
		<div class="container">
			<div class="champ">
				<div class="zonelabel">
					<label>Nom:</label>
				</div>
				<div class="zoneinput">
					<input type="text" value="" name="nomqcm" />	
				</div>
			</div>
			<div class="champ">
				<div class="zonelabel">
					<label>Descriptif:</label>
				</div>
				<div class="zoneinput">
					<textarea rows="4" cols="50" name="descriptifqcm">
					</textarea>
				</div>
			</div>
			<div class="champ">
				<div class="zonelabel">
					<label>Timer:<span>(en minute)</span></label>
				</div>
				<div class="zoneinput">
					<input type="number" value="00" name="timerqcm" />	
				</div>
			</div>
			<div class="champ">
				<div class="zonelabel">
					<label>Type</span></label>
				</div>
				<div class="zoneinput">
					<select name="typeqcm">
						<option>ECF</option>
						<option>ADMISSION</option>
						<option>DIVERS</option>
						<option>PARTIELS</option>
					</select>
				</div>
			</div>
			<div class="zonebtn">
				<a href="listeQcm.jsp">Retour</a>
				<input type="submit" value="creer !" name="submitBTN" />
				
			</div>
		</div>	
	</body>
</html>