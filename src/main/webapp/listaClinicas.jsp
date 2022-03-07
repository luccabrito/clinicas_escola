<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, servlets.Clinica" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Lista de clínicas:
	<ul>
	<% 
		List<Clinica> lista = (List<Clinica>)request.getAttribute("clinicas");
        for (Clinica clinica : lista) {
    %>
            <li><%=clinica.getNome()%>, endereço: <%=clinica.getEndereco()%>, telefone para contato: <%=clinica.getTelefone()%></li>
    <% 
        }      
	%>
	</ul>
</body>
</html>