
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
  list-style: none;
  }
  
  
  
  body{
  background:#fffaed;}
  
 
  
  /* 헤더 */
  .header{
  
  width: 1200px;
  margin: 0 auto;
  }
  
  .header .logo{
  padding: 5px;}
  
  .header .logo img{width: 100%;}
  
  .header .container{display: flex;justify-content:space-between;align-items: center;}
  
  /* .header .login_Box{border: 2px solid orange;} */
  
  .header .login_Box .form-group{display: flex;align-items: center;
  margin-bottom: 0%;}
  
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
  border:1px solid #f19292;
color: #fff;}
  
  
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
  display: flex;}
  
  /* 헤더 메뉴 hover */
  
  .header .menu-li:hover a{color:#484848;}
  
  
  /* 세션1 */
  .section1 {width:1200px;
  margin: 0 auto;}
  
  .section1 .title{font-size: 30px;
  font-weight:500;
  color: 333;;}

  .section1 .search_Box .search_List{
  display: flex;justify-content: center;align-items: center;}
  
  .search_Box .search_List .last{display: flex; align-items: center;
  margin-left: 20px;}
  
  .section1 .input:focus{outline: none;}
  #search_Gcd{margin-right: 20px;}
  
  .section1 input[type=date]:focus{outline: none;}
  
  .section1 input[type=submit]{width:130px;
  background-color: #fff;
  border: 1px solid #f19292;
  border-radius: 5px;
  padding: 5px;
  color: #333;
  margin-top:13px;
  margin-left: 10px;
transition: 0.3s;}
  
  
  ul{padding-left: 0;}
  
  
  
  .pagination>.active>a,
  .pagination>.active>a:focus,
  .pagination>.active>a:hover,
  .pagination>.active>span,
  .pagination>.active>span:focus,
  .pagination>.active>span:hover{
  background-color: #f19292!important;
  border-color: #f19292!important;
  color: #ffffff!important;}
  
  .pagination>li>a,
  .pagination>li>span{color: #484848!important;}
  
  .pagination{display: flex;justify-content: center; align-items: center;}

  .page-link{color:#333;
  border: 1px solid #f19292;
  padding:10px;
  margin-left: 5px;}

  /* section hover */
  .section1 input[type=submit]:hover{background-color: #f19292; color: #fff;}

  .page-link:hover{background-color: #f19292; color: #fff;
  text-decoration: none;}
  
       /* 푸터 */
.footer{width: 100%;max-width:1200px;
margin: 0 auto;}   
.footer address{
text-align: center;
color: #333;
}  

</style> 
</head>

<body>
 


  <!-- 헤더 -->
    <header class="header">
      <div class="container">
      <h1 class="logo"><a href ="/petCafePrj/"><img src="img/logo.png"></a></h1>

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

  <section class="scetion section1">
    <p class="title">보호중 동물</p>

    <div class="container">
      <form class="search_Box" action="http://localhost:8181/petCafePrj/" method="post">
        <ul class="search_List">
          <li class="first">

            <dl>
              <dt>
              </dt>
            </dl>
          </li>
        </ul>
      </form>
    </div>

    <table class="table table-hover">
      <thead>
        <tr>
          <th>글번호</th>
          <th>글쓴이</th>
          <th>유기견 이름</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="petlost" items="${petlost }">
          <tr>
            <td>${petlost.lost_num }</td>
            <td>${sessionScope.session_id }</td>
            <td><a href="http://localhost:8181/petCafePrj/detailpetlost.do?lost_num=${petlost.lost_num }">${petlost.lost_name }</a></td>										
          </tr>
        </c:forEach>
      </tbody>
    </table>
    
    <c:if test="${sessionScope.session_id ne null }">
      <form action="http://localhost:8181/petCafePrj/insertpetlostform.do">
      <input type="submit" value="글쓰기">
      </form>
    </c:if>
    
      
      
      <nav aria-label="Page navigation">
          <ul class="pagination justify-content-center">
          <c:if test="${dto.startPage ne 1}">
            <li class="page-item">
                <a class="page-link" href="petlostlist.do?pageNum=${dto.startPage-10 }">이전</a>
              </li>
            </c:if>
              <c:forEach var="pageIndex" begin="${dto.startPage }" end="${dto.endPage }">
                <li class="page-item ${dto.currentPage eq pageIndex ? 'active' : ''}">
                  <a class="page-link" href="petlostlist.do?pageNum=${pageIndex }">${pageIndex }</a>
                </li>
              </c:forEach>
            <c:if test="${dto.totalPages > dto.endPage }">
                <li class="page-item">
                    <a class="page-link" href="petlostlist.do?pageNum=${dto.endPage+1 }">다음</a>
                </li>
            </c:if>
          </ul>
        </nav>	

  </section>
 
 <!-- 푸터 -->

 <footer class="footer">
  <hr>
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


