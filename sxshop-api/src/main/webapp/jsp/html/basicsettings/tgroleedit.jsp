<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <input type="hidden" id="roleId" name="roleId" value="${roleId }">
   <input type="hidden" id="meauIds" name="meauIds" value="${meauIds}" >
 <script type="text/javascript">
<!--

//-->

 var setting = {    
        check:{
            enable:true
        },
        data:    {
            simpleData:{
                enable:true
            }
        },
        callback:{
            onCheck:onCheck
        }
        
    }; 
    <!--

        
    var zNodes =[
        { id:1, pId:0, name:"菜单1", open:false,checked:true },
        { id:11, pId:1, name:"随意勾选 1-1", open:true},
        { id:111, pId:11, name:"随意勾选 1-1-1"},
        { id:112, pId:11, name:"随意勾选 1-1-2"},
        { id:12, pId:1, name:"随意勾选 1-2", open:true},
        { id:121, pId:12, name:"随意勾选 1-2-1"},
        { id:122, pId:12, name:"随意勾选 1-2-2"},
        { id:2, pId:0, name:"随意勾选 2",  open:false,checked:false},
        { id:21, pId:2, name:"随意勾选 2-1"},
        { id:22, pId:2, name:"随意勾选 2-2", open:true},
        { id:221, pId:22, name:"随意勾选 2-2-1"},
        { id:222, pId:22, name:"随意勾选 2-2-2"},
        { id:23, pId:2, name:"随意勾选 2-13"}
    ];
    
     //-->     
        

    var treeNodes;  
    
     $(document).ready(function(){
    	 var roleId=$('#roleId').val();
    	  $.ajax({  
  	        async : false,  
  	        cache:false,  
  	        type: 'POST',  
  	        dataType : "json",  
  	        url: "<%=request.getContextPath()%>/basicSetting/tgroleeditJson?serialno="+roleId,//请求的action路径  
  	        error: function () {//请求失败处理函数  
  	            alert('请求失败');  
  	        },  
  	        success:function(data){ //请求成功后处理函数。    
  	           // alert(data);  
  	            treeNodes = data;   //把后台封装好的简单Json格式赋给treeNodes  
  	        }  
  	    });  
        $.fn.zTree.init($("#tree"), setting, treeNodes);
    }); 
        
        function onCheck(e,treeId,treeNode){
        var treeObj=$.fn.zTree.getZTreeObj("tree"),
        nodes=treeObj.getCheckedNodes(true),
        v="";
        for(var i=0;i<nodes.length;i++){
        v+=nodes[i].id + ",";
      //  alert(nodes[i].id); //获取选中节点的值
        
        }
      //  var meauids=$('#meauIds');
        $("#meauIds").attr("value",v);
        
        }
        
        

        	  
        	/* var zTree;  
        	var treeNodes;  
        	  
        	$(function(){  
        	  
        	  
        	    zTree = $("#tree").zTree(setting, treeNodes);  
        	});  */  
</script>
 
  <div class="zTreeDemoBackground left">
        <ul id="tree" class="ztree"></ul>
    </div>
    
