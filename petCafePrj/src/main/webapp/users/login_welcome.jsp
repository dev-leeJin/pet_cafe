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
	<h1><%=name %>(<%=id%>) �� �α����� ȯ���մϴ�.</h1>
	<a href="http://loaclhost:8181/petCafePrj/loginUpdate">���������ϱ�</a><br/>
	<a href="http://loaclhost:8181/petCafePrj/logout">�α׾ƿ��ϱ�</a><br/>
	<a href="member_out.jsp">ȸ��Ż���ϱ�</a><br/> 
</body>
</html>