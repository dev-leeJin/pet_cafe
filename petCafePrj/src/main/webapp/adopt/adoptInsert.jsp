<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8181/petCafePrj/adoptInsert.do" method="post">
      <input type="text" name="kind" placeholder="품종" required><br/>
      <input type="text" name="name" placeholder="이름" required><br/>
      <input type="text" name="age" placeholder="나이" required><br/>
      <input type="text" name="price" placeholder="가격" ><br/>
      <input type="text" name="phone" placeholder="전화번호" ><br/>
      <input type="checkbox" name="gender"><br/>
      <input type="submit" value="등록">
      <input type="reset" value="초기화">
   </form>
</body>
</html>