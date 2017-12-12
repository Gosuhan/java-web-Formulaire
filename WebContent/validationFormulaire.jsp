<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Validation du Formulaire</title>
</head>
<body>
	<div>
		<h1>Voici les informations que vous avez communiqué :</h1>
		<p>Votre Prénom : <%=request.getParameter("prenom")%></p>
	</div>
	<div>
		<p>Votre Nom : <%=request.getParameter("nom")%></p>
	</div>
	<div>
		<p>Votre numéro de téléphone : <%=request.getParameter("telephone")%></p>
	</div>
	<div>
		<p>Votre e-mail : <%=request.getParameter("email")%></p>
	</div>
	<div>
		<p>Votre adresse : <%=request.getParameter("adresse")%></p>
	</div>
</body>
</html>