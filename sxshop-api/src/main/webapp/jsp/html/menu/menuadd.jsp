<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<input type="hidden" id="uuid" name="uuid">
<table class="editTable">
    <tr>
        <td class="label">菜单名称</td>
        <td >
            <input type="text" name="text" value="${menu.text}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
         <td class="label">菜单编号</td>
        <td >
            <input type="text" name="serialno" value="${menu.serialno}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
    </tr>
     <tr>
        <td class="label">父菜单id</td>
        <td >
            <input type="text" name="pid" value="${menu.pid}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
         <td class="label">shiro权限控制</td>
        <td >
            <input type="text" name="shirorole" value="${menu.shirorole}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
    </tr>
    <tr>
        <td class="label">菜单级别</td>
        <td>
        <select name="levelmenu" value="${menu.levelmenu}"  data-options="required:true">
  			<option value ="0">模块级别</option>
  			<option value ="1">一级菜单</option>
  			<option value="2">二级菜单</option>
  			<option value="3">三级菜单</option>
  			<option value="4">四级菜单</option>
		</select>
            
        </td>
        <td class="label">样式</td>
        <td>
        <select name="iconcls" value="${menu.iconcls}"  data-options="required:true">
  			<option value ="fa fa-heartbeat">综合演示</option>
  			<option value ="fa fa-bank">表单组件</option>
  			<option value="fa fa-table">表格和树</option>
  			<option value="fa fa-list">菜单按钮</option>
  			<option value="fa fa-bar-chart">图形报表</option>
  			<option value="fa fa-sitemap">基础表单演示</option>
  			<option value="fa fa-map">扩展组件</option>
  			<option value="">文件形式</option>
		</select>
        </td>
    </tr>
    <tr>
        <td class="label">是否为叶子节点</td>
        <td>
         <select name="state" value="${menu.state}"  data-options="required:true" >
  			<option value ="open">是</option>
  			<option value ="closed">否</option>
		</select>
            
        </td>
        <td class="label">状态</td>
        <td>
        <select name="status" value="${menu.status}"  data-options="required:true" >
  			<option value ="0">冻结</option>
  			<option value ="1">启用</option>
		</select>
        </td>
    </tr>
  
    <tr>
    <td class="label">url</td>
        <td  colspan="3">
            <input type="text" name="url" value="${menu.url}"  data-toggle="topjui-textarea" data-options="">
        </td>
       <!--  <td class="label">描述</td>
        <td colspan="3">
            <input type="text" name="description" data-toggle="topjui-textarea">
        </td> -->
    </tr>
</table>