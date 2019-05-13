<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/main" var="servletMain"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <form action="${servletMain}" method="post">

        Login: <input type="text" name="name"  />
        Senha: <input type="password" name="pass"  />

        <input type="hidden" name="action" value="LoginAuthentic" /> 
        <input type="submit" />
        <br>
        <br>
        <a href="/application/main?action=NovoLoginForm">Novo usuário</a>
        
    </form>

</body>
</html>