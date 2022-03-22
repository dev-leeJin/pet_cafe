<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8181/petCafePrj/petJoinCheck.do" method="post">
		<input type="text" name="id" value="${session_id}" readonly >
		품종 :  
		<select class="form-select" name="kind">
		  <option value="1">치와와</option>
		  <option value="2">말티즈</option>
		  <option value="3">레브라도 리트리버</option>
		</select>
		<input type="text" name="name" placeholder="이름" required>
		나이 :  
		<select class="form-select" name="age">
			<c:forEach var="age" begin="1" end="15">
		  	<option value="${age }">${age }</option>
		  </c:forEach>
		</select>
		<input type="checkbox" name="gender">
		<input type="submit" value="생성">
	</form>
</body>
</html>