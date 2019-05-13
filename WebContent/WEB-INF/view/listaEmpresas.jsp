<%@page import="br.com.alura.gerenciador.servlet.model.Empresa"%>
<%@page import="br.com.alura.gerenciador.servlet.model.User"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<c:import url="logout.jsp" />

		Usuário logado: ${userLogado.name}
		
		<br>

		<c:if test="${not empty nomeEmpresa}">
			Empresa ${ nomeEmpresa } cadastrada com sucesso no dia 
			<fmt:formatDate value="${dataAbertura}" />
		</c:if>
		
		<br>
		Lista de Empresas <br />
	<ul>
		<c:forEach items="${empresas}" var ="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}"/> 
			<a href="/application/main?action=FindEmpresa&id=${empresa.id}" >Editar</a>
			<a href="/application/main?action=RemoveEmpresa&id=${empresa.id}">Remover</a></li>
		</c:forEach>
	</ul>
	<br>
			<a href="/application/main?action=NovaEmpresaForm">Cadastrar</a>
</body>
</html>