<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>登录</title>
</head>
<body>

	<p align="center">
		<img src="images/xiaohui.jpg" height="200px" width="198px" />
	<h1 align="center">湖北工程学院学生管理系统</h1>
	<p>
		<s:form action="Login" method="post" theme="simple">
			<table align="center">
				<tr>
					<td>管理员：</td>
					<td><s:textfield name="admin.name" size="10"></s:textfield></td>
				</tr>

				<tr>
					<td>密码:</td>
					<td><s:password name="admin.password" size="10"></s:password></td>
				</tr>

				<tr>
					<td><s:submit value="登录"></s:submit></td>
					<td><s:reset value="重置"></s:reset></td>
				</tr>
			</table>
		</s:form>
		<s:fielderror></s:fielderror>
		<p align="center">Copyright &copy;2012 湖北工程学院版权所有
</body>
</html>