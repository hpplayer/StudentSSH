<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>�޸Ľ�ʦ��Ϣ</title>
</head>
<body>
	<center>
		<h1>��������ѧԺѧ������ϵͳ</h1>
		<a href="index.jsp">��ҳ</a>
		<s:form action="ModifyTeacher1" method="post" theme="simple">
			<p>
				<s:hidden name="teacher.id"></s:hidden>
			<p>
				��ʦְ���ţ�
				<s:textfield name="teacher.tid"></s:textfield>
			<p>
				��ʦ������
				<s:textfield name="teacher.tname"></s:textfield>
			<p>
				<s:submit value="ȷ��"></s:submit>
				<s:reset value="����"></s:reset>
		</s:form>
		<s:fielderror></s:fielderror>
		<a href="ViewTeachers.action">��ʾ��ʦ��Ϣ</a>
	</center>
	<p align="center">Copyright &copy;2012 ��������ѧԺ��Ȩ����
</body>
</html>