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
    
    <title>My JSP 'upBranch.jsp' starting page</title>
    
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
    <form action="Branch_Update.action" method="post">
    	id:<input type="text" name="branch.branchId" value="${b1.branchId }"><br/>
    	网点名：<input type="text" name="branch.branchName" value="${b1.branchName }"><br/>
    	网点地址：<input type="text" name="branch.branchAddress" value="${b1.branchAddress }"><br/>
    	网点联系方式：<input type="text" name="branch.branchContact" value="${b1.branchContact }"><br/>
    	网点创建时间：<input type="text" name="branch.branchDate" value="${b1.branchDate }"><br/>
    	<select name="branch.emp.empId">
    		<c:forEach items="${emps }" var="em">
    			<c:if test="${em.empId==b1.emp.empId }">
    				<option value="${em.empId }" selected="selected">${em.empName }</option>
    			</c:if>
    			<c:if test="${em.empId!=b1.emp.empId }">
    				<option value="${em.empId }">${em.empName }</option>
    			</c:if>
    		</c:forEach>
    	</select><br/>
    	<input type="submit" value="update">
    </form>
  </body>
</html>
