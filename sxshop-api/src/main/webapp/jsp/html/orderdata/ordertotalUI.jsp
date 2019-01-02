<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>订单均价统计</title>
    <!-- 引入 echarts.js -->
    <script src="<%=request.getContextPath()%>/jsp/static/public/js/echarts.js"></script>
     <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/jquery/jquery.min.js"></script>
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
<div>
  <form id="queryForm" class="search-box" action="<%=request.getContextPath()%>/deliverydata/exportReport">
  
     <input  type="text" data-toggle="topjui-datebox" data-options="id:'text',prompt:'开始时间',pattern:'YYYY-mm-dd'" id="createTimebegin" name="createTimebegin" value="" > 
   <br> 
     <input type="text" data-toggle="topjui-datebox" data-options="id:'text2',prompt:'结束时间',pattern:'YYYY-mm-dd'" id="createTimeend" name="createTimeend" value="">
 	<a id="queryBtn" onclick="queryBtn()">查询</a>

 </form>
 </div>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1000px;height:500px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        function queryBtn (){
        	var createTimebegin=$('#_easyui_textbox_input1').val();
            var createTimeend=$('#_easyui_textbox_input2').val();
        $.get('<%=request.getContextPath()%>/orderdata/ordertotalData?_easyui_textbox_input1='+createTimebegin+'&_easyui_textbox_input2='+createTimeend, function (data) {
            myChart.setOption(option = {
                title: {
                    text: '订单均价统计'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['总订单金额','完成订单金额','订单均单价']
                },
                xAxis: {
                    data: data.map(function (item) {
                        return item.create_time;
                    })
                },
                yAxis: {
                    splitLine: {
                        show: false
                    }
                },
              
                dataZoom: [{
                	startValue: data[0].create_time
                }, {
                    type: 'inside'
                }],
              /*   visualMap: {
                    top: 10,
                    right: 10,
                    pieces: [{
                        gt: 0,
                        lte: 10,
                        color: '#096'
                    }, {
                        gt: 10,
                        lte: 50,
                        color: '#ffde33'
                    }, {
                        gt: 50,
                        lte: 100,
                        color: '#ff9933'
                    }, {
                        gt: 100,
                        lte: 150,
                        color: '#cc0033'
                    }, {
                        gt: 150,
                        lte: 300,
                        color: '#660099'
                    }, {
                        gt: 300,
                        color: '#7e0023'
                    }],
                    outOfRange: {
                        color: '#999'
                    }
                }, */
                series: [{
                    name: '总订单金额',
                    type: 'line',
                    data: data.map(function (item) {
                        return item.num;
                    }),
                },{
                    name: '完成订单金额',
                    type: 'line',
                    data: data.map(function (item) {
                        return item.num2;
                    }),
                },{
                    name: '订单均单价',
                    type: 'line',
                    data: data.map(function (item) {
                        return item.numavg;
                    }),
                }]
            });
        });
        }
        // 使用刚指定的配置项和数据显示图表。
       
    </script>
</body>
</html>