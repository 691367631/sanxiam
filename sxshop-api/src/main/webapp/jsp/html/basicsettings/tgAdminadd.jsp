<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<input type="hidden" id="id" name="id" value="${menu.id}">
<table class="editTable">
    <tr>
        <td class="label">账号</td>
        <td >
            <input type="text" name="email" value="${menu.email}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
    </tr>
    <tr>
          <td class="label">密码</td>
        <td >
            <input type="text" name="encryptedPassword" value="" data-toggle="topjui-textbox" data-options="required:false">
        </td>
     </tr>
     <tr>
           <td class="label">角色id</td>
        <td >
            <input type="text" name="tg_role_id" value="${menu.tg_role_id}" data-toggle="topjui-textbox" data-options="required:true">
        </td>
     </tr>
    
</table>