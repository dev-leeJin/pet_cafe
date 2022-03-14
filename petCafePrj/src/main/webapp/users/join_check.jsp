<%@page import="kr.co.easydog.UserDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8");
    
    int unum = Integer.parseInt(request.getParameter("num"));
    String uid = request.getParameter("id");
    String upw = request.getParameter("pw");
    String uname = request.getParameter("name");
    String uemail = request.getParameter("email");
    String uadmin = request.getParameter("admin");
    
    UserDAO dao = UserDAO.getInstance();
	dao.insertUser(unum, uid, upw, uname, uemail, uadmin);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <a href="login_form.jsp">로그인 하러가기</a>
</body>
</html>