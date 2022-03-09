<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Clínica</title>
</head>
<body>
	<form action="${linkEntradaServlet }" method="post"> 
	
		Nome: <input type="text" name="nome" />
		Endereço: <input type="text" name="endereco" />
		Telefone: <input type="text" name="telefone" />
		<input type="hidden" name="acao" value="NovaClinica">
		
		<input type="submit"/>
	
	</form>

</body>
</html>