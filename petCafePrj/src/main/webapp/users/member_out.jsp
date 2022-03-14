<<<<<<< HEAD
<%@page import="kr.co.easydog.UserDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String sId = (String)session.getAttribute("session_id");
    
    if(sId == null){   	
    	response.sendRedirect("login_form.jsp");
    }  
    UserDAO dao = UserDAO.getInstance();
	dao.deleteUser(sId);
    session.invalidate();

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1><%=sId %> 회원의 탈퇴가 완료되었습니다.</h1>
   <a href="login_form.jsp">로그인 하러가기</a>
</body>
=======
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String sId = (String)session.getAttribute("session_id");
    
    if(sId == null){   	
    	response.sendRedirect("login_form.jsp");
    }  

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1><%=sId %> 회원의 탈퇴가 완료되었습니다.</h1>
   <a href="login_form.jsp">로그인 하러가기</a>
</body>
>>>>>>> a2508ad (최상오: 회원가입 / 탈퇴 로직)
</html>