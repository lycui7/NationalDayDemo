<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/4
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DOM对象，Js对象，jquery对象区别与联系</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        function change() {
           // $("[name='input1']").attr("value","我进化了");
           // $("[name='input1']").val("我进化了");
            //$("[name='input1']")[0].setAttribute("value","究极进化");
            //$("[name='input1']")[0].value = "炒鸡进化";
           // alert($("[name='input1']")[0].value +" "+$("[name='input1']").val());
            /*var node = document.querySelector("[name=input1]");
            $(node).val("改变后进化");*/
            //$("[name='input1']")[0].style.backgroundColor = "red";
            //$("[name='input1']").css("background-color","green");
            /*
             *jquery对象有4个属性
             * 下面为属性jquery,length,selector,context演示
             */
            //alert($("[name='input1']").jquery);
            //alert($("input").length);
            //alert($("[name='input1']").selector);
            //alert(document.querySelector("[name=input1]"));//[object HTMLInputElement]
            //var element = $("[name='input1']").context;//[object HTMLDocument]
            //alert(element);
            //alert($("[name='input1']"));//[object Object]
            //节点的操作
           /* var para=document.createElement("p");
            var node=document.createTextNode("这是新段落。");
            para.appendChild(node);
            document.getElementsByTagName("div")[0].appendChild(para);*/
           $("div").append("<p>新段落</p>");
           $("div").children("p").not("p:first-of-type").remove();
        }
    </script>
</head>
<body>
<div><span>div自带的</span><p>我即将消失1</p><p>我即将消失2</p><p>我即将消失3</p></div>
<input type="text" name="input1" id="input1" value="我初始化"/>
<input type="button" name="input2" value="click me" onclick="change()"/>
</body>
</html>
