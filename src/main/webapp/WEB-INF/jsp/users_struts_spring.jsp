<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Users List</title>
</head>
<body>

	<%@ taglib uri="/struts-tags" prefix="s"%>

	<h1>Users List - Struts/Spring/Jdbc</h1>
	
	<h2><a href="/my-app-4-context">Menu Principal</a></h2>
	
	<s:iterator value="list">
		<fieldset>
			<td>
			<s:property value="name" />
			</td>
			<td>
			<s:property value="login" />
			</td>
			<td>
			<s:property value="password" />
			</td>
		</fieldset>
	</s:iterator>

</body>
</html>
