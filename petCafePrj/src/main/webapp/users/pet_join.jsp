<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8181/petCafePrj/petJoin" method="post">
		<input type="text" name="id" value="${session_id}" >
		<input type="text" name="kind" required>
		<input type="text" name="name" required>
		<input type="number" name="age" required>
		<input type="checkbox" name="gender" required>
	</form>
</body>
</html>