<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "co.simplon.model.CandidaturesManager" %>
<%@page import = "co.simplon.model.Client" %>
<%@page import = "java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <!--Import Google Icon Font-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/css/materialize.min.css">
  <!--Import mycss.css-->
  <link type="text/css" rel="stylesheet" href="css/mycss.css" />
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection" />
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Liste des candidatures</title>
</head>
<body>
      <table class="bordered striped responsive-table">
        <thead>
          <tr>
              <th>Nom</th>
              <th>Prénom</th>
              <th>Numéro de téléphone</th>
              <th>E-mail</th>
              <th>Adresse</th>
              <th>Parking</th>
              <th>Animal</th>
              <th>Fumeur</th>
              <th>Séjour</th>
          </tr>
        </thead>
<%
List<Client> listeClient = (List<Client>)request.getAttribute("listeReservation");
for(int i=0; i<listeClient.size(); i++){
	Client clt = listeClient.get(i);
%>
        <tbody>
          <tr>
            <td><%=clt.getNom()%></td>
            <td><%=clt.getPrenom()%></td>
            <td><%=clt.getTelephone()%></td>
            <td><%=clt.getEmail()%></td>
            <td><%=clt.getAdresse()%></td>
            <td><%=clt.getParking()%></td>
            <td><%=clt.getAnimal()%></td>
            <td><%=clt.getFumeur()%></td>
            <td><%=clt.getSejour()%></td>
          </tr>
    <%
    } 
    %>
      </tbody>
      </table>
</body>
</html>