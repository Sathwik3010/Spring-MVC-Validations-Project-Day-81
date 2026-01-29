<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="text-align: center">User Registration Details</h2>
	<table border="1" align="center">
		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Address</th>
				<th>Mobile</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>
				<td>${user.address}</td>
				<td>${user.mobile}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>