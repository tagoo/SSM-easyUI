<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/jsp/mytags.jsp"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>T S 系统</title>
	<link rel="stylesheet" type="text/css"
		href="js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	
	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
	<script type="text/javascript">
	       //页面加载完成后，初始化页面  
         $(function(){  
             //初始化datagrid 
			var columns = [[    
			                {field:'id',title:'ID',width:200,sortable:true},    
			                {field:'username',title:'姓名',width:200},   
			                {field:'password',title:'密码',width:100}     
			            ]] 
             initDataGrid("#userList",columns);  
         }); 
         
		 //查询列表页面数据  
		 function getData(){  
		     var userName=$("#userName").val();
		     var data = {"userName":userName};       
		     //查询共通
		     searchList("#userList", "${webRoot}/searchUserList", data);
		 }
		 
		 //查询  
		 function searchUser(){  
		     getData();  
		 }  
		 
        //新增用户
        function addUser() { 
            var url = "${webRoot}/saveUser"; 
            showAddDialog("#dlg","userDialog.jsp","添加用户信息",300,200,url); 
            
        } 
		//编辑用户
		function updUser() {  
            //updateData("#userList","#dlg","#userForm","${webRoot}/saveUser?id=");
		    var url = "${webRoot}/saveUser?id="; 
		    showUpdDialog("#userList","#dlg","userDialog.jsp","添加用户信息",300,200,url);
        }
		
		//删除用户
		function delUser() {  
		    deleteData("#userList","${webRoot}/delete");
	    }
		
	</script>
</head>
<body  style="width:100%;height:100%;">
	<div class="div_margin_top_left" style="width: 600px;">
		<fieldset style="height: 35px;">
			<legend class="label_font">查询参数</legend>
			<label class="label_margin label_font">姓名：</label> 
			<input id="userName" name="userName" class="easyui-textbox" style="width: 150px; height: 25px"> 
			<a href="#" class="label_margin easyui-linkbutton" iconCls="icon-remove" onclick="searchUser()">查询</a>
		</fieldset>
	</div>
	<div class="div_margin_top_left">
		<table id="userList" style="width: 600px; height: 337px"></table>
	    <div id="toolbar">
	        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="addUser();">添加</a>
	        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="updUser();">编辑</a>
	        <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="delUser();">删除</a>
	    </div>
    </div>
    <div id="dlg"> </div> 
</body>
</html>
