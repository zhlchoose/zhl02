<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>仓库管理页面</title>
    <link rel="stylesheet" type="text/css" href="js/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="js/bootstrap/css/bootstrap.min.css">
	<script  src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap/js/bootstrap.min.js"></script>
	<script>
		/* function getall(curPage){
			$.ajax({
				url:"Warehouse_find.action",
				data:{"pager.curPage":curPage},
				dataType:"json",
				type:"post",
				ansy:false,
				success:function(data){
					$("#tab").html("");
					var ary=data.list;
					
				}
			})
		} */
		/* function findAll(curPage){
			$.ajax({
				url:"${pageContext.request.contextPath}/Warehouse_find.action",
				//data:{"pager.curPage":curPage},
				dataType:"json",
				type:"post",
				ansy:false,
				success:function(data){
					$("#tab").html("11");
					var ary=data.list;
					for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.warehouseId+"</td>";
		        		tr+="<td>"+obj.warehouseName+"</td>";
		        		tr+="<td>"+obj.branchName+"</td>";
		        		tr+="<td>"+obj.warehouseAdress+"</td>";
		        		tr+="<td>"+obj.warehouseArea+"</td>";
		        		tr+="<td>"+obj.empName+"</td>";
		        		tr+="<td>"+11+"</td>";
		        		tr+="</tr>";
		        		$("#tab").append(tr);
					}	
				}
			});
		} */
		function findAll(curPage){
			var url="Warehouse_test2.action";
			$.ajax({
				url:url,
				data:{"pager.curPage":curPage},
				dataType:"json",
				type:"post",
				success:function(data){
					$("#tab").html("");
					var ary=data.list;
					for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.Id+"</td>";
		        		tr+="<td>"+obj.warehouseName+"</td>";
		        		tr+="<td>"+obj.branchName+"</td>";
		        		tr+="<td>"+obj.warehouseAdress+"</td>";
		        		tr+="<td>"+obj.warehouseArea+"</td>";
		        		tr+="<td>"+obj.empName+"</td>";
		        		tr+="<td><input type='button' value='删除' class='btn btn-primary' id="+obj.Id+" onclick='del("+obj.Id+")'></td>";
		        		tr+="<td><input type='button' value='修改' class='btn btn-primary' onclick='beforeUpdate2("+obj.Id+")' data-toggle='modal' data-target='#myModal2'></td>";
		        		tr+="</tr>";
		        		$("#tab").append(tr);
					}
					$("#curPage").html(data.curPage);
					$("#totalPages").html(data.totalPages);
					$("#first").attr("data",data.first); 
					$("#prev").attr("data",data.prev);
					$("#next").attr("data",data.next);
					$("#last").attr("data",data.last);
					$("#txtCurPage").val(data.curPage).attr("max",data.last);	
				}
			});
		}
		//修改仓库信息
		function beforeUpdate2(obj){
			var Id=obj;
			$.ajax({
				url:"Warehouse_findbyid.action",
				data:{"warehouse.warehouseId":Id},
				dataType:"json",
				type:"post",
				success:function(data){
					for(var i=0;i<data.length;i++){
						alert(data[i].rent);
						$("#warehouseId").val(data[i].warehouseId);
						$("#warehouseName").val(data[i].warehouseName);
						$("#warehouseAdress").val(data[i].warehouseAdress);
						$("#warehouseArea").val(data[i].warehouseArea);
						$("#rent").val(data[i].rent);
						var bid=data[i].branchId;
						var eid=data[i].empId;
						beforeUpdate(bid, eid);
					}
				}
			});
		}
		//改变页面
		function changePage(obj){
		//取出data属性值
			var page=$(obj).attr("data");
			findAll(page);
		}
		//删除操作
		function del(obj){
			var Id=obj;
			alert(1);
			$.ajax({
				url:"Warehouse_delWarehouse.action",
				data:{"warehouse.warehouseId":Id},
				dataType:"json",
				type:"post",
				success:function(data){
					var meg=data.message;
					alert(meg);
					var page=$("#curPage").html();
					findAll(page);
				}
			});
		}
		function beforeSave3(){
			$.ajax({
				url:"Warehouse_beforeSave.action",
				type:"post",
				dataType:"json",
				success:function(data){
					var branch=data[0];
					var emps=data[1]; 
					var opt="<option>--请选择网点--</option>";
					for(var i=0;i<branch.length;i++){
						opt+="<option value='"+branch[i].branchId+"'>"+branch[i].branchName+"</option>";
					};
					$("#branch").val("");
					$("#branch").append(opt);
					var opt2="<option>--请选择负责人--</option>";
					for(var i=0;i<emps.length;i++){
						var obj2=emps[i];
						opt2+="<option value='"+obj2.empId+"'>"+obj2.empName+"</option>";
					};
					$("#emps").val("");
					$("#emps").append(opt2); 
					
				}
				
			});
		}
		function beforeUpdate(bid,eid){
			$.ajax({
				url:"Warehouse_beforeSave.action",
				type:"post",
				dataType:"json",
				success:function(data){
					var branch=data[0];
					var emps=data[1]; 				
					var opt="<option>--请选择网点--</option>";
					for(var i=0;i<branch.length;i++){
						if(branch[i].branchId==bid){
							opt+="<option value='"+branch[i].branchId+"' selected='selected'>"+branch[i].branchName+"</option>";
						}
						opt+="<option value='"+branch[i].branchId+"'>"+branch[i].branchName+"</option>";
					};
					$("#branchId").children().remove();
				    $("#branchId").append(opt);
				    alert(opt);
					var opt2="<option>--请选择负责人--</option>";
					for(var i=0;i<emps.length;i++){
						var obj2=emps[i];
						if(obj2.empId==eid){
							opt2+="<option value='"+obj2.empId+"' selected='selected'>"+obj2.empName+"</option>";
						}else{
							opt2+="<option value='"+obj2.empId+"'>"+obj2.empName+"</option>";
						}						
					};
					$("#empId").children().remove();
					$("#empId").append(opt2);
					
				}
				
			});
		}
		//查出branch 和emp表数据 为添加warehouse做准备
		/* function beforeSave(){
			$.ajax({
				url:"Warehouse_beforeSave.action",
				type:"post",
				dataType:"json",
				success:function(data){
					var branch=data[0];
					var emps=data[1];
					var opt="<option>--请选择网点--</option>";
					for(var i=0;i<data.length;i++){
						opt+="<option value='"+data[i].branchId+"'>"+data[i].branchName+"</option>";
					};
					$("#branch").append(opt);
					var opt2="<option>--请选择负责人--</option>";
					for(var i=0;i<emps.length;i++){
						var obj2=emps[i];
						opt2+="<option value='"+obj2.empId+"'>"+obj2.empName+"</option>";
					};
					$("#emps").append(opt2);
					var opt="<option>--请选择网点--</option>";
					for(var i=0;i<data.length;i++){
						var obj=data[i];
						
						opt+="<option value='"+obj.branchId+"'>"+obj.branchName+"</option>";
						$("#branch").append(opt);
						  beforeSave2(); 
						$("#box").css("display","block");
					} 
					
				}
				
			});
			beforeSave2();
		} */
		/* function beforeSave2(){
			$.ajax({
				url:"Warehouse_beforeSave2.action",
				dataType:"json",
				type:"post",
				success:function(data){
				var opt="<option>--请选择员工--</option>";
					for(var i=0;i<data.length;i++){
						opt+="<option value='"+data[i].empId+"'>"+data[i].empName+"</option>";
						
					}
					$("#emps").append(opt);
				}
				
			});
		} */
		//跳转到指定页面
		function gotoPage(){
			var page=$("#texCurPage").val();
			alert(page);
			findAll(page);
		}
		//ajax添加
		function fcommit(){
			$.ajax({
				url:"Warehouse_saveWarehouse.action",
				data:$("#form").serialize(),
				dataType:"json",
				type:"post",
				success:function(data){
					var msg=data.message;
					alert(msg);
				}
			});
		}
		//更新仓库信息
		function upWarehouse(){
			$.ajax({
				url:"Warehouse_upWarehouse.action",
				data:$("#form2").serialize(),
				dataType:"json",
				type:"post",
				success:function(data){
					var msg=data.message;
					alert(msg);
					$("#warehouseId").val("");
					$("#warehouseName").val("");
					$("#warehouseAdress").val("");
					$("#warehouseArea").val("");
					$("#rent").val("");
					var page=$("#curPage").html();
					findAll(page);					
				}
			});
		}
		$(function(){
			findAll(1);
		});
	</script>
	<style type="text/css">
            input{
                border: 1px solid #ccc;
                padding: 7px 0px;
                border-radius: 3px;
                padding-left:5px;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
                -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
                transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s
            }
            input:focus{
                    border-color: #66afe9;
                    outline: 0;
                    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6);
                    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6)
            }
            #texCurPage{
            	width:140px;
            }    		
	</style>
  </head>
  
  <body>
