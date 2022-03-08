<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>${session_name }(${session_id }) 님 로그인을 환영합니다.</h1>
	<a href="http://loaclhost:8181/petCafePrj/userUpdate">정보수정하기</a><br/>
	<a href="http://loaclhost:8181/petCafePrj/logout">로그아웃하기</a><br/>
	<a href="member_out.jsp">회원탈퇴하기</a><br/> 
</body>
</html>