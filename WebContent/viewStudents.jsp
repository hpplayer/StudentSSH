<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>��ʾѧ����Ϣ</title>
</head>
<body>
	<center>
		<h1>��������ѧԺѧ������ϵͳ</h1>
		<a href="index.jsp">��ҳ</a>
		<table align="center" border="1">
			<tr>
				<th>ѧ��</th>
				<th>����</th>
				<th>רҵ</th>
				<th>�޸�</th>
				<th>ɾ��</th>
			</tr>
			<s:iterator value="students">
				<tr>
					<td><s:property value="sid" /></td>
					<td><s:property value="sname" /></td>
					<td><s:property value="subject" /></td>
					<td><a
						href="ModifyStudent.action?student.id=<s:property value="id"/>">�޸�</a></td>
					<td><a
						href="DeleteStudent.action?student.id=<s:property value="id"/>">ɾ��</a></td>
				</tr>
			</s:iterator>
		</table>
		<a href="addStudent.jsp">����ѧ����Ϣ</a>
	</center>
	<p align="center">Copyright &copy;2012 ��������ѧԺ��Ȩ����
</body>
</html>