<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
//清空窗口内的输入值
function resetValue() {  
    $("#username").val("");  
    $("#password").val("");  
}
</script>
        <form method="post" id="userForm">  
            <table cellspacing="8px;">  
                <tr>  
                    <td>姓名：</td>  
                    <td><input type="text" id="username" name="username"  
                        class="easyui-validatebox" required="true" /> <span  
                        style="color: red">*</span>  
                    </td> 
                </tr>
                 <tr>
                    <td>密码：</td>  
                    <td><input type="text" id="password" name="password"  
                        class="easyui-validatebox" required="true" /> <span  
                        style="color: red">*</span>  
                    </td>  
                </tr>  
            </table>  
        </form>  
