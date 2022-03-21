
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${session_name }(${session_id }) 님 로그인을 환영합니다.</h1>
	<a href="http://localhost:8181/petCafePrj/userUpdate">정보수정하기</a><br/>
	<a href="http://localhost:8181/petCafePrj/logout">로그아웃하기</a><br/>
	<a href="member_out.jsp">회원탈퇴하기</a><br/> 
</body>
</html>