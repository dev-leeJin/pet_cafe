<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	/*
	if(id.equals(uservo.getuId())) {
		if(pw.equals(uservo.getuPw())) {
			String name = uservo.getuName();
			session.setAttribute("session_id", id);
			session.setAttribute("session_pw", pw);
			session.setAttribute("session_name", name);
			response.sendRedirect("login_welcome.jsp");
		}
	}
	*/
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>