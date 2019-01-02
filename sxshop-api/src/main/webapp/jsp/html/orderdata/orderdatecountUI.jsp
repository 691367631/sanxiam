<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>订单时间统计</title>
    <!-- 引入 echarts.js -->
    <script src="<%=request.getContextPath()%>/jsp/static/public/js/echarts.js"></script>
     <script type="text/javascript" src="<%=request.getContextPath()%>/jsp/static/plugins/jquery/jquery.min.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1000px;height:500px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        $.get('<%=request.getContextPath()%>/orderdata/orderdatecountData', function (data) {
            myChart.setOption(option = {
                title: {
                    text: ''
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['创建时间','下单时间','商户确认订单时间','分发时间','商户出餐时间','送餐员确认接单时间','取餐时间','送达时间']
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
                    name: '创建时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.create_num;
                    }),
                },{
                    name: '下单时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.order_placed_at_num;
                    }),
                },{
                    name: '商户确认订单时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.biz_confirmed_at_num;
                    }),
                },{
                    name: '分发时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.dispatched_at_num;
                    }),
                },{
                    name: '商户出餐时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.biz_placed_at_num;
                    }),
                },{
                    name: '送餐员确认接单时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.dp_dispatched_confirmed_at_num;
                    }),
                },{
                    name: '取餐时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.dish_fetched_at_num;
                    }),
                },{
                    name: '送达时间',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.delivered_at_num;
                    }),
                }]
            });
        });

        // 使用刚指定的配置项和数据显示图表。
       
    </script>
</body>
</html>