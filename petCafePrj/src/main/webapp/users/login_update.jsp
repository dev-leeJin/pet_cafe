<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> ${userdata.id}님의 정보 수정 페이지</h1>
	<form action="http://loaclhost:8181/petCafePrj/updateCheck" method="post">
	비밀번호 : <input type="password" name="pw" required><br/>
	이름 : <input type="text" name="name" value="${userdata.name}" required><br/>
	이메일 : <input type="email" name="email" value="${userdata.email}"><br/>
	<input type="submit" value="수정하기">
	<input type="reset" value="초기화">
	</form>

</body>
</html>

