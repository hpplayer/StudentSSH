<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>�޸�С����Ϣ</title>
</head>
<body>
	<center>
		<h1>��������ѧԺѧ������ϵͳ</h1>
		<s:form action="ModifyStudent1" method="post" theme="simple">
			<s:hidden name="student.id"></s:hidden>
			<p>
				ѧ�ţ�
				<s:textfield name="student.sid"></s:textfield>
			<p>
				������
				<s:textfield name="student.sname"></s:textfield>
			<p>
				רҵ��
				<s:textfield name="student.subject"></s:textfield>
			<p>
				<s:submit value="ȷ��"></s:submit>
				<s:reset value="�ظ�"></s:reset>
			<p>
				<s:fielderror></s:fielderror>
		</s:form>
		<p>
			<a href="index.jsp">��ҳ</a>
		<p>
			<a href="ViewStudents.action">��ʾѧ����Ϣ</a>
		</p>
	</center>
	<p align="center">Copyright &copy;2012 ��������ѧԺ��Ȩ����
</body>
</html>