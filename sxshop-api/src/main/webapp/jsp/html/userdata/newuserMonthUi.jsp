<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>新增注册用户(月统计)</title>
    <!-- 引入 echarts.js -->
    <script src="<%=request.getContextPath()%>/jsp/static/public/js/echarts.js"></script>
     <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/jquery/jquery.min.js"></script>
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
	
</head>
<body onload="queryBtn()">

   <form id="queryForm" class="search-box" action="<%=request.getContextPath()%>/deliverydata/exportReport">
  
     <input  type="text" data-toggle="topjui-datebox" data-options="id:'text',prompt:'开始时间',pattern:'YYYY-mm'" id="createTimebegin" name="createTimebegin" value="" > 
   <br> 
     <input type="text" data-toggle="topjui-datebox" data-options="id:'text2',prompt:'结束时间',pattern:'YYYY-mm'" id="createTimeend" name="createTimeend" value="">
 	<a id="queryBtn" onclick="queryBtn()">查询</a>

 </form>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1000px;height:500px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
		
        function queryBtn (){
        var createTimebegin=$('#_easyui_textbox_input1').val();
        var createTimeend=$('#_easyui_textbox_input2').val();
        $.get('<%=request.getContextPath()%>/userdata/newuserDataMonth?_easyui_textbox_input1='+createTimebegin+'&_easyui_textbox_input2='+createTimeend, function (data) {
            myChart.setOption(option = {
                title: {
                    text: '新增注册用户(月统计)'
                },
                tooltip: {
                    trigger: 'axis'
                },
                xAxis: {
                    data: data.map(function (item) {
                        return item.user_create_time;
                    })
                },
                yAxis: {
                    splitLine: {
                        show: false
                    }
                },
                toolbox: {
                    left: 'center',
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        },
                        restore: {},
                        saveAsImage: {}
                    }
                },
                dataZoom: [{
                	startValue: data[0].user_create_time
                }, {
                    type: 'inside'
                }],
               
                series: {
                    name: '新增注册用户(月统计)',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.num;
                    })
                 
                }
            });
        });
        }
        // 使用刚指定的配置项和数据显示图表。
       
    </script>
</body>
</html>