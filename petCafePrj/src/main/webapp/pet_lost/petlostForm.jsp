<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 부트스트랩 주소 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

   <!-- font -->
<link rel="preconnect" href="https://fonts.googleapis.com/%22%3E">
<link rel="preconnect" href="https://fonts.gstatic.com/" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">


<title>Pet</title>

<style>
  *{
      margin: 0;
      padding: 0;
      position: relative;
      font-family: 'Noto Sans KR', sans-serif;
      list-style: none;}
  
  
   
  body{background:#fffaed;}
  
  .header{
    /* border: 1px solid red; */
    width: 1200px;
    margin: 0 auto;
   }
  
   .header .logo{
    padding: 5px;
    /* border: 1px solid red;*/}
  
   .header .logo img{width: 100%;}
  
   .header .container{display: flex;justify-content:space-between;align-items: center;}
  
  .header .login_Box{border: 2px solid orange;}
  
  .header .login_Box .form-group{display: flex;align-items: center;}
  
  /* 헤더 폼 */
  .form-group .form-control{
    /* border: 1px solid red; */
    width:190px;
    margin-left: 10px;;}
  .form-group .form-control::placeholder{font-size:15px;}
  .btn{
  background-color: white;
  color: #484848;
  font-size: 15px;
  margin-left: 10px;
  border:1px solid #f19292;}
  
  /* 버튼 hover */
  .btn:hover{background-color: #f19292;
  border:1px solid #f19292;}
  
  
  .header .menu{display: flex;justify-content: center; align-items: center;;
  background: #f19292;}
  .header .menu .menu-li{border: 1px solid red;
    margin-left: 20px;
    font-size: 18px;
    font-weight: 500;
    padding: 5px;
    color: white;}
  
  
  
  .header .menu .menu-li>a{color:white;
    text-decoration: none;
  transition: 0.5s;}
  
  
  .header .container{border: 1px solid red;
    display: flex;
  }
  
  /* 헤더 메뉴 hover */
  
  .header .menu-li:hover a{color:#484848;}


/* 세션1 */

.section1 {width: 1200px;
  margin: 0 auto;
  margin-top: 30px;
  text-align: center;}

.section input{border: 1px solid #f19292;
border-radius: 5px;
height: 30px;
margin-bottom: 20px;
color: #333;}

.section1 input:focus{outline: none;}

.section1 input[type="submit"],
.section1 input[type="reset"]
  {border: 1px solid #f19292;
  width: 130px;
  background: white;
  color: #333;
  transition: 0.3s;}


  /* 버튼 hover */

.section1 input[type="submit"]:hover{background-color:#f19292;
color:#fff;}

.section1 input[type="reset"]:hover{background-color:#f19292;
color:#fff;}




</style>
</head>
<body>
  <!-- 헤더 -->
    <header class="header">
      <div class="container">
      <h1 class="logo"><a href ="#"><img src="logo.png"></a></h1>

      <div class="login_Box">
      <form action="http://loaclhost:8181/petCafePrj/loginCheck"  class="form-group form-inline" method="post">
         <input type="text" class="form-control" name="id" placeholder="아이디">
         <input type="password" class="form-control" name="pw" placeholder="비밀번호">
        <input type="submit" class="btn btn-outline-primary" value="로그인">
   
        </form>
      </div>
    </div>

    <ul class="menu">
      <li class="menu-li"><a href="#">애견콘테스트</a></li>
      <li class="menu-li"><a href="#">애견 분양</a></li>
      <li class="menu-li"><a href="#">유기견게시판</a></li>
      <li class="menu-li"><a href="#">자유게시판</a></li>
    </ul>
    </header>
  
    <section class="section section1">
   <form action="http://localhost:8181/petCafePrj/insertpetlost" method="post">
      <input type="text" name="lost_name" placeholder="유기견 이름" required><br/>
      <input type="text" name="lost_zone" placeholder="유기견 실종장소" required><br/>
      <input type="text" name="lost_size" placeholder="유기견 크기" required><br/>
      <input type="text" name="lost_phone" placeholder="전화번호" required><br/>
      <input type="submit" value="등록">
      <input type="reset" value="초기화">
   </form>
  </section>
</body>
</html>