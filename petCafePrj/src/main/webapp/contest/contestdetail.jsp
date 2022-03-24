<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

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

    /* 세션1 */
    .section1 {width: 100%; max-width: 1200px;margin: 0 auto;
      text-align: center;
    margin-top: 30px;;}

    .section1 textarea,
    .section1 input{border: 1px solid #f19292;}  

    .section1 input[type="text"],
    .section1 textarea:focus{outline: none;}

    .section1 textarea{border-radius: 5px;}

    .section1 input[type="text"],
    .section1 input[type ="submit"]{background-color:white;color:#333;
    width:130px;
    border-radius:5px;
    height: 30px;}

    .section1 input[type="submit"] {transition: 0.3s;}
    .section1 input[type="text"] {margin-bottom: 20px;}

    /* 버튼 hover */
    .section1 input[type="submit"]:hover{background-color:#f19292;color: #fff;}

    /* 푸터 */
    .footer address{
    text-align: center;}  



  </style>
</head>
<body>
 <!-- 헤더 -->
 <header class="header">
  <div class="container">
  <h1 class="logo"><a href ="/petCafePrj"><img src="../img/logo.png"></a></h1>

  <div class="login_Box">
  <form action="http://loaclhost:8181/petCafePrj/loginCheck"  class="form-group form-inline" method="post">
     <input type="text" class="form-control" name="id" placeholder="아이디">
     <input type="password" class="form-control" name="pw" placeholder="비밀번호">
    <input type="submit" class="btn btn-outline-primary" value="로그인">

    </form>
  </div>
</div>

<ul class="menu">
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/contestlist.do">애견콘테스트</a></li>
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/adoptlist.do">애견 분양</a></li>
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/petlostlist.do">유기견게시판</a></li>
  <li class="menu-li"><a href="http://localhost:8181/petCafePrj/boardlist.do">자유게시판</a></li>
</ul>
</header> <!-- 헤더-->


<!-- 세션 -->
<section class="section section1">

글제목:<input type="text" value="${contest.cont_title }" readonly/>&nbsp;
글쓴이:<input type="text" value="${contest.user_id }" readonly/><br/><br/>
<textarea rows="30" cols="50" readonly>${contest.cont_content }</textarea><br/><br/>

펫종류:<input type="text" value="${pets.pet_kind}" readonly/><br/>
펫이름:<input type="text" value="${pets.pet_name}" readonly/><br/>
펫나이:<input type="text" value="${pets.pet_age}" readonly/><br/>
펫성별:<input type="text" value="${pets.pet_gender}" readonly/><br/><br/>

조회수:${contest.cont_hit}<br/><br/>
투표수:${contest.cont_votes}<br/><br/>
<form action="http://localhost:8181/petCafePrj/contestvote.do" method="post">
<input type="hidden" name="cont_num" value="${contest.cont_num}"/>
<input type="submit" value="투표하기"/>
</form>
<c:if test="${sessionScope.session_id eq contest.user_id }">
<form action="http://localhost:8181/petCafePrj/contestdelete.do" method="post">
<input type="hidden" name="user_id" value="${contest.user_id }"/><br/>
<input type="hidden" name="cont_num" value="${contest.cont_num }"/><br/>
<input type="submit" value="삭제하기"/>
</form>
<form action="http://localhost:8181/petCafePrj/contestUpdateform.do" method="post">
<input type="hidden" name="user_id" value="${contest.user_id }"/><br/>
<input type="hidden" name="cont_num" value="${contest.cont_num }"/><br/>
<input type="submit" value="수정하기"/>
</form>
</c:if>

<a href="http://localhost:8181/petCafePrj/contestlist.do">컨테스트 게시판으로 이동</a>

</section> <!-- 세션1-->

<!-- 푸터 -->
<hr>
<footer class="footer">
<div class="contaier">
  <address>

         서울특별시 마포구 양화로 첨단빌딩 7층<br>
        연락처 : 02-0202-0202<br>
            COPYRIGHT &copy; ICT인재개발원 All Rights Reserved

</address>
</div> <!--푸터-->
</body>
</html>