<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showBranch.jsp' starting page</title>
    
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
  	<table>
  			<tr>
  				<td>网点名称</td>
  				<td>网点地址</td>
  				<td>网点创建时间</td>
  				<td>操作</td>
  			</tr>
		<c:forEach items="${branch }" var="b">
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
  </body>
</html>
