<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>����ѧ����Ϣ</title>
</head>
<body>
	<center>
		<h1>��������ѧԺѧ������ϵͳ</h1>
		<a href="index.jsp">��ҳ</a>
		<s:form action="AddStudent" method="post" theme="simple">
			<p>
				ѧ��
				<s:textfield name="student.sid"></s:textfield>
			<p>
				����
				<s:textfield name="student.sname"></s:textfield>
			<p>
				רҵ
				<s:textfield name="student.subject"></s:textfield>
			<p>
				<s:submit value="ȷ��"></s:submit>
				<s:reset value="����"></s:reset>
		</s:form>
		<s:fielderror></s:fielderror>
		<p>Copyright &copy;2012 ��������ѧԺ��Ȩ����
	</center>
</body>
</html>