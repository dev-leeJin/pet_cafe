<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

   <form action="join_check.jsp" method="post">
   <div class="col-lg-2">
      <input type="text" name="id" class="form-control" placeholder="아이디" required><br/>
      <input type="password" name="pw" class="form-control" placeholder="비밀번호" required ><br/>
      <input type="text" name="name" class="form-control" placeholder="이름" required ><br/>
      <input type="email" name="email" class="form-control" placeholder="이메일" ><br/>
      <input type="text" name="admin" class="form-control" placeholder="운영자 여부" ><br/>
      <input type="submit" class="btn btn-outline-primary" value="가입하기" >
      <input type="reset" class="btn btn-outline-primary" value="초기화" >
    </div>
   </form>
</body>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 페이지</h1>
   <form action="join_check.jsp" method="post">
      <input type="text" name="Fid" placeholder="아이디" required><br/>
      <input type="password" name="Fpw" placeholder="비밀번호" required ><br/>
      <input type="text" name="Fname" placeholder="이름" required ><br/>
      <input type="email" name="Femail" placeholder="이메일" ><br/>
      <input type="submit" value="가입하기" >
      <input type="reset" value="초기화" >
   </form>
</body>
>>>>>>> a2508ad (최상오: 회원가입 / 탈퇴 로직)
</html>