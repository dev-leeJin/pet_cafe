<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <c:if test="${sId eq null }">
   <%
   response.sendRedirect("http://localhot:8181/petCafePrj/contestlist.do");
   %>
   </c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/petCafePrj/contestInsert.do" method="post">
<input type="text" name="uid" value="${sId}"readonly/> 
<input type="text" name="title" placeholder="글제목" required/><br/><br/>
<textarea rows="30" cols="50" name="content" placeholder="글내용" required></textarea><br/>
펫종류:<input type="text" value="${pet.pet_kind}" readonly/><br/>
펫이름:<input type="text" value="${pet.pet_name}" readonly/><br/>
펫나이:<input type="text" value="${pet.pet_age}" readonly/><br/>
펫성별:<input type="text" value="${pet.pet_gender}" readonly/><br/><br/>
<input type="hidden" name="pnum" value="${contest.pet_num}"/>
<input type="text" name="pvote"  placeholder="투표수" /><br/><br/>
<input type="submit" value="글쓰기완료"/>
<input type="reset" value="초기화"/>

</form>
</body>
</html>