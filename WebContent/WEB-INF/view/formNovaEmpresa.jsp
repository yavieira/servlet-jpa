<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>

<c:url value ="/main" var = "servletMain"/> 

<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body>

<c:import url="logout.jsp" />

	Cadastre uma empresa 
	
	<br> 
	<br>
	

	<form action= "${servletMain}" method="post">

		Nome: <input type="text" name="nome" />

			<input type="hidden" name="action" value="NovaEmpresa">
			<input type="submit">
	</form>

</body>


</html>