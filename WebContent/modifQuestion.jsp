<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@include file="header.jsp" %>
	<body>
		<div class="titre">
			<h2>ENI - QCM</h2>
			<h4>Modification de la question:<p> " ${test.libelle} "</p></h4>
		</div>
		<div class="container">
			<form id="myform" action="modifTestServlet?idTest=${test.id}" method="POST" >
				<div class="champ">
					<div class="zonelabel">
						<label>libelle:</label>
					</div>
					<div class="zoneinput">
						<input type="text" value="${test.libelle}" name="libelle" />	
					</div>
				</div>
				<hr/>
				
			</form>
		</div>
	</body>
</html>