<!--   	<center>
  	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" onclick="beforeSave3()">
		添加仓库
	</button>
	</center> -->
    <table id="tab" class="table table-bordered table-hover table-condensed">
    	
    </table>
    <ul class="pager">
    	<li>
    		<button class="btn btn-primary" data-toggle="modal" data-target="#myModal" onclick="beforeSave3()">添加仓库</button>
    	</li>
    	<li>当前页：<span id="curPage"></span>总页数：<span id="totalPages"></span></li>
    	<li><a id="first" onclick="changePage(this)">首页</a></li>
    	<li><a id="prev" onclick="changePage(this)">上一页</a></li>
    	<li><a id="next" onclick="changePage(this)">下一页</a></li>
    	<li><a id="last" onclick="changePage(this)">尾页</a></li>
    	<li><input type="number" id="texCurPage" min="1" max="10" placeholder="请输入跳转的页数">
    		<input type="button" value="go" class="btn btn-primary" onclick="gotoPage()">
    	</li>
    </ul>
<!-- <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" onclick="beforeSave3()">登录</button>
    </div>
  </div> -->			
<!-- <form class="form-horizontal" role="form" id="form">
  <div class="form-group">
    <label class="col-sm-2 control-label">仓库名称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="warehouse.warehouseName" placeholder="请输入仓库名称" style="width:200px">
    </div>
  </div>
   <div class="form-group">
    <label class="col-sm-2 control-label">仓库地址</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="warehouse.warehouseAdress" placeholder="请输入仓库地址" style="width:200px">
    </div>
   </div>
   <div class="form-group">
    <label class="col-sm-2 control-label">仓库面积</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="warehouse.warehouseAdress" placeholder="请输入仓库面积" style="width:200px">
    </div>
   </div>
  <div class="form-group">
    <label class="col-sm-2 control-label">仓库负责人</label>
    <div class="col-sm-offset-2 col-sm-10">
      <select name="warehouse.emp.empId" id="emps"></select>
    </div>
  </div>    
  <div class="form-group">
    <label class="col-sm-2 control-label">网点</label>
    <div class="col-sm-offset-2 col-sm-10">
      <select name="warehouse.branch.branchId" id="branch"></select>
    </div>
  </div>  
   <div class="form-group">
    <label class="col-sm-2 control-label">仓库租金</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="warehouse.rent" placeholder="请输入仓库租金" style="width:200px">
    </div>
   </div>    
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" onclick="fcommit()">提交</button>
    </div>
  </div>
