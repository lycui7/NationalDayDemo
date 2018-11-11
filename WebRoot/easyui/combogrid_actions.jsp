<%--
  Created by IntelliJ IDEA.
  User: lyCui
  Date: 2018/11/11
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>combogrid_actions</title>
    <link rel="stylesheet" type="text/css" href="../resource/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/easyui/themes/icon.css">
    <%--<link rel="stylesheet" type="text/css" href="../demo.css">--%>
    <script type="text/javascript" src="../resource/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../resource/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h2>ComboGrid Actions</h2>
<p>Click the buttons below to perform actions.</p>
<div style="margin:20px 5px">
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="getValue()">GetValue</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="setValue()">SetValue</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="disable()">Disable</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="enable()">Enable</a>
</div>
<div class="easyui-panel" style="width:100%;max-width:400px;padding:30px 60px;">
    <div style="margin-bottom:20px">
        <input id="cc" class="easyui-combogrid" style="width:100%" data-options="
					panelWidth: 500,
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
					label: 'Select Item:',
					labelPosition: 'top'
				">
    </div>
</div>

<script type="text/javascript">
    $(function () {
        $("a[onclick = 'setValue()']").linkbutton('disable');
    });
    function getValue(){
        var val = $('#cc').combogrid('getValue');
        alert(val);
    }
    function setValue(){
        $('#cc').combogrid('setValue', 'EST-13');
    }
    function disable(){
        $('#cc').combogrid('disable');
    }
    function enable(){
        $('#cc').combogrid('enable');
    }
</script>
</body>
</html>
