<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>添加教师信息</title>
</head>
<body>
	<center>
		<h1>湖北工程学院学生管理系统</h1>
		<a href="index.jsp">返回首页</a>
		<s:form action="AddTeacher" method="post" theme="simple">
			<p>
				教师职工号：
				<s:textfield name="teacher.tid"></s:textfield>
			<p>
				教师姓名：
				<s:textfield name="teacher.tname"></s:textfield>
			<p>
				<s:submit value="确定"></s:submit>
				<s:reset value="重置"></s:reset>
		</s:form>
	</center>
	<s:fielderror></s:fielderror>
	<p align="center">Copyright &copy;2012 湖北工程学院版权所有
</body>
</html>