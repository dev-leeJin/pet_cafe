<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="pet" items="${petList}">
		<tr>
			<td>${pet.pet_kind }</td>
			<td>${pet.pet_name }</td>
			<td>${pet.pet_age }</td>
			<td>${pet.pet_gender }</td>
			<td><a href="http://localhost:8181/petCafePrj/petUpdate.do?pet_num=${pet.pet_num}"><input type="button" value="수정"/></a></td>
			<td><a href="http://localhost:8181/petCafePrj/petDelete.do?pet_num=${pet.pet_num}"><input type="button" value="삭제"/></a></td>
		</tr>
	</c:forEach>
	<a href="http://localhost:8181/petCafePrj/petjoin.do"><input type="button" value="추가"></a>
</body>
</html>