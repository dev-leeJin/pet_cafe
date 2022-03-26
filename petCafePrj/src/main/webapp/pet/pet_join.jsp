<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
      
      width: 1200px;
      margin: 0 auto;
     }
    
     .header .logo{
      padding: 5px;
      }
    
     .header .logo img{width: 100%;}
    
     .header .container{display: flex;justify-content:space-between;align-items: center;}
    
    .header .login_Box{}
    
    .header .login_Box .form-group{display: flex;align-items: center;}
    
    /* 헤더 폼 */
    .form-group .form-control{
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
    .header .menu .menu-li{
      margin-left: 20px;
      font-size: 18px;
      font-weight: 500;
      padding: 5px;
      color: white;}
    
    
    
    .header .menu .menu-li>a{color:white;
      text-decoration: none;
    transition: 0.5s;}
    
    
    .header .container{
      display: flex;
    }
    
    /* 헤더 메뉴 hover */
    
    .header .menu-li:hover a{color:#484848;}

    /* section1 */
    .section1 {width: 100%;max-width: 1200px; margin: 0 auto;
    margin-top: 30px;}    
    
    .section1 > form {text-align: center;}

    .section1 input[type="submit"]{width: 130px; height: 30px; color: #333;
    background: #fff;
  border: 1px solid #f19292;
  border-radius: 5px;
  margin-left: 10px;
  transition: 0.3s;}

  .section1 input[type="text"]{border: 1px solid #f19292;
  height: 30px;
border-radius: 5px;
margin-left:10px;}

.section1 input[type="checkbox"] {margin-left: 10px;}

    .section1 input[type="submit"]:focus,
    .section1 input[type="text"] {outline: none;}

    /* 버튼 hover */

    .section1 input[type="submit"]:hover{background-color: #f19292; color: #fff;}

  /* 푸터 */
  .footer address{
  text-align: center;}  

</style>
</head>
<body>

 <!-- 헤더 -->
 <header class="header">
  <div class="container">

  <h1 class="logo"><a href ="/petCafePrj"><img src="img/logo.png"></a></h1>

  <c:if test="${sessionScope.session_id eq null }">
      	<div class="login_Box">
      	<form action="http://localhost:8181/petCafePrj/loginCheck"  class="form-group form-inline" method="post">
        	<input type="text" class="form-control" name="id" placeholder="아이디">
         	<input type="password" class="form-control" name="pw" placeholder="비밀번호">
        	<input type="submit" class="btn btn-outline-primary" value="로그인">
   		</form>
      </div>
      </c:if>
      <c:if test="${sessionScope.session_id ne null }">
      	${session_name }님 환영합니다.
      	<a href="http://localhost:8181/petCafePrj/users/login_welcome.jsp">마이페이지</a>
        <a href="http://localhost:8181/petCafePrj/petWelcome.do">마이펫페이지</a>
        <a href="http://localhost:8181/petCafePrj/logout.do">로그아웃하기</a>
      </c:if>
</div>

<ul class="menu">
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/contestlist.do">애견콘테스트</a></li>
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/adoptlist.do">애견 분양</a></li>
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/petlostlist.do">유기견게시판</a></li>
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/boardlist.do">자유게시판</a></li>
</ul>
</header>


<!-- section1 -->
<section class="section section1">
	<form action="http://localhost:8181/petCafePrj/petJoinCheck.do" method="post">
		<input type="text" name="id" value="${session_id}" readonly ><br/>
		품종 :  
		<select class="form-select" name="kind">
		  <option value="1">치와와</option>
		  <option value="2">말티즈</option>
		  <option value="3">레브라도 리트리버</option>
		</select>
		<input type="text" name="name" placeholder="이름" required><br/>
		나이 :  
		<select class="form-select" name="age">
			<c:forEach var="age" begin="1" end="15">
		  	<option value="${age }">${age }</option>
		  </c:forEach>
		</select>
		성별 : <input type="radio" name="gender" value="True" checked="checked"> 수컷
			  <input type="radio" name="gender" value="False"> 암컷
		<input type="submit" value="생성">
	</form>
</section>

<!-- 푸터 -->
<hr>
<footer class="footer">
<div class="contaier">
  <address>

         서울특별시 마포구 양화로 첨단빌딩 7층<br>
        연락처 : 02-0202-0202<br>
            COPYRIGHT &copy; ICT인재개발원 All Rights Reserved

</address>
</div>
</footer>
</body>
</html>