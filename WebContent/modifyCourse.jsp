<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>修改课程信息</title>
</head>
<body>
	<center>
		<h1>湖北工程学院学生管理系统</h1>
		<s:form action="ModifyCourse1" method="post" theme="simple">
			<s:hidden name="course.id"></s:hidden>
			<p>
				课程号：
				<s:textfield name="course.cid"></s:textfield>
			<p>
				课程名：
				<s:textfield name="course.cname"></s:textfield>
			<p>
				开课学期：
				<s:textfield name="course.kkxq"></s:textfield>
			<p>
				课程学时：
				<s:textfield name="course.xs"></s:textfield>
			<p>
				课程学分：
				<s:textfield name="course.xf"></s:textfield>
			<p>
				<s:submit value="确定"></s:submit>
				<s:reset value="重改"></s:reset>
		</s:form>
		<s:fielderror></s:fielderror>
		<a href="index.jsp">返回首页</a> <a href="ViewCourses.action">查看课程信息</a>
	</center>
	<p align="center">Copyright &copy;2012 湖北工程学院版权所有
</body>
</html>