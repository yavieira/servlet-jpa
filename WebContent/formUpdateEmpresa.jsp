<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value ="/updateEmpresa" var = "servletUpdateEmpresa"/> 

<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body>

	<form action= "${servletUpdateEmpresa}" method="post">

		Id: <input type="text" name="id" value="${empresa.id}" readonly/>
		Nome: <input type="text" name="nome" value="${empresa.nome}"/>
		Data de abertura: <input type="text" name="dataAbertura" 
		 value="<fmt:formatDate value="${empresa.dataAbertura}" pattern ="dd/MM/yyyy"/>"/>
				<input type="submit">
	</form>
	
</body>


</html>