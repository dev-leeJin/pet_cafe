<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.co.easydog.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	// 2. session에 저장된 아이디를 변수로 저장해주세요.
	String id = (String)session.getAttribute("session_id");
	if(id == null) {
		response.sendRedirect("login_form.jsp");
	}
	
	UserDAO userdao = UserDAO.getInstance();
	userdao.userUpdate(id, pw, name, email);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=name %> 회원님의 정보가 수정되었습니다.</h1>
	<a href="login_welcome.jsp">돌아가기</a>
</body>
</html>