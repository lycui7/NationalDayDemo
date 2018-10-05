<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/5
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>Session监听器</title>
</head>
<body>
<h1>一个秘密将在下方诞生了</h1>
<strong><%=new String(request.getParameter("username").getBytes("iso-8859-1"),"utf-8")%></strong>
<strong>啊！${sessionScope.get("handsome")}</strong>
</body>
</html>
<%
    session.invalidate();
%>
