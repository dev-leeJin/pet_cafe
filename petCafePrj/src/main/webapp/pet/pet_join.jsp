<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8181/petCafePrj/petJoinCheck.do" method="post">
		<input type="text" name="id" value="${session_id}" >
		<input type="text" name="kind" required>
		<input type="text" name="name" required>
		<input type="text" name="age" required>
		<input type="checkbox" name="gender">
		<input type="submit" value="생성">
	</form>
</body>
</html>