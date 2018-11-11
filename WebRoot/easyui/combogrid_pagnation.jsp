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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/easyui/themes/icons">
    <%--<link rel="stylesheet" type="text/css" href="../demo.css">--%>
    <script type="text/javascript" src="../resource/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../resource/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".easyui-combogrid").combogrid({
               /* onSelect : function () {
                    //alert(this);//[object HTMLTableElement]
                    //alert($(this));//[object Object]
                 /!*  var item =  $(".easyui-combogrid").combogrid('grid').datagrid('getSelected');
                   alert(item.itemid+" "+item.productname);*!/
                }*/
               /* keyHandler: {
                              query: function (keyword) {     //【动态搜索】处理
                               var comgrid = $('.easyui-combogrid').combogrid("grid");
                               var queryParams = comgrid.datagrid('options').queryParams;  //设置查询参数
                               queryParams.keyword = keyword;
                               comgrid.datagrid('options').queryParams = queryParams;
                               comgrid.datagrid("reload");    //重新加载
                               $('.easyui-combogrid').combogrid("setValue", keyword);
                           }
                   },*/
            });
            //取得分页对象
            var pager = $(".easyui-combogrid").combogrid('grid').datagrid('getPager');
            if(pager) {
                $(pager).pagination({
                    pageSize : 10,
                    pageList : [10,50,100,200],
                    beforePageText: '这是第',
                    afterPageText: '页 共 {pages } 页',
                    displayMsg : '当前显示{from} -- {to} 条记录,共 {total} 条纪录',
                    //选择一页的处理
                    onSelectPage : function(pageNumber,pageSize) {
                    //getData(pageNumber,pageSize);
                        //设置表格的pageSize属性，表格变化时按分页组件设置的pageSize显示数据
                           $('.easyui-combogrid').combogrid("grid").datagrid('options').pageSize = pageSize;
                },
                //改变页大小
                    onChangePageSize : function(pageSize) {},
                  //点击刷新按钮触发
                    onRefresh : function (pageNumber,pageSize) {
                        alert('haha');
                    }
                });
            }
        });
        function test() {
            //alert($(".easyui-textbox").textbox('getValue'));

            alert($(".easyui-textbox"));//[object Object]
            alert($(".easyui-textbox").textbox('textbox'));//[object Object]
            alert($(".easyui-textbox").textbox('textbox').get(0));//[object HTMLInputElement]
        }
    </script>
</head>
<body>
<h2>Basic ComboGrid</h2>
<p>Click the right arrow button to show the DataGrid.</p>
<div style="margin:60px 0"></div>
<div class="easyui-panel" style="width:100%;max-width:400px;padding:30px 60px;">
    <div style="margin-bottom:40px">
        <%--combogrid扩展自combo和datagrid
        combo扩展自validatebox
        datagrid扩展自panel--%>
        <select class="easyui-combogrid" style="width:100%" data-options="
					panelWidth: 500,
					panelHeight : 200,
					idField: 'itemid',
					textField: 'productname',
					url: 'datagrid_data1.json',
					striped : true,<%--//行条纹化--%>
					pagination : true,<%--分页--%>
					rownumbers : true,
					<%--collapsible : true,//是否显示折叠按钮--%>
					method: 'get',
					columns: [[
						{field:'itemid',title:'Item ID',width:80},
						{field:'productname',title:'Product',width:120},
						{field:'listprice',title:'List Price',width:80,align:'right'},
						{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
						{field:'attr1',title:'Attribute',width:200},
						{field:'status',title:'Status',width:60,align:'center'}
					]],
					fitColumns: true,<%--列自动展开/收缩列的宽度以适应网格的宽度，防止水平滚动--%>
					<%--fit : true,--%><%--panel的属性，panel大小将自适应父容器--%>
					label: 'Select Item:',
					labelPosition: 'top'
				">
        </select>
    </div>
</div>
<div class="easyui-panel" style="width: 100%;max-width: 400px;margin-top:20px;">
    <div style="margin: 10px;">
        <input class="easyui-textbox" style="width: 80%;"/>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="test()">测试</a>
    </div>
</div>
</body>
</html>