</form> -->
			
			<!-- <form id="form">				
				<table id="tab" class="table table-bordered table-hover table-condensed">			
					<tr>
						<td>仓库名称</td>
						<td><input type="text" name="warehouse.warehouseName" ></td>
					</tr>
					<tr>
						<td>仓库地址</td>
						<td><input type="text" name="warehouse.warehouseAdress" ></td>
					</tr>
					<tr>
						<td>仓库面积</td>
						<td><input type="text" name="warehouse.warehouseArea" ></td>
					</tr>
					<tr>
						<td>仓库负责人</td>
						<td>
							<select name="warehouse.emp.empId" id="emps">
							</select>
						</td>
					</tr>
					<tr>
						<td>网点</td>
						<td>
							<select name="warehouse.branch.branchId" id="branch">
							</select>
						</td>
					</tr>
					<tr>
						<td>仓库租金</td>
						<td><input type="text" name="warehouse.rent" ></td>
					</tr>
					<tr>
						<td><input type="button" class="btn btn-primary" value="提交" onclick="fcommit()"></td>
					</tr>								
				</table>
			</form>
			<input type="button" value="添加仓库" class="btn btn-primary" onclick="beforeSave3()">
		</div> -->
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="myModalLabel">
						模态框（Modal）标题
					</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" role="form" id="form">
					  <div class="form-group">
					    <label class="col-sm-2 control-label">仓库名称</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="warehouse.warehouseName" placeholder="请输入仓库名称" style="width:200px">
					    </div>
					  </div>
					   <div class="form-group">
					    <label class="col-sm-2 control-label">仓库地址</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="warehouse.warehouseAdress" placeholder="请输入仓库地址" style="width:200px">
					    </div>
					   </div>
					   <div class="form-group">
					    <label class="col-sm-2 control-label">仓库面积</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="warehouse.warehouseAdress" placeholder="请输入仓库面积" style="width:200px">
					    </div>
					   </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">仓库负责人</label>
					    <div class="col-sm-offset-2 col-sm-10">
					      <select name="warehouse.emp.empId" id="emps"></select>
					    </div>
					  </div>    
					  <div class="form-group">
					    <label class="col-sm-2 control-label">网点</label>
					    <div class="col-sm-offset-2 col-sm-10">
					      <select name="warehouse.branch.branchId" id="branch"></select>
					    </div>
					  </div>  
					   <div class="form-group">
					    <label class="col-sm-2 control-label">仓库租金</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="warehouse.rent" placeholder="请输入仓库租金" style="width:200px">
					    </div>
					   </div>    
