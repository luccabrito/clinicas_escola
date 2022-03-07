<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	Lista de clínicas: <br />
	
	<ul>
	<c:forEach items="${clinicas }" var="clinica">
		<li>${clinica.nome }, endereço: ${clinica.endereco }, telefone para contato: ${clinica.telefone } </li>
	</c:forEach>
	</ul>
</body>
</html>