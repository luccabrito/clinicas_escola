<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nomeClinica = (String) request.getAttribute("clinica");
    System.out.println(nomeClinica);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Empresa <%= (nomeClinica) %>  cadastrada com sucesso!
</body>
</html>