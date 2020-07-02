<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>

<c:if  test="${!myCheck}">
    <p><a href="/user/reg">Registration</a></p>
    <p><a href="/user/auth">Authorisation</a></p>
</c:if>

<c:if  test="${myCheck}">
    <p><a href="/user/reg">Registration</a></p>
    <p><a href="/user/auth">Authorization</a></p>
    <p><a href="/calc">Calculation</a></p>
    ${message}
</c:if>

</body>
</html>
