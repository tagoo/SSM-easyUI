var url;
/**初始化dataGrid
 * @param tableId -- 表格ID
 * @param columns -- 表格的列信息
 */
function initDataGrid(tableId,columns){  
    $(tableId).datagrid({  
    rownumbers:true,  
    pagination:true,  
    singleSelect:true,
    autoRowHeight:false,
    remoteSort:true,
    loadMsg:'数据加载中，请稍等...',
    toolbar:'#toolbar',  //表格菜单,实际开发时去掉
    columns:columns 
    });
    //page样式通过共同修改，不在此处理
}

/**
 * 查询方法
 * @param tableId -- 表格ID
 * @param url -- 访问的url链接
 * @param data -- 参数
 */
function searchList(tableId, url, data){
	$(tableId).datagrid("loading"); //加屏蔽
	$(tableId).datagrid({
        url:url,
        queryParams:data
	});
	$(tableId).datagrid("loaded"); //移除屏蔽
}

/**
 * 更新方法
 * @param tableId -- 表格ID
 * @param dialogId -- DialogID
 * @param formId -- Dialog内的表单ID
 * @param urls -- 要调用的url链接
 */
function updateData(tableId,dialogId,formId,urls){
    var selectedRows = $(tableId).datagrid("getSelections");  
    if (selectedRows.length != 1) {  
        $.messager.alert("系统提示", "请选择一条要编辑的数据！");  
        return;  
    }  
    var row = selectedRows[0];  
    $(dialogId).dialog("open").dialog("setTitle", "编辑用户信息");  
    $(formId).form("load", row);
    url = urls+row.id; 
}

/**
 * 删除方法
 * @param tableId -- 表格ID
 * @param url -- 要调用的url链接
 */
function deleteData(tableId, url){
    var selectedRows = $(tableId).datagrid("getSelections");  
    if (selectedRows.length == 0) {  
        $.messager.alert("系统提示", "请选择要删除的数据！");  
        return;  
    }  
    var id = selectedRows[0].id;
    $.messager.confirm("系统提示", "您确定要删除这条数据吗？", function(r) {  
        if (r) {  
            $.post(
                url, 
                {id : id }, //这里的名称待定，调用时传参or固定
                function(result) {  
                    if (result.success) {  
                        $.messager.alert("系统提示", "数据已成功删除！");  
                        getData(); 
                    } else {  
                        $.messager.alert("系统提示", "数据删除失败，请联系系统管理员！");  
                    }  
                },
                "json");  
        }  
    });  
}

/**
 * 打开新增窗口
 * @param dialogId -- DialogID
 * @param jsp -- 引用的jsp文件名
 * @param title -- 标题
 * @param width -- 宽度
 * @param height -- 高度
 * @param url -- 后台地址
 */
function showAddDialog(dialogId,jsp,title,width,height,url){
        $(dialogId).dialog({ 
            title: title, 
            width: width,
            height: height,    
            closed: false,  
            cache: false,
            modal: true, 
            loadingMessage: '正在加载...', 
            buttons: [{ 
            text: '保存', 
            handler: function(){
                $(dialogId).find("form").form("submit", {
                    url : url,  
                    onSubmit : function() { 
                        //这里可以做各种参数的前台check 
                        return $(this).form("validate");
                    },  
                    success : function(result) {  
                        var result = eval('(' + result + ')');  
                        if (result.success) {  
                            $.messager.alert("系统提示", "保存成功！");  
                            resetValue();  
                            $(dialogId).dialog("close");
                            getData();
                        } else {  
                            $.messager.alert("系统提示", "保存失败！");  
                            return;  
                        }  
                    }  
                });  
            }
            },{
            text: '关闭',
            handler: function () { 
                  $(dialogId).dialog('close'); 
            } 
            }] 
        });
        $(dialogId).dialog('open').dialog('refresh', jsp);
}


/**
 * 打开编辑窗口
 * @param tableId -- 表格ID
 * @param dialogId -- DialogID
 * @param jsp -- 引用的jsp文件名
 * @param title -- 标题
 * @param width -- 宽度
 * @param height -- 高度
 * @param url -- 后台地址
 */
function showUpdDialog(tableId,dialogId,jsp,title,width,height,url){
    var selectedRows = $(tableId).datagrid("getSelections");  
    if (selectedRows.length != 1) {  
        $.messager.alert("系统提示", "请选择一条要编辑的数据！");  
        return;  
    }  
    var row = selectedRows[0];  
        $(dialogId).dialog({ 
            title: title, 
            width: width,
            height: height,    
            closed: false,  
            cache: false,
            modal: true, 
            loadingMessage: '正在加载...', 
            buttons: [{ 
            text: '保存', 
            handler: function(){
                $(dialogId).find("form").form("submit", {
                    url : url+row.id,  
                    onSubmit : function() { 
                        //这里可以做各种参数的前台check 
                        return $(this).form("validate");
                    },  
                    success : function(result) {  
                        var result = eval('(' + result + ')');  
                        if (result.success) {  
                            $.messager.alert("系统提示", "保存成功！");  
                            resetValue();  
                            $(dialogId).dialog("close");
                            getData();
                        } else {  
                            $.messager.alert("系统提示", "保存失败！");  
                            return;  
                        }  
                    }  
                });  
            }
            },{
            text: '关闭',
            handler: function () { 
                  $(dialogId).dialog('close'); 
            } 
            }] 
        });
        $(dialogId).dialog('open').dialog('refresh', jsp);
        $(dialogId).find("form").form("load", row);
}