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
    
    <title>My JSP 'saveBranch.jsp' starting page</title>
    
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
    	<form action="Branch_saveBranch.action" method="post">
    	    <table>
    		<tr>
    			<td>网点名称:</td>
    			<td><input type="text" name="branch.branchName"></td>
    		</tr>
    		<tr>
    			<td>网点地址:</td>
    			<td><input type="text" name="branch.branchAddress"></td>
    		</tr>
    		<tr>
    			<td>网点联系方式:</td>
    			<td><input type="text" name="branch.branchContact"></td>
    		</tr>    
    		<tr>
    			<td>网点创建时间:</td>
    			<td><input type="text" name="branch.branchDate"></td>
    		</tr>
    		<tr>
    			<td>网点负责人:</td>
    			<td>
    				<select name="branch.emp.empId">
    					<c:forEach items="${emps }" var="em">
    						<option value="${em.empId }">${em.empName }</option>
    					</c:forEach>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td colspan=2><input type="submit" value="提交"></td>
    		</tr>    
    		    </table>				
    	</form>
  </body>
</html>
