<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登录</title>
</head>

<body>
	<form name="loginForm" method="post" action="/Test/User/login.do">
		<table>
			<tr>
				<td>用户名:<input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td>密码:<input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录"></td>
			</tr>
		</table>
	</form>
</body>
</html>
