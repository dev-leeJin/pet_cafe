<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<title>Insert title here</title>
</head>
<body>
<h1>${board.board_num}번 글 상세페이지</h1>
글제목:<input type="text" value="${board.title }" readonly>
글쓴이:<input type="text" value="${board.writer }" readonly>
조회수:${board.hit }<br/>
날짜:<input type="text" value="${board.bdate }" readonly>
마지막 수정날짜:${board.mdate }<br/>
본문:<textarea rows="15" cols="50" readonly>${board.content }</textarea><br/>
<a href="http://localhost:8181/petCafePrj/boardlist.do">목록으로</a>

<c:if test="${sessionScope.session_id eq board.writer }">
<form action="http://localhost:8181/petCafePrj/boardDelete.do" method="post">
<input type="hidden" value="${board.writer }" name="writer"/>
<input type="hidden" value="${board.board_num }" name="board_num"/> 
<input type="submit" value="삭제하기"/><br/>
</form>
<form action="http://localhost:8181/petCafePrj/boardUpdateForm.do" method="post">
<input type="hidden" value="${board.writer }" name="writer"/>
<input type="hidden" value="${board.board_num }" name="board_num"/>
<input type="submit" value="수정하기"/>
</form>
</c:if>
=======


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

.section1{width: 100%; max-width: 1200px; margin: 0 auto; 
margin-top: 30px;
text-align: center;}

.section1 > h1 {font-size: 30px;color: #333;}

.section1 .form_Box{margin-top: 30px;}
.section1 input[type="text"],
.section1 input[type="hiddne"],
.section1 input[type="submit"],
.section1 textarea{border: 1px solid #f19292;
border-radius: 5px;
padding: 5px;
color: #333;
margin-bottom: 10px;
outline:none;}

.section1 textarea{margin-bottom: 0;}

.section1 input[type="submit"]{width: 160px;background-color: #fff;transition: 0.3s;}
.section1 .form_Box a{text-decoration: none;
display: block;
border: 1px solid #f19292;
width: 160px;
margin: 0 auto;
padding: 5px;
background-color: #fff;
border-radius: 5px;
margin-top:10px;
margin-bottom: 10px;
color: #333;
transition: 0.3s;
}


/* 세션 버튼 hover */

.section1 input[type="submit"]:hover{background-color: #f19292; color: #fff;}
.section1 .form_Box a:hover{background-color: #f19292; color: #fff;}



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



<!-- 세션 -->
<section class="section section1">

  <h1>${board.board_num}번 글 상세페이지</h1>
  <div class="form_Box">
  글제목:<input type="text" value="${board.title }" readonly>
  글쓴이:<input type="text" value="${board.writer }" readonly>
  조회수:${board.hit }<br/>
  날짜:<input type="text" value="${board.bdate }" readonly>
  마지막 수정날짜:${board.mdate }<br/>
  본문:<textarea rows="15" cols="50" readonly>${board.content }</textarea><br/>
  <a href="http://localhost:8181/petCafePrj/boardlist.do">목록으로</a>
  

  <c:if test="${sessionScope.session_id eq board.writer }">
  <form action="http://localhost:8181/petCafePrj/boardDelete.do" method="post">
  <input type="hidden" value="${board.writer }" name="writer"/>
  <input type="hidden" value="${board.board_num }" name="board_num"/> 
  <input type="submit" value="삭제하기"/><br/>
  </form>
  <form action="http://localhost:8181/petCafePrj/boardUpdateForm.do" method="post">
  <input type="hidden" value="${board.writer }" name="writer"/>
  <input type="hidden" value="${board.board_num }" name="board_num"/>
  <input type="submit" value="수정하기"/>
  </form>
  </c:if>
</div>
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


>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
</body>
</html>