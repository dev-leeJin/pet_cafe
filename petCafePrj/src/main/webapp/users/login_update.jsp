<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String)session.getAttribute("session_id");
	if(id==null) {
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
	<h1> <%=id %>���� ���� ���� ������</h1>
	<form action="update_check.jsp" method="post">
	��й�ȣ : <input type="password" name="pw" required><br/>
	�̸� : <input type="text" name="name" value=<%=userData.getuName() %> required><br/>
	�̸��� : <input type="email" name="email" value=<%=userData.getuEmail() %>><br/>
	<input type="submit" value="�����ϱ�">
	<input type="reset" value="�ʱ�ȭ">
	</form>

</body>
</html>