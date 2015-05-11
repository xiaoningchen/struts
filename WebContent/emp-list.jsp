<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<s:form action="emp-add">
		<s:textfield name="name" label="name"></s:textfield>
		<s:textfield name="phone" label="phone"></s:textfield>
		<s:textfield name="email" label="email"></s:textfield>
		<s:submit ></s:submit>
	</s:form>
	<br>
	<hr>
	<br>
	<table cellpadding="10" cellspacing="0" border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>phone</td>
				<td>email</td>
				<td>edit</td>
				<td>delete</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="#request.emps">
				<tr>
					<td>${empId }</td>
					<td>${name }</td>
					<td>${phone }</td>
					<td>${email }</td>
					<td><a href="">edit</a></td>
					<td><a href="emp-delete?employeeId=${empId }">delete</a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	</center>
</body>
</html>