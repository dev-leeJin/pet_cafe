<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
   <form action="http://localhost:8181/petCafePrj/petlostlist" method="post">
      <input type="text" name="lost_name" placeholder="유기견 이름" required><br/>
      <input type="text" name="lost_zone" placeholder="유기견 실종장소" required><br/>
      <input type="text" name="lost_size" placeholder="유기견 크기" required><br/>
      <input type="text" name="lost_phone" placeholder="전화번호" required><br/>
      <input type="submit" value="등록">
      <input type="reset" value="초기화">    
   </form>
</body>
</html>
