<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<a href="account/findAll">查询测试</a>
<h2>测试保存</h2>
<form action="account/save" method="post">
    姓名：<input type="text" name="name"><br/>
    金额：<input type="text" name="money"><br/>
    <input type="submit" value="提交"><br/>
    <h2>测试删除</h2>
    <a href="/account/delete?id=7" >删除测试</a>
</form>
</body>
</html>
