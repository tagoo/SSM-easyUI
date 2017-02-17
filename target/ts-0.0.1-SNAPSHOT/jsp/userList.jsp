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
</head>
<body>
<div style="margin-bottom:20px">
	<div>First Name:</div>
	<input class="easyui-textbox" style="width:100%;height:32px">
</div>

<div id="userList">
</div>
</body>
</html>