<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/5
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
%>
<html>
<head>
    <title>对应firstServlet</title>
    <script type="text/javascript">
        window.onload = function () {
           // document.querySelector("p").innerText = username;
        }
        function change(username) {
            if(username == null) return;
            document.querySelector("p").innerText = username;
        }
    </script>
</head>
<body>
<form method="get" target="_blank" action="${pageContext.request.contextPath}/firstServlet">
    <input type="text" name="username"/>
    <input type="submit" value="提交" onclick="change(<%=username%>)"/>
</form>

<p>访问servlet返回的内容将在这里显示</p>
</body>
</html>
