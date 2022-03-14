<<<<<<< HEAD
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
=======
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8");
    
    // form에서 날려준 데이터를 받아서 변수에 저장하기
    String fId = request.getParameter("Fid");
    String fPw = request.getParameter("Fpw");
    String fName = request.getParameter("Fname");
    String fEmail = request.getParameter("Femail");
    
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
>>>>>>> a2508ad (최상오: 회원가입 / 탈퇴 로직)
</html>