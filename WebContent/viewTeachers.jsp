<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>��ʾ��ʦ��Ϣ</title>
</head>
<body>
	<center>
		<h1>��������ѧԺѧ������ϵͳ</h1>
		<a href="index.jsp"></a> <a href="index.jsp">��ҳ</a>
		<table align="center" border="1">
			<tr>
				<th>��ʦְ����</th>
				<th>��ʦ����</th>
				<th>�޸�</th>
				<th>ɾ��</th>
			</tr>
			<s:iterator value="teachers">
				<tr>
					<td><s:property value="tid" /></td>
					<td><s:property value="tname" /></td>
					<td><a
						href="ModifyTeacher.action?teacher.id=<s:property value="id"/>">�޸�</a></td>
					<td><a
						href="DeleteTeacher.action?teacher.id=<s:property value="id"/>">ɾ��</a></td>
				</tr>
			</s:iterator>
		</table>
		<a href="addTeacher.jsp">���ӽ�ʦ��Ϣ</a>
	</center>
	<p align="center">Copyright &copy;2012 ��������ѧԺ��Ȩ����
</body>
</html>