<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- 부트스트랩 주소 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
      border: 1px solid red;
      width: 1200px;
      margin: 0 auto;
     }
    
     .header .logo{
      padding: 5px;
      border: 1px solid red;}
    
     .header .logo img{width: 100%;}
    
     .header .container{display: flex;justify-content:space-between;align-items: center;}
    
    .header .login_Box{border: 2px solid orange;}
    
    .header .login_Box .form-group{display: flex;align-items: center;}
    
    /* 헤더 폼 */
    .form-group .form-control{border: 1px solid red;
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

    .section1{width: 1200px;
      margin: 0 auto;
    border: 1px solid red;
    margin-top: 30px;}

    .board_Update{border: 1px solid red;
    text-align: center;
  padding: 10px;}

    .board_Update input{margin-bottom: 20px;
    border-radius:5px;
    border: 1px solid #f19292;
    height:30px;
    margin-left: 30px;}

  .board_Update input:nth-child(4){margin-left:5px;}
  .board_Update input:nth-child(8){margin-left:47px;}    
  .board_Update input:focus{outline: none;}

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
      <h1 class="logo"><a href ="#"><img src="img/logo.png"></a></h1>
		<c:if test="${sessionScope.session_id ne null }">
      	${session_name }님
      	<a href="http://localhost:8181/petCafePrj/users/login_welcome.jsp">마이페이지</a>
        <a href="http://localhost:8181/petCafePrj/pet/pet_welcome.jsp">마이펫페이지</a>
      </c:if>
     </div>

    <ul class="menu">
      <li class="menu-li"><a href="http://localhost:8181/petCafePrj/contestlist.do">애견콘테스트</a></li>
  	  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/adoptlist.do">애견 분양</a></li>
  	  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/petlostlist.do">유기견게시판</a></li>
  	  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/boardlist.do">자유게시판</a></li>
    </ul>
    </header>
  
    <section class="section section1">
      <div class="board_Update">
      <form action="http://localhost:8181/petCafePrj/petCafePrj/updatepetlost.do" method="post">
        <input type="hidden" name="lost_num" value="${petlost.lost_num }">
        유기견 이름<input type="text" name="lost_name" value="${petlost.lost_name}"><br/>
        유기견 크기 <input type="text" name="lost_size" value="${petlost.lost_size}"><br/>
        전화번호 <input type="text" name="lost_phone" value="${petlost.lost_phone}"><br/>
        실종날짜 <input type="date" name="lost_date" value="${petlost.lost_date}"><br/>
        <select name="lost_zone" required>
        		<option>실종장소</option>
                <option>서울특별시</option>
                <option>부산광역시</option>
                <option>대구광역시</option>
                <option>인천광역시</option>
                <option>광주광역시</option>
                <option>대전광역시</option>
                <option>울산광역시</option>
                <option>세종특별자치시</option>
                <option>경기도</option>
                <option>강원도</option>
                <option>강원도</option>
                <option>충청북도</option>
                <option>충청남도</option>
                <option>전라북도</option>
                <option>경상북도</option>
                <option>경상남도</option>
                <option>제주특별자치도</option>
     	</select>
        <hr/>
        <input type="submit" value="수정완료">
        <input type="reset" value="초기화">
     </form>
     </div>
    </section>
</body>
</html>