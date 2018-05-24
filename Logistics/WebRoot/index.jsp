<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
<!--     <a href="Repertory_findRepertory.action">查询所有库存数据</a><br/>
    <a href="Repertory_findRepertory2.action">查询入库的库存</a><br/>
    <a href="Repertory_findRepertory3.action">查询已出库的库存</a><br/>
    <a href="Branch_findBranch.action">查询所有网点</a> -->
    <a href="Branch_findemp.action">添加网点</a>
    <a href="Warehouse.jsp">仓库</a>
    <a href="Warehouse_test1.action">仓库测试</a>
    <a href="Branch_findbyPager.action?pager.curPage=1">网点分页查询</a>
    <a href="Repertory_findbyPager.action?pager.curPage=1">库存分页查询</a>   
    <a href="Repertory_findbyPager2.action?pager.curPage=1">在库库存分页查询</a>
    <a href="Repertory_findbyPager3.action?pager.curPage=1">已出库库存分页查询</a>      
  </body>
</html>
