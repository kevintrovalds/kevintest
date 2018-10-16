<%--
  Created by IntelliJ IDEA.
  User: KG
  Date: 2018/10/10
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有账户</h3>
<c:forEach items="${list}" var="account">
    ${account.name}<br/>
    ${account.money}<br/>
    <hr>
</c:forEach>
</body>
</html>
