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
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/public/js/jquery.form.js"></script>
    <!-- TopJUI框架核心-->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/js/topjui.core.min.js"></script>
    <!-- TopJUI中文支持 -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/topjui/js/locale/topjui.lang.zh_CN.js"></script>
    <!-- layui框架js -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 	<style>
		#export{
			font-size:12px;
			color:#fff;
			line-height:34px;
			padding:8px 18px;
			background:white
		}
		/*  #export:hover{
			background:#009688;
			color:#000;
			border-radious:4px;
			opacity:0.8;
			text-decoration:none;
		}  */
	</style> -->
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
	<style type="text/css">
    .video_list{padding:5% 2% 0;}
    .one_list a{display:-webkit-box;margin-bottom:4%;}
    .loading_box {font-size:16px; line-height:35px; color:#3e3a39; height:40px; text-align:center; padding:30px 0;margin-top:2px;position: absolute;top:40%;left:35%;display:none;}
.pop_cover{width: 100%; height: 100%; background: rgba(0,0,0,0.2); position: fixed; top: 0; left: 0;}
.wid30 { width:35px; height:35px; vertical-align:middle; margin-right:8px;z-index:999;}
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
    <a id="" href="javascript:void(0)"></a>
    <a id="delete" href="javascript:void(0)">删除</a> -->
<!--   <a id="export"  href="javascript:void(0)" onclick="expor1tReport()">导出</a> -->
<!--    <a id="export"  href="javascript:void(0)" onclick="send(0)">发送短信</a>
   <a id="export"  href="javascript:void(0)" onclick="send(1)">发送邮箱</a>  -->
  
    <form id="queryForm" class="" action="">
<!--     <input type="hidden" id="sendType" name="sendType" value="">
       过滤：
    <select name="mobileAndemail"  data-options="required:true">
  			<option value ="">全部</option>
  			<option value ="1">手机号不为空</option>
  			<option value="2">邮箱不为空</option>
  			<option value="3">手机号邮箱均不为空</option>
		</select>
		设备：
		 <select  name="last_order_device"    data-options="required:true">
  			<option value ="">全部</option>
  			<option value ="1">WEB</option>
  			<option value="2">iOS</option>
  			<option value="3">Android</option>
		</select> -->
     <input  type="text" data-toggle="topjui-datebox" data-options="id:'text1',prompt:'用户登录开始时间',pattern:'YYYY-mm-dd'" id="createTimebegin" name="createTimebegin" value="" > 
      
     <input type="text" data-toggle="topjui-datebox" data-options="id:'text2',prompt:'用户登录结束时间',pattern:'YYYY-mm-dd'" id="createTimeend" name="createTimeend" value="">
    
        <a id="queryBtn" href="javascript:void(0)">查询</a>
    </form>
</div>
<!-- 表格工具栏结束 -->

<script>
    function progressFormatter(value, rowData, rowIndex) {
    	alert(value);
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
            url: '<%=request.getContextPath()%>/userdata/userloginInfoJson',
            columns: [[
                {field: 'id', title: '用户id', sortable: true},
                {field: 'nickname', title: '用户昵称', sortable: true},
                {field: 'mobile', title: '用户电话', sortable: true},
                {field: 'email', title: '用户邮箱', sortable: true},
                {field: 'createdAt', title: '用户创建时间', sortable: true},
                {field: 'lastSignInAt', title: '最后一次登录时间', sortable: true},
                {field: 'lastSignInIp', title: '最后一次登录ip', sortable: true},
                {field: 'mobile_type', title: '最后一次登录设备', sortable: true},
                {field: 'version', title: '最近一次登录版本', sortable: true},
                {field: 'country', title: '国家', sortable: true}
             
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
    <%-- 	  $("form[id='queryForm']").attr("action", "<%=request.getContextPath()%>/userdata/exportReport");
		  $("form[id='queryForm']").removeAttr("onsubmit");
		  $("form[id='queryForm']").submit(); --%>
		  alert('暂未实现');
		} ;
		
		
		
    function send(a){
    	$("#loading_box").show(); 
     //$.fn.combogrid.defaults.loadMsg = "加载中，请稍候...";
    	if(a==0){
    		$("#sendType").val('0');
	       $("form[id='queryForm']").attr("action", "<%=request.getContextPath()%>/userdata/sendPhone");
    	}else{
    		$("#sendType").val("1");
    	   $("form[id='queryForm']").attr("action", "<%=request.getContextPath()%>/userdata/sendPhone");	
    	}
		   $("form[id='queryForm']").removeAttr("onsubmit");
		   $("form[id='queryForm']").ajaxSubmit(function(data){
			   $("#loading_box").hide();
			   alert(data.message);
		   });
		   
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
	<div class="loading_box" id="loading_box">
    <div class="pop_cover"></div>
    <img class="wid30" src="<%=request.getContextPath()%>/jsp/topjui/image/loading/load.gif" />加载中，请稍候...
    </div>
</body>
</html>