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
	<style>
		#export{
			font-size:12px;
			color:#fff;
			line-height:34px;
			padding:8px 18px;
			background:#009688
		}
		#export:hover{
			background:#009688;
			color:#000;
			border-radious:4px;
			opacity:0.8;
			text-decoration:none;
		}
	</style>
</head>

<body>
<table id="productDg"></table>

<!-- 表格工具栏开始 -->
<div id="productDg-toolbar" class="topjui-toolbar"
     data-options="grid:{
           type:'datagrid',
           id:'productDg'
       }">
    <!--     <a id="edit" href="javascript:void(0)">生成</a>
   <a id="add" href="javascript:void(0)">新增</a>
    <a id="delete" href="javascript:void(0)">删除</a> -->
    <a id="export"  href="javascript:void(0)" onclick="expor1tReport()">导出</a>
  
    <form id="queryForm" class="search-box" action="<%=request.getContextPath()%>/deliverydata/exportReportHumanEffects">

     <input  type="text" data-toggle="topjui-datebox" data-options="id:'text',prompt:'开始时间',pattern:'YYYY-mm-dd'" id="createTimebegin" name="createTimebegin" value="" > 
      
     <input type="text" data-toggle="topjui-datebox" data-options="id:'text',prompt:'结束时间',pattern:'YYYY-mm-dd'" id="createTimeend" name="createTimeend" value="">
    
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
            url: '<%=request.getContextPath()%>/deliverydata/humanEffectsJson',
            columns: [[
                {field: 'delivery_person_id', title: '送餐员id', sortable: true,width:'100px'},
                {field: 'nickname', title: '送餐员名字', sortable: true,width:'100px'},
                {field: 'num', title: '订单量', sortable: true,width:'100px'}
            ]],
            
        });

        $("#edit").iMenubutton({
        	   event: 'export',
               btnCls: 'topjui-btn',
               form: {id: 'queryForm'},
               url: _ctx + '/json/response/export.html'
        });

   /*      $("#export").iMenubutton({
            event: 'export',
            btnCls: 'topjui-btn',
            form: {id: 'queryForm'},
            url: _ctx + '/json/response/export.html'
        }); */


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

    function expor1tReport(){
		  $("form[id='queryForm']").removeAttr("onsubmit");
		  $("form[id='queryForm']").submit();
		} ;
    
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