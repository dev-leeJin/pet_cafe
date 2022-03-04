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
	<a href="login_update.jsp">정보수정하기</a><br/>
	<a href="http://loaclhost:8181/petCafePrj/logout">로그아웃하기</a><br/><!-- 세션 파기 후 login_form.jsp로 보내주세요.
	login_form.jsp도 만약 로그인한 자용자가 접근하면 welcome페이지로 보내도록 로직을 살짝 수정해주세요. -->
	<a href="member_out.jsp">회원탈퇴하기</a><br/> <!-- 회원 탈퇴를 위해 member_out.jsp를 만들어주세요. -->
	<a href="user_list2.jsp">회원목록보기</a>
</body>
</html>