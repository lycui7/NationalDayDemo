<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/3
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎页面</h1>
<%--<p><%=request.getParameter("myTruth")%></p>
<p><%=request.getParameter("myName")%></p>
<p><%=request.getParameter("myWhisper")%></p>
<p><%=request.getParameter("mySex")%></p>
<p>
<%
    String[] myHobbies = request.getParameterValues("myHobby");
    for (String myHobby : myHobbies) {
%>
<%=myHobby%>&nbsp;&nbsp;

<%

    }
%>
</p>
<p><%=request.getParameter("myCity")%></p>
<p><%=request.getParameter("myFile")%></p>--%>
<p>${param["myTruth"]}</p>
<%--<p>${param.myTruth}</p>--%>
<%--对于有多个值的我们需要遍历 el遍历--%>
<c:forEach var="item" items="${paramValues.myHobby}" varStatus="itemStatus">
    <c:if test="${itemStatus.first}"><c:out value="我是第一个"></c:out></c:if>
    <c:if test="${itemStatus.last}"><c:out value="我是最后一个"></c:out></c:if>
<p>${item}</p>
</c:forEach>
</body>
</html>
