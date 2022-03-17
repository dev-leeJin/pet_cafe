<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   ${petlost }
   <table class="table table-hover">
	 <thead>
		  <tr>
			  <th>글번호</th>
			  <th>유기견 이름</th>		  
	      </tr>
     </thead>
     <tbody>
       <c:forEach var="petlost" items="${petlost }">
	      <tr>
	        <td>${petlost.lost_num }<td/>
	        <td><a href="http://localhost:8181/petCafePrj/detailpetlost?lost_num=${petlost.lost_num }">${petlost.lost_name }</a><td/>
	      </tr>
	    </c:forEach>
     </tbody>
	</table>
	<form action="http://localhost:8181/petCafePrj/insertpetlostform">
	<input type="submit" value="글쓰기">
	</form>
</body>
</html>
</body>
</html>