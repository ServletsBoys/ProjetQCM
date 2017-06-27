<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
		<link rel="stylesheet" href="<%= request.getContextPath() %>/bootstrap/bootstrap.min.css">
		<title>SERVLETBOYS - LOGIN</title>
	</head>
	<body>
		<form action="index.jsp" style="text-align:center;margin-top:20%;">
			<input type="text" value="login" name="login" class="login" />
			<br/><br/><input type="password" value="password" name="password" class="password" />
			<br/><br/><input type="submit" value="se connecter" />
		</form>
		
	</body>
</html>