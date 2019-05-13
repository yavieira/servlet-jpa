<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<c:url value ="/main" var = "servletMain"/> 

<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<c:import url="logout.jsp" />

		<form action= "${servletMain}" method="post">
	
        	Login: <input type="text" name="name"  />
        	Senha: <input type="password" name="pass" />
         	Confirma Senha: <input type="password" name="pass2" />
		
        <input type="hidden" name="action" value="NovoLogin"> 
        <input type="submit" value="Criar"/>

		</form>
</body>
</html>