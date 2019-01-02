<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>商户数据统计</title>
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

        $.get('<%=request.getContextPath()%>/restaurantsdata/restaurantcountData', function (data) {
            myChart.setOption(option = {
                title: {
                    text: '商户数据统计'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['总商户数', '上线商户数', '下线商户数', '出单商户数']
                },
                xAxis: {
                    data: data.map(function (item) {
                        return item.data_time;
                    })
                },
                yAxis: {
                    splitLine: {
                        show: false
                    }
                },
              
                dataZoom: [{
                	startValue: data[0].data_time
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
                    name: '总商户数',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.all_restaurant;
                    }),
                },{
                    name: '上线商户数',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.online_restaurant;
                    }),
                },{
                    name: '下线商户数',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.down_restaurant;
                    }),
                },{
                    name: '出单商户数',
                    type: 'bar',
                    data: data.map(function (item) {
                        return item.issue_restaurant;
                    }),
                }]
            });
        });

        // 使用刚指定的配置项和数据显示图表。
       
    </script>
</body>
</html>