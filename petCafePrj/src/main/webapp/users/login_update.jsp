<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> ${ userdata.id}���� ���� ���� ������</h1>
	<form action="update_check.jsp" method="post">
	��й�ȣ : <input type="password" name="pw" required><br/>
	�̸� : <input type="text" name="name" value="${ userdata.name}" required><br/>
	�̸��� : <input type="email" name="email" value="${ userdata.email}"><br/>
	<input type="submit" value="�����ϱ�">
	<input type="reset" value="�ʱ�ȭ">
	</form>

</body>
</html>