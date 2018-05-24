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
    
    <title>My JSP 'showRepertory.jsp' starting page</title>
    
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
    	<c:forEach items="${repertories }" var="re">
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
    			<td><a href="Repertory_updateRepertory.action?repertory.repertoryId=${re.repertoryId }">出库</a></td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
