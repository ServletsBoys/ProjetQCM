	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/bootstrap/bootstrap.min.css">
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<title>SERVLETBOYS - QCMs</title>
		<ul class="liste">
			<li><a href="index.jsp">index</a></li>
			<li><a href="creerTest.jsp">creation de qcm</a></li>
			<li><a href="listeQcmServlet">liste de qcm</a></li>
			<li><a href="/">resultats</a></li>
			<li><a href="login.jsp">log-out</a></li>
		</ul>
	</head>