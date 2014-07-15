<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>修改小组信息</title>
</head>
<body>
	<center>
		<h1>湖北工程学院学生管理系统</h1>
		<s:form action="ModifyStudent1" method="post" theme="simple">
			<s:hidden name="student.id"></s:hidden>
			<p>
				学号：
				<s:textfield name="student.sid"></s:textfield>
			<p>
				姓名：
				<s:textfield name="student.sname"></s:textfield>
			<p>
				专业：
				<s:textfield name="student.subject"></s:textfield>
			<p>
				<s:submit value="确定"></s:submit>
				<s:reset value="重改"></s:reset>
			<p>
				<s:fielderror></s:fielderror>
		</s:form>
		<p>
			<a href="index.jsp">首页</a>
		<p>
			<a href="ViewStudents.action">显示学生信息</a>
		</p>
	</center>
	<p align="center">Copyright &copy;2012 湖北工程学院版权所有
</body>
</html>