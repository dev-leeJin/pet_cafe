<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table table-hover">
<thead>
<tr>
<td>컨테스트 번호</td>
<td>글쓴이</td>
<td>글제목</td>
<td>애견번호</td>
<td>조회수</td>
<td>투표수</td>
</tr>
</thead>
<tbody>
<c:forEach var="contest" items="${contestList }">
<tr>
<td>${contest.cont_num }</td>
<td>${contest.user_id }</td>
<td><a href="http://localhost:8181/petCafePrj/contestdetail.do?cont_num=${contest.cont_num }">${contest.cont_title }</a></td>
<td>${contest.pet_num }</td>
<td>${contest.cont_hit }</td>
<td>${contest.cont_votes }</td>
</tr>
</c:forEach>
</tbody>
</table>
<c:if test="${sessionScope.session_id ne null }">
<a href="http://localhost:8181/petCafePrj/contestInsertForm.do"><button>글등록하기</button></a>
</c:if>
</body>
</html>