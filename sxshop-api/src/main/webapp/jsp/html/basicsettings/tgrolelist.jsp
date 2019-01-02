<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!-- 避免IE使用兼容模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="renderer" content="webkit">
    <!-- TopJUI框架样式 -->
    <link type="text/css" href="<%=request.getContextPath()%>/jsp/topjui/css/topjui.core.min.css" rel="stylesheet">
    <link type="text/css" href="<%=request.getContextPath()%>/jsp/topjui/themes/default/topjui.red.css" rel="stylesheet" id="dynamicTheme"/>
    <!-- FontAwesome字体图标 -->
    <link type="text/css" href="<%=request.getContextPath()%>/jsp/static/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet"/>
    <!-- layui框架样式 -->
    <link type="text/css" href="<%=request.getContextPath()%>/jsp/static/plugins/layui/css/layui.css" rel="stylesheet"/>
    <!-- jQuery相关引用 -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/jquery/jquery.cookie.js"></script>
    <!-- TopJUI框架配置 -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/public/js/topjui.config.js"></script>
    <!-- TopJUI框架核心-->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/js/topjui.core.min.js"></script>
    <!-- TopJUI中文支持 -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/js/locale/topjui.lang.zh_CN.js"></script>
    <!-- layui框架js -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/layui/layui.js" charset="utf-8"></script>
      <link rel="stylesheet" href="<%=request.getContextPath()%>/jsp/topjui/zTree_v3/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/jsp/topjui/zTree_v3/css/demo.css" type="text/css">  
<%--     <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/zTree_v3/js/jquery-1.4.4.min.js"></script> --%>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/zTree_v3/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/zTree_v3/js/jquery.ztree.excheck.js"></script>
   
</head>

<body>
<table id="productDg"></table>

<!-- 表格工具栏开始 -->
<div id="productDg-toolbar" class="topjui-toolbar"
     data-options="grid:{
           type:'datagrid',
           id:'productDg'
       }">
    <a id="add" href="javascript:void(0)">新增</a>
    <a id="edit" href="javascript:void(0)">授权</a>
    <a id="delete" href="javascript:void(0)">删除</a>
<!--     <a id="export" href="javascript:void(0)">导出</a> -->
  
    <form id="queryForm" class="search-box">
        <input type="text" name="text" data-toggle="topjui-textbox"
               data-options="id:'text',prompt:'角色名称'">
        <input type="text" name="serialno" data-toggle="topjui-textbox"
               data-options="id:'serialno',prompt:'角色编号'">
        <a id="queryBtn" href="javascript:void(0)">查询</a>
    </form>
  
</div>
<!-- 表格工具栏结束 -->

<script>
    function progressFormatter(value, rowData, rowIndex) {
        var htmlstr = '<div id="p" class="topjui-progressbar progressbar" data-options="value:' + value + '" style="width: 398px; height: 26px;">';
        htmlstr += '<div class="progressbar-text" style="width: 398px; height: 26px; line-height: 26px;">' + value + '%</div>';
        htmlstr += '<div class="progressbar-value" style="width: ' + value + '%; height: 26px; line-height: 26px;">';
        htmlstr += '<div class="progressbar-text" style="width: 398px; height: 26px; line-height: 26px;">' + value + '%</div>';
        htmlstr += '</div>';
        htmlstr += '</div>';
        return htmlstr;
    }

    $(function () {
        var productDg = {
            type: 'datagrid',
            id: 'productDg'
        };
        <%-- //  <%=request.getContextPath()%>/menu/listJson --%>
        $("#productDg").iDatagrid({
            id: 'productDg',
            url: '<%=request.getContextPath()%>/basicSetting/tgrolelistJson',
            columns: [[
                /* {field: 'uuid', title: 'UUID', sortable: true}, */
                {field: 'id', title: '角色编号', sortable: true},
                {field: 'roleName', title: '角色名称', sortable: true},
                {field: 'createTime', title: '创建时间', sortable: true},
                /* {field: 'state', title: '叶子节点', sortable: true},
                {field: 'iconcls', title: '图标', sortable: true},
                {field: 'levelmenu', title: '菜单级别', sortable: true},
                {field: 'shirorole', title: '权限控制', sortable: true},
                {field: 'status', title: '状态', sortable: true},
                {field: 'url', title: '请求地址', sortable: true} */
            ]],
            
        });

        $("#add").iMenubutton({
            event: 'openDialog',
            iconCls: 'fa fa-plus',
            dialog: {
                id: 'userAddDialog',
                height: 350,
                href:'<%=request.getContextPath()%>/basicSetting/tgroleaddUI',
                buttonsGroup: [
                    {
                        text: '保存',
                        url:'<%=request.getContextPath()%>/basicSetting/tgroleadd',
                        iconCls: 'fa fa-plus',
                        handler: 'ajaxForm',
                        btnCls: 'topjui-btn-normal'
                    }
                ]
            }
        });

        $("#edit").iMenubutton({
            event: 'openDialog',
            iconCls: 'fa fa-pencil',
            btnCls: 'topjui-btn',
            grid: productDg,
            dialog: {
                width: 950,
                height: 500,
                href:'<%=request.getContextPath()%>/basicSetting/tgroleeditUI?serialno={id}',
                buttonsGroup: [
                    {
                        text: '授权',
                        url: '<%=request.getContextPath()%>/basicSetting/tgroleedit',
                        iconCls: 'fa fa-save',
                        handler: 'ajaxForm',
                        btnCls: 'topjui-btn'
                    }
                ]
            }
        });

        $("#delete").iMenubutton({
            event: 'doAjax',
            iconCls: 'fa fa-trash',
            btnCls: 'topjui-btn-normal',
            confirmMsg: '勾选复选框实现多条数据的删除提交操作',
            grid: {
                type: 'datagrid',
                id: 'productDg',
                uncheckedMsg: '请先勾选要删除的数据',
                param: 'serialno:serialno'
            },
            url:'<%=request.getContextPath()%>/menu/delete'
        });

      

      

       

        $("#export").iMenubutton({
            event: 'export',
            btnCls: 'topjui-btn',
            url: _ctx + '/json/response/export.html'
        });

       

       


        $('#myFun').iMenubutton({
            btnCls: 'topjui-btn-normal',
            onClick: myQuery
        });

        $('#queryBtn').iMenubutton({
            event: 'query',
            iconCls: 'fa fa-search',
            btnCls: 'topjui-btn-danger',
            form: {id: 'queryForm'},
            grid: {type: 'datagrid', 'id': 'productDg'}
        });
    });

    // 自定义方法
    function myQuery() {
        // 提示信息
        $.iMessager.alert('自定义方法', '自定义方法被执行了！', 'messager-info');

        var checkedRows = $('#productDg').iDatagrid('getChecked');
        console.log(checkedRows);

        var selectedRow = $('#productDg').iDatagrid('getSelected');
        console.log(selectedRow);

        // 提交参数查询表格数据
        $('#productDg').iDatagrid('reload', {
            name: $('#name').iTextbox('getValue'),
            code: $('#code').iTextbox('getValue')
        });
    }
    
   
</script>

</body>
</html>