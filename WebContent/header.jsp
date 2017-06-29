	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/bootstrap/bootstrap.min.css">
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
		<script src="<%= request.getContextPath() %>"/script.js"></script>
		<title>SERVLETBOYS - QCMs</title>
		<ul class="liste">
			<li><a href="index.jsp">index</a></li>
			<li><a href="creerTest.jsp">creation de qcm</a></li>
			<li><a href="listeQcmServlet">liste de qcm</a></li>
			<li><a href="/">resultats</a></li>
			<li><a href="./connexion">Connexion</a></li>
		</ul>
	</head>