<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
    
</head>
<body>
	<form action="http://loaclhost:8181/petCafePrj/loginCheck"  class="form-group row" method="post">
	<div class="col-lg-2">
	 <input type="text" class="form-control" name="id" placeholder="아이디"><br/>
	 <input type="password" class="form-control" name="pw" placeholder="비밀번호"><br/>	
	</div>
	<div class="cel-lg-1">
	<input type="submit" class="btn btn-outline-primary" value="로그인">
	</div>
	</form>
</body>
</html>