<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
    String id = (String)session.getAttribute("session_id");
	String name = (String)session.getAttribute("session_name");
	if(id == null) {
		response.sendRedirect("login_form.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1><%=name %>(<%=id%>) 님 로그인을 환영합니다.</h1>
	<a href="http://loaclhost:8181/petCafePrj/loginUpdate">정보수정하기</a><br/>
	<a href="http://loaclhost:8181/petCafePrj/logout">로그아웃하기</a><br/>
	<a href="member_out.jsp">회원탈퇴하기</a><br/> 
</body>
</html>