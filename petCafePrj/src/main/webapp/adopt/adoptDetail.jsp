<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${adoptData.adopt_num }번글 상세페이지</h1>
   품종: <input type="text" value="${adoptData.adopt_kind}">
   이름: <input type="text" value="${adoptData.adopt_name}">
   나이: <input type="text" value="${adoptData.adopt_age}"><br/>
   가격: <input type="text" value="${adoptData.adopt_price}">
   전화번호: <input type="text" value="${adoptData.adopt_phone }"><br/>
   <a href="http://localhost:8181/petCafePrj/adoptlist.do">목록으로</a>
   
   <form action="http://localhost:8181/petCafePrj/adoptdelete.do" method="post">
      <input type="hidden" value="${adoptData.adopt_num }" name="adopt_num">
      <input type="submit" value="삭제">     
   </form>
   
   <form action="http://localhost:8181/petCafePrj/adoptUpdateForm.do" method="post">
      <input type="hidden" value="${adoptData.adopt_num }" name="adopt_num">
      <input type="submit" value="수정하기">     
   </form>
</body>
</html>