<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="http://localhost:8181/" method="post">
      <input type="hidden" name="lost_num" value="${petlost.lost_num }">
      유기견 이름: <input type="text" name="lost_name" value="${petlost.lost_name}"><br/>
      유기견 실종장소: <input type="text" name="lost_zone" value="${petlost.lost_zone}"><br/>
      유기견 크기: <input type="text" name="lost_size" value="${petlost.lost_size}"><br/>
      전화번호: <input type="text" name="lost_phone" value="${petlost.lost_phone}"><br/>
      <input type="submit" value="수정완료">
      <input type="reset" value="초기화">
   </form>
</body>
</html>