<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
	        <td>${adoptList.adopt_num}<td/>
	        <td><a href="http://localhost:8181/petCafePrj/adoptInsertForm.do?adopt_num=${adoptList.adopt_num }">${adoptList.adopt_name }</a><td/>
	      </tr>
	    </c:forEach>
     </tbody>
	</table>
	<form action="http://localhost:8181/petCafePrj/adoptInsertForm.do">
	<input type="submit" value="글쓰기">
	</form>
</body>
</html>