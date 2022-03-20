<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <c:if test="${sessionScope.session_id ne contest.user_id }">
   <%
   response.sendRedirect("http://localhot:8181/petCafePrj/contestlist.do");
   %>
   </c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8181/petCafePrj/contestUpdate" method="post">
<input type="hidden" name="cont_num" value="${contest.cont_num }"/>
글제목:<input type="text" name="title"value="${contest.cont_title }" />&nbsp;
글쓴이:<input type="text" value="${contest.user_id }" readonly/><br/><br/>
글내용:<textarea rows="30" cols="50" name="content" >${contest.cont_content }</textarea><br/><br/>
조회수:${contest.cont_hit}<br/><br/>
투표수:${contest.cont_votes}<br/><br/>
<input type="submit" value="수정완료"/>
</form>
</body>
</html>