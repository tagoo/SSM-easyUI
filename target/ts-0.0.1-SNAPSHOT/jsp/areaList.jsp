<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/jsp/mytags.jsp"%>
<script type="text/javascript">
	var page,rows,total;

	function initDataGrid(){  
           $("#areaList").datagrid({  
               rownumbers:true,  
               pagination:true,  
               singleSelect:true,
               autoRowHeight:false,
               loadMsg:'数据加载中，请稍等...',  
               columns:[[    
                           {field:'areaNo',title:'地区号',width:300},    
                           {field:'areaName',title:'地区名',width:500},    
                       ]]  
               });  
       }
	
	//查询列表页面数据  
	function getData(){  
	    var areaName=$("#areaName").val();  
	    var deleteFlg=$("#deleteFlg").val();
	    
	    var data = {"areaName":areaName,
		        	"deleteFlg":deleteFlg,
		        	"page":page,
		        	"rows":rows};	    
	    var url = "${webRoot}/serachAreaList";
	    
	    //查询共通
	    searchList("#areaList", "${webRoot}/serachAreaList", data);
	}
	
	//查询  
	function searchArea(){  
	    page = 1;  
	    getData();  
	}  
	  
	//页面加载完成后，初始化页面  
	$(function(){  
	    //初始化datagrid  
	    initDataGrid();  
	    
	    //初始化分页参数  
	    page = '1';  
	    rows = '10';  
	    //修改DataGrid分页默认样式  
	    initPage();  
	});  
	
	//修改DataGrid分页默认样式  
	function initPage(){  
	    var pager = $("#areaList").datagrid("getPager");  
	    pager.pagination({  
	        total:total,  
	        pageSize:rows,  
	        pageNumber:page,  
	        pageList:[10,20,30,40,50],  
	        beforePageText:"第",  
	        afterPageText:"页    共{pages}页",  
	        displayMsg:"当前显示{from} - {to}条记录     共{total}条记录",  
	        onSelectPage:function (pageNum,pageSize){  
	            page = pageNum;  
	            rows = pageSize;  
	            //获取数据  
	            getData();  
	        },  
	        onChangePageSize:function(pageSize){  
	            rows = pageSize;  
	            //获取数据  
	            getData();  
	        }  
	    });  
	}
</script>
<div class="div_margin_top_left" style="width:98.5%;">
	<fieldset style="height:60px;"> 
	<legend class="label_font">查询参数</legend>
		<label class="label_margin label_font">地区名：</label>
		<input id="areaName" name="areaName" class="easyui-textbox" style="width:150px;height:25px">
		<label class="label_margin label_font">当前状态：</label>
		<select id="deleteFlg" class="easyui-combobox" name="deleteFlg" style="width:150px;" panelHeight="62">
			<option value="">全部</option>
			<option value="N">激活</option>
			<option value="Y">休眠</option>
		</select>
		<a href="#" class="label_margin easyui-linkbutton" iconCls="icon-remove" onclick="searchArea()">查询</a>
	</fieldset>
</div>
<div class="div_margin_top_left" style="width:98.5%;">
	<div class="div_margin_top">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="newArea()">新增</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="updArea()">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="delArea()">休眠</a>
	</div>
	<div class="div_margin_top">
		<table id="areaList"  style="width:100%;height:310px"></table>  
	</div>
</div>