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
    
    <title>网点分页查询</title>
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
  				<td>网点名称</td>
  				<td>网点地址</td>
  				<td>网点创建时间</td>
  				<td>操作</td>
  			</tr>
		<c:forEach items="${p.list }" var="b">
			<tr>
				<td>${b.branchName }</td>
				<td>${b.branchAddress }</td>
				<td>${b.branchDate }</td>
				<td>
					<a href="Branch_afterupdate.action?branch.branchId=${b.branchId }">更新网点</a>
					<a href="Branch_delBranch.action?branch.branchId=${b.branchId }">删除网点</a>
				</td>
			</tr>
		</c:forEach>  			
    </table>
    <form action="Branch_findbyPager.action" method="post">
	    <ul class="pager">
	    	<li>当前页：<span id="curPage">${p.curPage }</span>总页数：<span id="totalPages">${p.totalPages }</span></li>
	    	<li><a id="first" href="Branch_findbyPager.action?pager.curPage=${p.first }">首页</a></li>
	    	<li><a id="prev" href="Branch_findbyPager.action?pager.curPage=${p.prev }">上一页</a></li>
	    	<li><a id="next" href="Branch_findbyPager.action?pager.curPage=${p.next }">下一页</a></li>
	    	<li><a id="last" href="Branch_findbyPager.action?pager.curPage=${p.last }">尾页</a></li>
	    	<li>
		    		<input type="number" id="texCurPage"  min="1" max="${p.totalPages }" name="pager.curPage" placeholder="请输入跳转的页数">
		    		<input type="submit" value="go" class="btn btn-primary">	
	    	</li>
	    </ul>   
    </form> 
  </body>
</html>
