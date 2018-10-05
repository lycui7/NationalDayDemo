<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/5
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试全局编码过滤器</title>

</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/secondServlet">
    <input type="text" name="hobby"/>
    <input type="submit" value="点我试试"/>
</form>
</body>
</html>