<!-- 					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="submit" class="btn btn-default" onclick="fcommit()">提交</button>
					    </div>
					  </div> -->
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" class="btn btn-primary" onclick="fcommit()">
						提交
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
<!-- 	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2" onclick="beforeSave3()">
		开始演示模态框
	</button> -->
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="myModalLabel">
						模态框（Modal）标题
					</h4>
				</div>
				<div class="modal-body">
			<form id="form2">
				<table id="tab2" class="table table-bordered table-hover table-condensed">
					<tr>
						<td>仓库Id</td>
						<td><input type="text" name="warehouse.warehouseId" id="warehouseId" readonly="readonly"></td>
					</tr>					
					<tr>
						<td>仓库名称</td>
						<td><input type="text" name="warehouse.warehouseName" id="warehouseName"></td>
					</tr>
					<tr>
						<td>仓库地址</td>
						<td><input type="text" name="warehouse.warehouseAdress" id="warehouseAdress"></td>
					</tr>
					<tr>
						<td>仓库面积</td>
						<td><input type="text" name="warehouse.warehouseArea" id="warehouseArea"></td>
					</tr>
					<tr>
						<td>仓库负责人</td>
						<td>
							<select name="warehouse.emp.empId" id="empId">
							</select>
						</td>
					</tr>
					<tr>
						<td>网点</td>
						<td>
							<select name="warehouse.branch.branchId" id="branchId">
							</select>
						</td>
					</tr>
					<tr>
						<td>仓库租金</td>
						<td><input type="text" name="warehouse.rent" id="rent"></td>
					</tr>
<!-- 					<tr>
						<td><input type="button" value="更新" class="btn btn-primary" onclick="upWarehouse()"></td>
					</tr>	 -->							
				</table>
			</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" class="btn btn-primary" onclick="upWarehouse()" data-dismiss="modal">
						提交
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>	
<!-- 		<div id="box2">
			<form id="form2">
				<table id="tab2" class="table table-bordered table-hover table-condensed">
					<tr>
						<td>仓库Id</td>
						<td><input type="text" name="warehouse.warehouseId" id="warehouseId" readonly="readonly"></td>
					</tr>					
					<tr>
						<td>仓库名称</td>
						<td><input type="text" name="warehouse.warehouseName" id="warehouseName"></td>
					</tr>
					<tr>
						<td>仓库地址</td>
						<td><input type="text" name="warehouse.warehouseAdress" id="warehouseAdress"></td>
					</tr>
					<tr>
						<td>仓库面积</td>
						<td><input type="text" name="warehouse.warehouseArea" id="warehouseArea"></td>
					</tr>
					<tr>
						<td>仓库负责人</td>
						<td>
							<select name="warehouse.emp.empId" id="empId">
							</select>
						</td>
					</tr>
					<tr>
						<td>网点</td>
						<td>
							<select name="warehouse.branch.branchId" id="branchId">
							</select>
						</td>
					</tr>
					<tr>
						<td>仓库租金</td>
						<td><input type="text" name="warehouse.rent" id="rent"></td>
					</tr>
					<tr>
						<td><input type="button" value="更新" class="btn btn-primary" onclick="upWarehouse()"></td>
					</tr>								
				</table>
			</form>
		</div> -->
  </body>
</html>