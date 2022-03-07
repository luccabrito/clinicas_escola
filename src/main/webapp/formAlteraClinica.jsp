<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/cadastro-clinicas-escola/alteraClinica" method="post">
		Nome: <input type="text" name="nome" value="${clinica.nome }" />
		Endereço: <input type="text" name="endereco" value="${clinica.endereco }" />
		Telefone: <input type="text" name="telefone" value="${clinica.telefone }" />
		<input type="hidden" name="id" value="${clinica.id }"/>
		<input type="submit" />
	</form>
</body>
</html>