<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de clínicas-escola</title>
</head>
<body>

	<c:if test="${not empty clinica }">
		Clínica ${ clinica } cadastrada com sucesso!
	</c:if>
	
	Lista de clínicas: <br />
	
	<ul>
	<c:forEach items="${clinicas }" var="clinica">
		<li>${clinica.nome }, endereço: ${clinica.endereco }, telefone para contato: ${clinica.telefone }
		<a href="/cadastro-clinicas-escola/entrada?acao=MostraClinica&id=${clinica.id }">edita</a>    
		&ensp; <a href="/cadastro-clinicas-escola/entrada?acao=RemoveClinica&id=${clinica.id }">remove</a>
		</li>
	</c:forEach>
	</ul>
</body>
</html>