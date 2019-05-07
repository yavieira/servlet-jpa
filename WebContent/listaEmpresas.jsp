<%@page import="br.com.alura.gerenciador.modelo.Empresa"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="UTF-8">
</head>
<body>

		<c:if test="${not empty nomeEmpresa}">
			Empresa ${ nomeEmpresa } cadastrada com sucesso no dia 
			<fmt:formatDate value="${dataAbertura}" />
		</c:if>
		
		</br>

		Lista de Empresas <br />
	<ul>

		<c:forEach items="${empresas}" var ="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}"/> 
			<a href="/gerenciador/findEmpresa?id=${empresa.id}" >Editar</a>
			<a href="/gerenciador/removeEmpresa?id=${empresa.id}">Remover</a></li>
		</c:forEach>
	</ul>


</body>
</html>