<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>综合分布图</title>
    <link rel="stylesheet" href="https://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript"
            src="https://webapi.amap.com/maps?v=1.4.9&key=您申请的key值"></script>
    <script type="text/javascript" src="https://cache.amap.com/lbs/static/addToolbar.js"></script>
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
</head>
<body onload="queryBtn()">
<div >
<form id="queryForm" class="search-box" action="<%=request.getContextPath()%>/deliverydata/exportReport">
     <img id="myimg" src="<%=request.getContextPath()%>/jsp/topjui/image/gaode/337610352947223349.png"><a>    餐厅</a>
     <img id="myimg" src="<%=request.getContextPath()%>/jsp/topjui/image/gaode/74965730632181559.png"><a>     用户</a>
     <input  type="text" data-toggle="topjui-datebox" data-options="id:'text',prompt:'开始时间',pattern:'YYYY-mm-dd'" id="createTimebegin" name="createTimebegin" value="" > 
     <input type="text" data-toggle="topjui-datebox" data-options="id:'text2',prompt:'结束时间',pattern:'YYYY-mm-dd'" id="createTimeend" name="createTimeend" value="">
 	<a id="queryBtn" onclick="queryBtn()"><input type="button" value="查询"></a>
</form>
</div>
<div id="container" style=" margin-top:36px;"></div>
<script type="text/javascript">
    //初始化地图对象，加载地图
    var map = new AMap.Map("container", {resizeEnable: true});
	 var infoWindow = new AMap.InfoWindow({offset: new AMap.Pixel(0, -30)});
     var lnglats = [];
	 var lnglats2 = [];
	    function queryBtn (){
        	var createTimebegin=$('#_easyui_textbox_input1').val();
            var createTimeend=$('#_easyui_textbox_input2').val();
        $.get('<%=request.getContextPath()%>/orderdata/comprehensiveMapData?_easyui_textbox_input1='+createTimebegin+'&_easyui_textbox_input2='+createTimeend, function (data) {
		
		var arr1 = new Array();
		for (var i = 0, marker; i < data.restlist.length; i++) {
		arr1[i]=[Number(data.restlist[i].longitude),Number(data.restlist[i].latitude)];
		}
		lnglats=arr1;
        for (var i = 0, marker; i < lnglats.length; i++) {
        var marker = new AMap.Marker({
            position: lnglats[i],
			icon:"<%=request.getContextPath()%>/jsp/topjui/image/gaode/337610352947223349.png",
            map: map
        });
        marker.content = data.restlist[i].name_zh_cn;
        marker.on('click', markerClick);
        marker.emit('click', {target: marker});
    }
		
	
		var arr = new Array();
		for (var i = 0, marker; i < data.rows.length; i++) {
		arr[i]=[Number(data.rows[i].longitude),Number(data.rows[i].latitude)];
		}
		lnglats2=arr;
		for (var i = 0, marker; i < lnglats2.length; i++) {
        var marker = new AMap.Marker({
            position: lnglats2[i],
			icon:"<%=request.getContextPath()%>/jsp/topjui/image/gaode/74965730632181559.png",
            map: map
        });
        marker.content = data.rows[i].name;
        marker.on('click', markerClick);
        marker.emit('click', {target: marker});
    }
		});
		}
   
   /*
    for (var i = 0, marker; i < lnglats.length; i++) {
        var marker = new AMap.Marker({
            position: lnglats[i],
            map: map
        });
        marker.content = '我是第' + (i + 1) + '个Marker';
        marker.on('click', markerClick);
        marker.emit('click', {target: marker});
    }
	*/
    function markerClick(e) {
        infoWindow.setContent(e.target.content);
        infoWindow.open(map, e.target.getPosition());
    }
    map.setFitView();
</script>
</body>
</html>