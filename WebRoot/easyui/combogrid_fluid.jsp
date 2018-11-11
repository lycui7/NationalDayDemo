<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/11/11
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>combogird_fluid</title>
    <link rel="stylesheet" type="text/css" href="../resource/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/easyui/themes/icon.css">
    <%--<link rel="stylesheet" type="text/css" href="../demo.css">--%>
    <script type="text/javascript" src="../resource/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../resource/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h2>Fluid(不固定的) ComboGrid</h2>
<p>This example shows how to set the width of ComboGrid to a percentage of its parent container.</p>
<div style="margin:20px 0"></div>
<div class="easyui-panel" style="width:100%;max-width:400px;padding:30px 60px;">
    <div style="margin-bottom:20px">
        <select class="easyui-combogrid" style="width:100%" data-options="
					panelWidth: 500,
					panelMinWidth: '50%',
					idField: 'itemid',
					textField: 'productname',
					url: 'datagrid_data1.json',
					method: 'get',
					columns: [[
						{field:'itemid',title:'Item ID',width:80},
						{field:'productname',title:'Product',width:120},
						{field:'listprice',title:'List Price',width:80,align:'right'},
						{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
						{field:'attr1',title:'Attribute',width:200},
						{field:'status',title:'Status',width:60,align:'center'}
					]],
					fitColumns: true,
					label: 'width: 100%',
					labelPosition: 'top'
				">
        </select>
    </div>
    <div style="margin-bottom:20px">
        <select class="easyui-combogrid" style="width:50%" data-options="
					panelWidth: 500,
					panelMinWidth: '50%',

					idField: 'itemid',
					textField: 'productname',
					url: 'datagrid_data1.json',
					method: 'get',
					columns: [[
						{field:'itemid',title:'Item ID',width:80},
						{field:'productname',title:'Product',width:120},
						{field:'listprice',title:'List Price',width:80,align:'right'},
						{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
						{field:'attr1',title:'Attribute',width:200},
						{field:'status',title:'Status',width:60,align:'center'}
					]],
					fitColumns: true,
					label: 'width: 50%',
					labelPosition: 'top'
				">
        </select>
    </div>
</div>
</body>
</html>
