<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/10/3
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dom树的操作</title>
    <link href="favicon.ico" rel="shortcut icon"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.js"></script>
    <style type="text/css">
        .first_table table,.second_table table {
            border: 1px solid orangered;
        }
        .first_table th,.first_table td {
            border: 1px solid yellow;
            text-align: center;
        }
        .second_table td[colspan = "2"] {
            text-align: center;
        }
        input[type = "image"] {
            width: 60px;
            height: 40px;
        }
        .third_frame iframe {
            width: 400px;
            height: 150px;
        }
        /*设置三个div同行显示*/
        .first_table,.second_table,.third_frame {
            float: left;
            margin-right: 10px;
        }
    </style>
    <script>


    </script>
</head>
<body>
<p>针对js与Jquery,对比复习DOM数的遍历获取</p>
<div class="first_table">
<table name="table_1">
    <caption>这是一个有用的表格</caption>
    <thead>
    <tr>
        <th>姓名</th>
        <th>英文名</th>
        <th>年龄</th>
        <th>爱好</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>崔璐瑶</td>
        <td>Albert</td>
        <td>20</td>
        <td>运动</td>
    </tr>
    <tr>
        <td>崔一飞</td>
        <td>Carrton</td>
        <td>21</td>
        <td>打游戏</td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
        <td colspan="4">©lycui7</td>
    </tr>
    </tfoot>
</table>
</div>
<div class="second_table">
    <form method="post" action="index.jsp" enctype="application/x-www-form-urlencoded" target="myframe">
    <table name="table_2">
        <tr>
            <td>
                <input name="myTruth" type="hidden" value="我爱你"/>
            </td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>
                <input name="myName" type="text" autofocus required value="请输入姓名"/>
            </td>
        </tr>
        <tr>
            <td>悄悄话</td>
            <td>
                <input name="myWhisper" type="password" required value="请输入悄悄话"/>
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input name="mySex" type="radio"  value="male" checked/><span>男</span>
                <input name="mySex" type="radio"  value="female"/><span>女</span>
            </td>
        </tr>
        <tr>
            <td>爱好</td>
            <td>
                <input name="myHobby" type="checkbox"  value="sing"/><span>唱歌</span>
                <input name="myHobby" type="checkbox"  value="dance"/><span>跳舞</span>
                <input name="myHobby" type="checkbox"  value="read" checked/><span>读书</span>
            </td>
        </tr>
        <tr>
            <td>生源地</td>
            <td>
                <select name="myCity">
                    <optgroup label="North China">
                        <option>北京</option>
                        <option>天津</option>
                        <option>河北</option>
                    </optgroup>
                    <optgroup label="North East">
                        <option>辽宁</option>
                        <option>吉林</option>
                        <option>大连</option>
                    </optgroup>
                    <optgroup label="East China">
                        <option>上海</option>
                        <option selected>浙江</option>
                        <option>山东</option>
                    </optgroup>
                </select>
            </td>
        </tr>
        <tr>
            <td>图像形式的提交按钮</td>
            <td>
                <input name="myImg" type="image" alt="404 not found" src="${pageContext.request.contextPath}/resource/img/programmer.jpg" onclick="return false;"/>
            </td>
        </tr>
        <tr>
            <td>上传文件</td>
            <td>
                <input name="myFile" type="file" value="选择文件..."/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
    </form>
</div>
<div class="third_frame">
   <iframe name="myframe">
       <p>这里是初始化显示内容，即将被页面代替</p>
   </iframe>
</div>
</body>
</html>
