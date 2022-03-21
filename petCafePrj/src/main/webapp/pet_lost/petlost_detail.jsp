<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>${petlost.lost_num }번글 상세페이지</h1>
   유기견 이름: <input type="text" value="${petlost.lost_name }">
   실종 장소: <input type="text" value="${petlost.lost_zone }"><br/>
   유기견 크기: <input type="text" value="${petlost.lost_size }">
   전화번호: <input type="text" value="${petlost.lost_phone }"><br/>
   <a href="http://localhost:8181/petCafePrj/petlostlist">목록으로</a>
   
   <form action="http://localhost:8181/petCafePrj/deletepetlost.do" method="post">
      <input type="hidden" value="${petlost.lost_num }" name="lost_num">
      <input type="submit" value="삭제">     
   </form>
   
   <form action="http://localhost:8181/petCafePrj/updateformpetlost.do" method="post">
      <input type="hidden" value="${petlost.lost_num }" name="lost_num">
      <input type="submit" value="수정하기">     
   </form>
</body>
</html>