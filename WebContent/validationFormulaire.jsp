<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "co.simplon.model.Client" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Validation du Formulaire</title>
</head>
<body>
	<% 
	Client clt = (Client)request.getAttribute("newClientAttribute");
	%>
	<div>
		<h1>Voici les informations que vous avez communiqué :</h1>
		<p>Votre Prénom : <%=clt.getPrenom()%></p>
	</div>
	<div>
		<p>Votre Nom : <%=clt.getNom()%></p>
	</div>
	<div>
		<p>Votre numéro de téléphone : <%=clt.getTelephone()%></p>
	</div>
	<div>
		<p>Votre e-mail : <%=clt.getTelephone()%></p>
	</div>
	<div>
		<p>Votre adresse : <%=clt.getAdresse()%></p>
	</div>
	<div>
		<p>Parking : <%=clt.getParking()%></p>
	</div>
</body>
</html>