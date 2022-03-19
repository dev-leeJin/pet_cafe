 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
글제목:<input type="text" value="${contest.cont_title }" readonly/>&nbsp;
글쓴이:<input type="text" value="${contest.user_id }" readonly/><br/><br/>
<textarea rows="30" cols="50" readonly>${contest.cont_content }</textarea><br/><br/>
펫종류:<input type="text" value="${pet.pet_kind}" readonly/><br/>
펫이름:<input type="text" value="${pet.pet_name}" readonly/><br/>
펫나이:<input type="text" value="${pet.pet_age}" readonly/><br/>
펫성별:<input type="text" value="${pet.pet_gender}" readonly/><br/><br/>
조회수:${contest.cont_hit}<br/><br/>
투표수:${contest.cont_votes}<br/><br/>
<c:if test="${sessionScope.session_id eq contest.user_id }">
<form action="http://localhost:8181/petCafePrj/contestdelete.do" method="post">
<input type="hidden" name="user_id" value="${contest.user_id }"/><br/>
<input type="hidden" name="cont_num" value="${contest.cont_num }"/><br/>
<input type="submit" value="삭제하기"/>
</form>
<form action="http://localhost:8181/petCafePrj/contestUpdateform.do" method="post">
<input type="hidden" name="user_id" value="${contest.user_id }"/><br/>
<input type="hidden" name="cont_num" value="${contest.cont_num }"/><br/>
<input type="submit" value="수정하기"/>
</form>
</c:if>
<a href="http://localhost:8181/petCafePrj/contestlist.do">컨테스트 게시판으로 이동</a>
</body>
</html>