<%@ page contentType="text/html; charset=UTF-8"%>
<%
	
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>注册</title>
</head>
<body>
	<form name="RegisterForm" method="post" action="/test/User/register.do">
		<table>
			<tr>
				<td>手机号码:<input type="text" name="user_mobile" id="user_mobile"></td>
			</tr>
			<tr>
				<td>密码:<input type="password" name="user_pwd" id="user_pwd"></td>
			</tr>
			<tr>
				<td>确认密码:<input type="password" name="confirmPassword"
					id="confirmPassword"></td>
			</tr>
			<tr>
				<td>性别: <select name="user_sex" id="user_sex">
						<option value="0">男</option>
						<option value="1">女</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>注册类型: <select name="user_role" id="user_role">
						<option value="0">消费者</option>
						<option value="1">摄影师</option>
				</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form>
</body>
</html>
