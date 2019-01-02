<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<input type="hidden" id="uuid" name="uuid">
<table class="editTable">
    <tr>
        <td class="label">角色名称</td>
        <td >
            <input type="text" name="roleName" value="${menu.roleName}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
        <%--  <td class="label">菜单编号</td>
        <td >
            <input type="text" name="serialno" value="${menu.serialno}" data-toggle="topjui-textbox" data-options="required:true">
        </td> --%>
    </tr>
    
</table>