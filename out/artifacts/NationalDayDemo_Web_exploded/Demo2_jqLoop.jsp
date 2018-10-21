<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/2
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo2 JQuery</title>
    <script  src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.js"></script>
</head>
<body>
<h1>Demo2</h1>
<script type="text/javascript">
   $(document).ready(function () {
       $("input").click(function(){
           $("li").each(function(index,element) {
              // alert(element.innerHTML);
               alert($(this).text());
               //alert($(this).html());
           });
       });
   });
</script>
<input type="button" value="遍历ol"/>
<ol>
    <li><strong>albert</strong></li>
    <li><strong>choosl</strong></li>
    <li><strong>chow</strong></li>
    <li><strong>anne</strong></li>
</ol>
</body>
</html>
