<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="pet" items="${petList}">
		<tr>
			<td>${pet.pet_kind }</td>
			<td>${pet.pet_name }</td>
			<td>${pet.pet_age }</td>
			<td>${pet.pet_gender }</td>
			<td><a href="http://localhost:8181/MyFirstWeb/petUpdate?pet_num=${pet.pet_num}"><input type="button" value="수정"/></a></td>
			<td><a href="http://localhost:8181/MyFirstWeb/petDelete?pet_num=${pet.pet_num}"><input type="button" value="삭제"/></a></td>
		</tr>
	</c:forEach>
	<a href="http://localhost:8181/petCafePrj/petJoin"><input type="button" value="추가"></a>
</body>
</html>