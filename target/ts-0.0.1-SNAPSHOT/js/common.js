function searchList(tableNm, url, data){
	$(tableNm).datagrid("loading"); //加屏蔽
	
    $.ajax({  
        url:url,  
        type:"POST",  
        async:false,  
        data:data,  
        success:function (rtdata){  
            total = rtdata.total;//返回数据总数
            $(tableNm).datagrid("loadData",rtdata);
            $(tableNm).datagrid("loaded"); //移除屏蔽
        },  
        error:function(){  
            $.messager.alert("信息","程序出现未知异常！","error");
            $(tableNm).datagrid("loaded"); //移除屏蔽
        }  
    });  
}