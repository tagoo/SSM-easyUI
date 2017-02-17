<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/jsp/mytags.jsp"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>T S 系统</title>
	<link rel="stylesheet" type="text/css" href="${webRoot}/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${webRoot}/js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${webRoot}/css/main.css">
	
	<script type="text/javascript" src="${webRoot}/js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${webRoot}/js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${webRoot}/js/common.js"></script>
	<script type="text/javascript">		
		function expandAll(){
			$('#menu').tree('expandAll');
		}
		
		function collapseAll(){
			$('#menu').tree('collapseAll');
		}
		
		function addTab(tabId,title,url)
	    {     		   
			url = "${webRoot}/" + url;
			var name = 'iframe_'+tabId; 
			if(!$('#centerTab').tabs('exists',title))
			{
				$('#centerTab').tabs('add',{   
					title: title,            
					closable:true,   
					cache : false,
					href:url				   
				});   
			} 
			else
			{
				$('#centerTab').tabs('select',title);
			}
		}
		
		/**
		 * 退出登录
		 */
		function logout(){
			if(confirm("确认要退出登录吗？")){
			    self.location = "${webRoot}/logout";
			}else{
				return;
			}	
		}
	</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden;">
	<div data-options="region:'north'" class="header_wrapper">
		<table style="border-collapse: collapse;width: 100%">
			<tr>
				<td class="header_title" style="width: 16%;">TS管理系统</td>
				<td style="width: 63%">&nbsp;</td>
				<td class="header_text" style="width: 7%">
					欢迎:<c:out value="${userName}"></c:out>
				</td>
				<td class="header_text header_password" style="width: 7%">
					密码变更
				</td>
				<td class="header_text header_exit" style="width: 7%" onclick="logout();">
					退出系统
				</td>
			</tr>
		</table>
	</div>
	<div data-options="region:'west',split:true" title="功能菜单" style="width:150px;">
		<table style="border-collapse: collapse;width: 100%">
			<tr>
				<td>&nbsp;</td>
				<td id="expand_all" class="expand_all images_text" onclick="expandAll();">展开</td>
				<td id="collapse_all" class="collapse_all images_text" onclick="collapseAll();">折叠</td>
			</tr>
		</table>
		<ul id="menu" class="easyui-tree">
			<c:forEach items="${menuMap}" var="parent" varStatus="num1">  
			    <li data-options="state:'closed'">   
			        <span>${parent.key}</span>   
			        <ul>   
			        	<c:forEach items="${parent.value}" var="child" varStatus="num2">
			            <li><a href="javascript:addTab('${child.menuId}','${child.menuName}','${child.menuUrl}');">${child.menuName}</a></li> 
			            </c:forEach>
			        </ul>   
			    </li>  
			</c:forEach> 
		</ul>
	      </div>
	<div data-options="region:'center'">
		<div class="easyui-tabs" id="centerTab" fit="false" border="false">  
	          <div title="欢迎页" closeable="false">    
	          </div>
		</div>
	</div>
	<div data-options="region:'south'" style="height:30px;">
       <div class="footer_wrapper">
			某某公司版权所有©2017-2020
       </div>
  	</div>
</body>
</html>