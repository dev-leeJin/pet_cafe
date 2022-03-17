<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html lang="en">
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

<!-- 제이쿼리 -->
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

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
  

  .black_Bg{
    background-color:rgba(0,0,0,0.4);
    width: 100%;
    height: 100vh;
    position: fixed;
    z-index: 9;
    display: none;}

  .popup_box{display:none;}
  
  .pop_Up{
  position: fixed;
  z-index: 10;
  width: 100%;
  height: 100vh;
  z-index: 10;
  display: flex;justify-content: center;align-items: center;}
  

  
  .pop_Up .container{
  width: 800px;height:500px;
  width: 0 auto;
  display: flex;justify-content: center;align-items: center;
  }
  
  .pop_Up .x_Btn{
  width:60px;height:60px;
  position: absolute;right:10px;top:10px;
  ;}
  
  .pop_Up .x_Btn .bar{width:60px; height: 8px;
  display: block;
  background-color: #f19292;
  transform-origin: center;
  transition: 0.5s;
  cursor: pointer;}
  
  .pop_Up .x_Btn .bar:nth-child(1){transform: translate(0px,25px)rotate(45deg);}
  .pop_Up .x_Btn .bar:nth-child(2){transform: translate(0px,16px)rotate(-45deg);}
  
  .pop_Up .container{
  background-color:#ffffff;
  }
  .pop_Up .box{
  width: 600px;
  margin: 0 auto;
  display: flex;justify-content:space-between;align-items: center;
  padding: 30px;

  position: absolute;}
  
  .pop_Up .txt{
  width: 100%;
padding: 10px;}

  .pop_Up .photo{width:350px;}
  .pop_Up .photo img{width: 100%;}
  
  /* x_Btn hover */
  .pop_Up .x_Btn:hover .bar{background-color: #484848;}
  
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
  
  
  /* 표 */
  
  .boardlist{
  display: flex;justify-content: center; align-items: center;}
  
  .boardlist .list{
  display:grid;
  grid-template-columns:1fr 1fr;
  grid-template-rows: auto;
  grid-gap: 50px;}
  
  .boardlist .item{
  display: flex;justify-content: space-between;
  width: 450px;}
  
  .boardlist img{width: 100%;}
  .boardlist .photo_Btn{width:260px;}
  
  .boardlist .more_Btn{}
  
  .boardlist .more_Btn p{
  text-align: center;
  font-size: 15px;
  font-weight: 600;
  padding:15px;
  margin-top: 10px;
  background-color: #f19292;
  border-radius:10px;
  cursor: pointer;;
  
  }
  
  .boardlist .more_Btn>p>a{color:#ffffff;
  text-decoration: none;
  transition: 0.5s;}
  
  .boardlist .txt{
  padding: 10px;
  text-align: center;
  }
  
  .section1 .txt dl{display: flex;align-items: center;;}
  .section1 .txt dl span{margin-left:28px;}
  .section1 .txt dt{border: 1px solid #f19292;
  color:#f19292;
  padding: 5px;}
  
  .txt dd{
  margin-bottom: 0;
  margin-left: 5px;}
  
  
  .section1 .page_Box{
    display: flex;justify-content: center;align-items: center;}
  
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
  
  
  /* more_Btn hover */
  .boardlist .more_Btn:hover p a{
  color: #484848;
  }
  
  /* 푸터 */
  .footer address{
  text-align: center;}  


</style> 
</head>

<body>

<!-- 팝업 -->
<div class="black_Bg"></div>
<div class="popup_box">
<div class="pop_Up">
  
  
  <div class="container">
    <div class="x_Btn">
      <span class="bar"></span>
      <span class="bar"></span>
    </div>

<div class="box box1">
    <div class="photo">
      <img src="img/hodoo.jpg">
    </div>
  <div class="contant">
    <div class="txt">
      <dl>
          <dt>공고번호</dt>
          <dd>2022-00101</dd>
      </dl>
      <dl>
          <dt>성별</dt>
          <dd>수컷</dd>
      </dl>
      <dl>
          <dt>접수일자</dt>
          <dd>2022.03.14</dd>
      </dl>
      <dl>
          <dt>상<span>태</span></dt>
          <dd>보호중</dd>
      </dl>

      <dl>
          <dt>발생장소</dt>
          <dd>인천광역시</dd>
      </dl>


    </div>

    </div>

    </div>
<div class="box box2">
    <div class="photo">
      <img src="img/hodoo.jpg">
    </div>
  <div class="contant">
    <div class="txt">
      <dl>
          <dt>공고번호</dt>
          <dd>2022-00102</dd>
      </dl>
      <dl>
          <dt>성별</dt>
          <dd>수컷</dd>
      </dl>
      <dl>
          <dt>접수일자</dt>
          <dd>2022.03.15</dd>
      </dl>
      <dl>
          <dt>상<span>태</span></dt>
          <dd>보호중</dd>
      </dl>

      <dl>
          <dt>발생장소</dt>
          <dd>인천광역시</dd>
      </dl>


    </div>

    </div>

    </div>
<div class="box box3">
    <div class="photo">
      <img src="img/hodoo.jpg">
    </div>
  <div class="contant">
    <div class="txt">
      <dl>
          <dt>공고번호</dt>
          <dd>2022-00103</dd>
      </dl>
      <dl>
          <dt>성별</dt>
          <dd>수컷</dd>
      </dl>
      <dl>
          <dt>접수일자</dt>
          <dd>2022.03.16</dd>
      </dl>
      <dl>
          <dt>상<span>태</span></dt>
          <dd>보호중</dd>
      </dl>

      <dl>
          <dt>발생장소</dt>
          <dd>인천광역시</dd>
      </dl>


    </div>

    </div>

    </div>
<div class="box box4">
    <div class="photo">
      <img src="img/hodoo.jpg">
    </div>
  <div class="contant">
    <div class="txt">
      <dl>
          <dt>공고번호</dt>
          <dd>2022-00104</dd>
      </dl>
      <dl>
          <dt>성별</dt>
          <dd>수컷</dd>
      </dl>
      <dl>
          <dt>접수일자</dt>
          <dd>2022.03.17</dd>
      </dl>
      <dl>
          <dt>상<span>태</span></dt>
          <dd>보호중</dd>
      </dl>

      <dl>
          <dt>발생장소</dt>
          <dd>인천광역시</dd>
      </dl>


    </div>

    </div>

    </div>
  </div>
</div>

</div>



  <!-- 헤더 -->
    <header class="header">
      <div class="container">
      <h1 class="logo"><a href ="#"><img src="img/logo.png"></a></h1>

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

  <section class="scetion section1">
    <p class="title">보호중 동물</p>
    <hr>

    <div class="container">
      <form class="search_Box">
        <ul class="search_List">
          <li class="first">

            <dl>
              <dt>
                <label for="seach_Date">날짜</label>
              </dt>
              <dd>
              <input type="date" name="search_Date" id="search_Date" title="시작일">~
              <input type="date" name="seach_Date" id="search_Date" title="마감일" class="input_Date">
            </dd>
            </dl>
          </li>

          <li class="last">

            <dl>
              <dt>
                <label for="search_Cd">시도</label>
              </dt>
            <dd>
              <select name="search_Cd" id="search_Cd" title="시도선택">
                <option>전체</option>
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
            </dd>
            </dl>

            <dl>
              <dt>
                <label for="search_Gcd">시군구</label>
              </dt>
            <dd>
              <select name="search_Gcd" id="search_Gcd" title="시군구선택">
                <option>전체</option>
              </select>
              <input type="submit" value="조회">
            </dd>
          </li>
        </ul>
      </form>
    </div>
   
    <div class = "boardlist">
      <ul class = "list">
              <li class = "item item1">
                <div class="photo_Btn">
                  <div class =" thumbnail">
                      <img src="img/lostpet.jpg">
                  </div>
                    
                  <div class="more_Btn">
                  <p><a href="#moreBtn" class="more_Btn" title="인천 자세히 보기">자세히보기</a>
                  </p>
                  </div>
                </div>

                      <div class="txt">
                          <dl>
                              <dt>공고번호</dt>
                              <dd>2022-00101</dd>
                          </dl>
                          <dl>
                              <dt>접수일자</dt>
                              <dd>2022-03-14</dd>
                          </dl>
                          <dl>
                              <dt>특<span>징</span></dt>
                              <dd>눈이 갈색</dd>
                          </dl>
                          <dl>
                              <dt>상<span>태</span></dt>
                              <dd>보호중</dd>
                          </dl>
  
  
                      </div>
                    </li>
              <li class = "item item2">
                <div class="photo_Btn">
                  <div class =" thumbnail">
                      <img src="img/lostpet.jpg">
                  </div>
                    
                  <div class="more_Btn">
                  <p><a href="#moreBtn" class="more_Btn" title="인천 자세히 보기">자세히보기</a>
                  </p>
                  </div>
                </div>

                      <div class="txt">
                          <dl>
                              <dt>공고번호</dt>
                              <dd>2022-00102</dd>
                          </dl>
                          <dl>
                              <dt>접수일자</dt>
                              <dd>2022-03-15</dd>
                          </dl>
                          <dl>
                              <dt>특<span>징</span></dt>
                              <dd>중성화</dd>
                          </dl>
                          <dl>
                              <dt>상<span>태</span></dt>
                              <dd>보호중</dd>
                          </dl>
  
  
                      </div>
                    </li>
              <li class = "item item3">
                <div class="photo_Btn">
                  <div class =" thumbnail">
                      <img src="img/lostpet.jpg">
                  </div>
                    
                  <div class="more_Btn">
                  <p><a href="#moreBtn" class="more_Btn" title="인천 자세히 보기">자세히보기</a>
                  </p>
                  </div>
                </div>

                      <div class="txt">
                          <dl>
                              <dt>공고번호</dt>
                              <dd>2022-00103</dd>
                          </dl>
                          <dl>
                              <dt>접수일자</dt>
                              <dd>2022-03-16</dd>
                          </dl>
                          <dl>
                              <dt>특<span>징</span></dt>
                              <dd>다리수술함</dd>
                          </dl>
                          <dl>
                              <dt>상<span>태</span></dt>
                              <dd>보호중</dd>
                          </dl>
  
  
                      </div>
                    </li>
              <li class = "item item4">
                <div class="photo_Btn">
                  <div class =" thumbnail">
                      <img src="img/lostpet.jpg">
                  </div>
                    
                  <div class="more_Btn">
                  <p><a href="#moreBtn" class="more_Btn" title="인천 자세히 보기">자세히보기</a>
                  </p>
                  </div>
                </div>

                      <div class="txt">
                          <dl>
                              <dt>공고번호</dt>
                              <dd>2022-00104</dd>
                          </dl>
                          <dl>
                              <dt>접수일자</dt>
                              <dd>2022-03-17</dd>
                          </dl>
                          <dl>
                              <dt>특<span>징</span></dt>
                              <dd>코갈색</dd>
                          </dl>
                          <dl>
                              <dt>상<span>태</span></dt>
                              <dd>보호중</dd>
                          </dl>
  
  
                      </div>
                    </li>
        </ul>
  </div>
                    <nav class="page_Box">
                      <ul class="pagination">
                        <li>
                          <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                          <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                          </a>
                        </li>
                      </ul>
                    </nav>



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


<script>
  // 자세히보기 클릭했을때
  //아이템1 ~4번 순
  $(".section1 .item1 .more_Btn").click(function(){
    $(".popup_box").stop().show();
    $(".box1").stop().show()
    $(".box2").stop().hide()
    $(".box3").stop().hide()
    $(".box4").stop().hide()
    $(".black_Bg").stop().show();
  })


  $(".section1 .item2 .more_Btn").click(function(){
    $(".popup_box").stop().show();
    $(".box1").stop().hide()
    $(".box2").stop().show()
    $(".box3").stop().hide()
    $(".box4").stop().hide()
    $(".black_Bg").stop().show();
  })


  $(".section1 .item3 .more_Btn").click(function(){
    $(".popup_box").stop().show();
    $(".box1").stop().hide()
    $(".box2").stop().hide()
    $(".box3").stop().show()
    $(".box4").stop().hide()
    $(".black_Bg").stop().show();
  })


  $(".section1 .item4 .more_Btn").click(function(){
    $(".popup_box").stop().show();
    $(".box1").stop().hide()
    $(".box2").stop().hide()
    $(".box3").stop().hide()
    $(".box4").stop().show()
    $(".black_Bg").stop().show();
  })

  $(".x_Btn").click(function(){
    $(".popup_box").stop().hide();
    $(".black_Bg").stop().hide();
  })
</script>