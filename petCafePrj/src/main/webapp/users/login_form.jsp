
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head> 
<!-- ๋ถ?ธ์ค?ธ๋ฉ ์ฃผ์ -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- font -->
<link rel="preconnect" href="https://fonts.googleapis.com/%22%3E">
<link rel="preconnect" href="https://fonts.gstatic.com/" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
    

<title>pet</title>
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

/* ?ค๋ ??*/
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

/* ๋ฒํผ hover */
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

/* ?ค๋ ๋ฉ๋ด hover */

.header .menu-li:hover a{color:#484848;}


/* ?ธ์ 1 */
 .section1 .content{
 border: 1px solid red;
 margin-left: 200px;
 margin-top : 100px;
 width:1200px;
 max-width:100%; 
 margin:0 auto;
 display: flex;
 }
 

.section1 .today_Box{border: 1px solid red;}
.section1 .today{padding-left: 0;border: 2px solid orange;
padding: 10px;}
.section1 .join_Box{
text-align: center;}

.section1 .join_Box .join_Button{width: 150px;
border-radius: 15px;
padding:10px;background-color: white;
border: none;;
background: #f19292;
color: white;
font-weight:500;
letter-spacing: 1px;}

.section1 .join_Box .join_Button:focus{outline: transparent;}




.section1  .content .container{
width: 800px;
display:grid;
grid-template-columns:1fr 1fr;
grid-gap:20px;
margin-top:70px;}
.section1 .container .item{border: 5px solid green;}
.section1 .container .item img{width:100%;}





.footer address{
 text-align: center;}

</style>
</head>

<body>
  <!-- ?ค๋ -->
    <header class="header">
      <div class="container">
      <h1 class="logo"><a href ="#"><img src="img/logo.png"></a></h1>

      <div class="login_Box">
      <form action="http://loaclhost:8181/petCafePrj/loginCheck"  class="form-group form-inline" method="post">
         <input type="text" class="form-control" name="id" placeholder="?์ด??>
         <input type="password" class="form-control" name="pw" placeholder="๋น๋?๋ฒํธ">
        <input type="submit" class="btn btn-outline-primary" value="๋ก๊ทธ??>
   
        </form>
      </div>
    </div>

    <ul class="menu">
      <li class="menu-li"><a href="#">? ๊ฒฌ์ฝํ?คํธ</a></li>
      <li class="menu-li"><a href="#">? ๊ฒฌ ๋ถ์</a></li>
      <li class="menu-li"><a href="#">? ๊ธฐ๊ฒฌ๊ฒ?ํ</a></li>
      <li class="menu-li"><a href="#">?์ ๊ฒ์??/a></li>
    </ul>
    </header>

    <section class="section section1">
    <div class="content">

      <!-- ?์ฒด๊ธ,?ค๋๊ฒ์๋ฌ???-->
      <div class="today_Box">
        <ul class="today">
          <li>?์ฒด๊ธ / ?ค๋๊ฒ์๋ฌ?/li>
          <li>๋ฐฉ๋ฌธ?์ / ?์ฒด</li>
          <li>?๊ฐ</li>
        </ul>

        <div class="join_Box">
          <form>
            <input type="submit" value="?์๊ฐ?ํ๊ธ? class="join_Button">
          </form>
        </div>
    </div>

        <!-- ์ปจํ์ธ? -->
        <body>
          <form action="http://loaclhost:8181/petCafePrj/loginCheck"  class="form-group row" method="post">
          <div class="col-lg-2">
           <input type="text" class="form-control" name="id" placeholder="?์ด??><br/>
           <input type="password" class="form-control" name="pw" placeholder="๋น๋?๋ฒํธ"><br/>	
          </div>
          <div class="cel-lg-1">
          <input type="submit" class="btn btn-outline-primary" value="๋ก๊ทธ??>
          <input type="submit" class="btn btn-outline-primary" value="?์๊ฐ??>
          </div>
          </form>
        </body>

    


       
  </section>
    <hr>
<!-- ?ธํฐ -->
    <footer class="footer">
    <div class="contaier">
      <address>

             ?์ธ?น๋ณ??๋งํฌ๊ต??ํ๋ก?์ฒจ๋จ๋น๋ฉ 7์ธ?br>
            ?ฐ๋ฝ์ฒ?: 02-0202-0202<br>
                COPYRIGHT &copy; ICT?ธ์ฌ๊ฐ๋ฐ??All Rights Reserved

    </address>
  </div>
  </footer>


</body>
</html>