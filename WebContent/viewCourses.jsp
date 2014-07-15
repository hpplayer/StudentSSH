<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>显示课程信息</title>
</head>
<body>
	<center>
		<h1>湖北工程学院学生管理系统</h1>
		<a href="index.jsp">首页</a>
		<table align="center" border="1">
			<tr>
				<th>课程号</th>
				<th>课程名</th>
				<th>开课学期</th>
				<th>课程学时</th>
				<th>课程学分</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<s:iterator value='courses'>
				<tr>
					<td><s:property value="cid" /></td>
					<td><s:property value="cname" /></td>
					<td><s:property value='kkxq' /></td>
					<td><s:property value="xs" /></td>
					<td><s:property value="xf" /></td>
					<td><a
						href="ModifyCourse.action?course.id=<s:property value="id"/>">修改</a></td>
					<td><a
						href="DeleteCourse.action?course.id=<s:property value="id"/>">删除</a></td>
				</tr>
			</s:iterator>
		</table>
		<a href="addCourse.jsp">新增课程信息</a>
	</center>
	<p align="center">Copyright &copy;2012 湖北工程学院版权所有
</body>
</html>