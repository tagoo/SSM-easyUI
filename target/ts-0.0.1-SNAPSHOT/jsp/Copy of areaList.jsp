<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/jsp/mytags.jsp"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>T S 系统</title>
	<link rel="stylesheet" type="text/css" href="${webRoot}/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${webRoot}/js/easyui/themes/icon.css">
	
	<script type="text/javascript" src="${webRoot}/js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${webRoot}/js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		alert(12);
		$(function(){
	        alert(1);
	    });
		alert(11);
	</script>
</head>
<body>
<div class="div_margin_top_left" style="width:98.5%;">
	<fieldset style="height:42px;"> 
	<legend class="label_font">搜索参数</legend>
	<label class="label_margin label_font">地区名：</label>
	<input id="areaName" name="areaName" class="easyui-textbox" style="width:150px;height:25px">
	<label class="label_margin label_font">当前状态：</label>
	<input id="areaName" name="areaName" class="easyui-textbox" style="width:150px;height:25px">
	</fieldset>
</div>
<div class="div_margin_top_left" style="width:98.5%;">
	<div class="div_margin_top">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newArea()">新增</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="updArea()">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="delArea()">休眠</a>
	</div>
	<div class="div_margin_top">
		<table class="easyui-datagrid"
			   style="width:100%;height:300px"
			   data-options="
			   		pagination : true,
			   		url:'user/queryList',
			   		striped: true,
					method: 'get',
					fitColumns: true,
					singleSelect: true,
					rownumbers: true,
					showFooter: true">
			<thead>
				<tr>
					<th data-options="field:'areaNo',width:80">区域号</th>
					<th data-options="field:'areaName',width:120">区域名</th>
				</tr>
			</thead>
		</table>
	</div>
</div>
</body>
</html>