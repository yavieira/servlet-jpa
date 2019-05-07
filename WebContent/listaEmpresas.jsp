<%@
page
	import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<body>
		Lista de Empresas <br />
		<ul>
			<%
				List<Empresa> list = null;
				list = (List<Empresa>)request.getAttribute("empresas");
				for (Empresa empresa : list) {
			%>
			<li><%=empresa.getNome()%></li>
		</ul>

		<%
			}
		%>
	</body>

</body>
</html>