<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 강아지 정보 수정페이지 -->
	<form action="http://localhost:8181/petCafePrj/petUpdateCheck.do" method="post">
		<input type="text" name="id" value="${session_id}" readonly>
		<input type="text" name="kind" value="${petData.pet_kind }" required>
		<input type="text" name="name" value="${petData.pet_name }" required>
		<input type="text" name="age" value="${petData.pet_age }" required>
		<input type="hidden" name="pet_num" value="${petData.pet_num }" required>
		<input type="checkbox" name="gender">
		<input type="submit" value="수정">
	</form>
</body>
</html>