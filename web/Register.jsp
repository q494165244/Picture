<%@ page contentType="text/html; charset=UTF-8"%>
<%
	
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>注册</title>
</head>
<body>
	<form name="RegisterForm" method="post" action="/Test/User/register.do">
		<table>
			<tr>
				<td>用户名:<input type="text" name="userid" id="userid"></td>
			</tr>
			<tr>
				<td>姓名:<input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<td>密码:<input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td>确认密码:<input type="password" name="confirmPassword" id="confirmPassword"></td>
			</tr>
			<tr>
				<td>电话号码:<input type="text" name="phonenumber" id="phonenumber"></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form>
</body>
</html>
