<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>

<c:url value ="/novaEmpresa" var = "servletNovaEmpresa"/> 

<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body>

	<form action= "${servletNovaEmpresa}" method="post">

		Nome: <input type="text" name="nome" />

			<input type="submit">
	</form>

</body>


</html>