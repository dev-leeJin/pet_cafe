<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
    <%
    request.setCharacterEncoding("utf-8");
    
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
</html>
