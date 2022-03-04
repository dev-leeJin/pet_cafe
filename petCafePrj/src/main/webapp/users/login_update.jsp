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
	<h1> <%=id %>님의 정보 수정 페이지</h1>
	<form action="update_check.jsp" method="post">
	비밀번호 : <input type="password" name="pw" required><br/>
	이름 : <input type="text" name="name" value=<%=userData.getuName() %> required><br/>
	이메일 : <input type="email" name="email" value=<%=userData.getuEmail() %>><br/>
	<input type="submit" value="수정하기">
	<input type="reset" value="초기화">
	</form>

</body>
</html>