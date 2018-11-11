<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/11/10
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>easyui-combogrid学习</title>
    <%--引入easyui需要的文件--%>
   <%-- href可以是绝对路径，也可以是相当路径
    绝地路径：需要带上项目路径
    相对路径: 相当当前jsp--%>
    <link rel="stylesheet" type="text/css" href="../resource/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/easyui/themes/icon.css">
    <%--<link rel="stylesheet" type="text/css" href="../demo.css">--%>
    <script type="text/javascript" src="../resource/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../resource/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h2>Multiple ComboGrid</h2>
<p>Click the right arrow button to show the DataGrid and select items.</p>
<div style="margin:20px 0"></div>
<div class="easyui-panel" style="width:100%;max-width:400px;padding:30px 60px;">
    <div style="margin-bottom:20px">
        <select class="easyui-combogrid" style="width:100%" data-options="
					panelWidth: 500,
					multiple: true,
					idField: 'itemid',
					textField: 'productname',
					url: 'datagrid_data1.json',
					method: 'get',
					value: ['EST-11','EST-13'],
					columns: [[
						{field:'itemid',title:'Item ID',width:80},
						{field:'productname',title:'Product',width:120},
						{field:'listprice',title:'List Price',width:80,align:'right'},
						{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
						{field:'attr1',title:'Attribute',width:200},
						{field:'status',title:'Status',width:60,align:'center'}
					]],
					fitColumns: true,
					label: 'Select Items:',
					labelPosition: 'top'
				">
        </select>
    </div>
</div>
</body>
</html>
