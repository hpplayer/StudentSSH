<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix='s' uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>�����γ�</title>
</head>
<body>
	<center>
		<h1>��������ѧԺѧ������ϵͳ</h1>
		<a href="index.jsp">������ҳ</a>
		<s:form action="AddCourse" method="post" theme="simple">
			<p>
				�γ̺ţ�
				<s:textfield name="course.cid"></s:textfield>
			<p>
				�γ�����
				<s:textfield name="course.cname"></s:textfield>
			<p>
				����ѧ�ڣ�
				<s:textfield name="course.kkxq"></s:textfield>
			<p>
				�γ�ѧʱ��
				<s:textfield name="course.xs"></s:textfield>
			<p>
				�γ�ѧ�֣�
				<s:textfield name="course.xf"></s:textfield>
			<p>
				<s:submit value="ȷ��"></s:submit>
				<s:reset value="����"></s:reset>
		</s:form>

		<s:fielderror></s:fielderror>
		<p>Copyright &copy;2012 ��������ѧԺ��Ȩ����</p>
	</center>
</body>
</html>