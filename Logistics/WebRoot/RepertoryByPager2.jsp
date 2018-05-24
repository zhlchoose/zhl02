<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!doctype html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>库存分页查询</title>
	<link rel="stylesheet" type="text/css" href="js/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="js/bootstrap/css/bootstrap.min.css">
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
    <table class="table table-bordered table-hover table-condensed">
  			<tr>
  				<td></td>
  				<td>网点名称</td>
  				<td>仓库名称</td>
  				<td>订单id</td>
  				<td>货物名称</td>
  				<td>入库时间</td>
  				<td>入库状态</td>
  				<td>库存体积</td>
  				<td>发站</td>  	
  				<td>目的站</td>
  				<td>路由</td>    
  				<td>发货人</td>  	
  				<td>收货人</td>
  				<td>备注</td>     								    							
  			</tr>
    	<c:forEach items="${p.list }" var="re">
    		<tr>
    			<td>${re.branch.branchName }</td>
    			<td>${re.warehouse.warehouseName }</td>
    			<td>${re.order.orderId }</td>
    			<td>${re.cargoName }</td>
    			<td>${re.repertoryTime }</td>
    			<td>${re.repertoryState }</td>
    			<td>${re.repertoryVolume }</td>
    			<td>${re.fromStand }</td>
    			<td>${re.toStand }</td>
    			<td>${re.route }</td>
    			<td>${re.consigner }</td>
    			<td>${re.consignee }</td>
    			<td>${re.remarks }</td>
    			<td> 
    				<c:if test="${re.repertoryState=='已入库'}">
    					<a href="Repertory_updateRepertory3.action?repertory.repertoryId=${re.repertoryId }">出库</a>
    				</c:if>
    			</td>
    		</tr>
    	</c:forEach>			
    </table>
    <form action="Repertor_findbyPager.action" method="post">
	    <ul class="pager">
	    	<li>当前页：<span id="curPage">${p.curPage }</span>总页数：<span id="totalPages">${p.totalPages }</span></li>
	    	<li><a id="first" href="Repertory_findbyPager.action?pager.curPage=${p.first }">首页</a></li>
	    	<li><a id="prev" href="Repertory_findbyPager.action?pager.curPage=${p.prev }">上一页</a></li>
	    	<li><a id="next" href="Repertory_findbyPager.action?pager.curPage=${p.next }">下一页</a></li>
	    	<li><a id="last" href="Repertory_findbyPager.action?pager.curPage=${p.last }">尾页</a></li>
	    	<li>
		    		<input type="number" id="texCurPage"  min="1" max="${p.totalPages }" name="pager.curPage" placeholder="请输入跳转的页数">
		    		<input type="submit" value="go" class="btn btn-primary">	
	    	</li>
	    </ul>   
    </form> 
  </body>
</html>
