<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>显示学生信息</title>
</head>
<body>
	<center>
		<h1>湖北工程学院学生管理系统</h1>
		<a href="index.jsp">首页</a>
		<table align="center" border="1">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>专业</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<s:iterator value="students">
				<tr>
					<td><s:property value="sid" /></td>
					<td><s:property value="sname" /></td>
					<td><s:property value="subject" /></td>
					<td><a
						href="ModifyStudent.action?student.id=<s:property value="id"/>">修改</a></td>
					<td><a
						href="DeleteStudent.action?student.id=<s:property value="id"/>">删除</a></td>
				</tr>
			</s:iterator>
		</table>
		<a href="addStudent.jsp">新增学生信息</a>
	</center>
	<p align="center">Copyright &copy;2012 湖北工程学院版权所有
</body>
</html>