<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- 부트스트랩 주소 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<!--  bootstrap.css -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- bootstrap.js -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

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
  display: flex;}
  
  /* 헤더 메뉴 hover */
  
  .header .menu-li:hover a{color:#484848;}
  
  
  /* 세션1 */

  .section1 {width:1200px;
  margin: 0 auto;}
  
  .section1 .title{font-size: 30px;
  font-weight:500;
  color: 333;;}
  
  /* .section1 .container{}
  .section1 .search_Box{} */
  .section1 .search_Box .search_List{
  display: flex;justify-content: center;align-items: center;}
  
  .search_Box .search_List .last{display: flex;
  margin-left: 20px;}
  
  .section1 .input:focus{outline: none;}
  #search_Gcd{margin-right: 20px;}
  
  .section1 input[type=date]:focus{outline: none;}
  
  .section1 input[type=submit]{width:100px;
  background-color: #f19292;
  border: transparent;
  border-radius: 20px;
  color: white;}
  
  
  ul{padding-left: 0;}
  
  
 
  
  .section1 .page_Box{
    display: flex;justify-content: center;align-items: center;}



  .section1 .pagination{display: flex;} 
  .section1 .pagination .page-item {margin-left: 10px;
  background-color: #484848;
  border-radius: 5px;  padding:3px;
  border: 1px solid #f19292;
  background-color: #fff;
transition: 0.3s;}

    .section1 .pagination .page-item > a{
      height: 30px;
      font-size: 16px;
      background-color: transparent;border: none;color: #333;display: block; width: 100%;}

    .section1 .pagination .page-item:hover a{text-decoration: none;}


  .section1 .write_button{
    border: 1px solid #f19292;
    display: flex;justify-content: center;align-items: center;
    width: 160px;
    height: 35px;
    border-radius: 5px;
    background-color: #fff;
    color: #333;
    transition: 0.3s;}

  .section1 .write_button > a{color: #333; display: block;width: 100%; text-decoration: none;
text-align: center;}

  /* 세션 hover */

  .section1 .write_button:hover{background-color: #f19292;}
  .section1 .write_button:hover a{color: #fff;}

  .section1 .pagination .page-item:hover {background-color: #f19292;}
  .section1 .pagination .page-item:hover a {color: #fff;}


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
    </header>

    <!-- 세션1 / contents시작
       *지우지 마세요 -->

  <section class="scetion section1">
    <p class="title">착한 분양</p>

    <table class="table table-hover">
      <thead>
         <tr>
           <th>글번호</th>
           <th>이름</th>		  
           </tr>
        </thead>
        <tbody>
          <c:forEach var="adoptList" items="${adoptList}">
           <tr>
             <td>${adoptList.adopt_num}</td>
             <td><a href="http://localhost:8181/petCafePrj/adoptdetail.do?adopt_num=${adoptList.adopt_num }">${adoptList.adopt_name }</a></td>
           </tr>
         </c:forEach>
        </tbody>
     </table>
     <c:if test="${not empty sId}">
     <ul>  
    <li class="write_button"><a href="http://localhost:8181/petCafePrj/adoptInsertForm.do">글쓰기</a></li>
    </ul>
  </c:if>

  <nav class="page_Box">
	  <ul class="pagination">
		<c:if test="${dto.startPage ne 1}">
			<li class="page-item">
	    		<a class="page-link" href="adoptlist.do?pageNum=${dto.startPage-10 }">이전</a>
	    	</li>
	    </c:if>
	    <c:forEach var="pageIndex" begin="${dto.startPage }" end="${dto.endPage }">
		    <li class="page-item ${dto.currentPage eq pageIndex ? 'active' : ''}">
		    	<a class="page-link" href="adoptlist.do?pageNum=${pageIndex }">${pageIndex }</a>
		    </li>
	    </c:forEach>
	    <c:if test="${dto.totalPages > dto.endPage }">
		    <li class="page-item">
		     	<a class="page-link" href="adoptlist.do?pageNum=${dto.endPage+1 }">다음</a>
	    	</li>
	    </c:if>
	  </ul>
	</nav>
  </section>
  

	
</body>
</html>