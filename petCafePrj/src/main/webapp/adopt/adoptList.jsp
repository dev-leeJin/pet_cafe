<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
	        <td><a href="http://localhost:8181/petCafePrj/adoptdetail.do?adopt_num=${adoptList.adopt_num }">${adoptList.adopt_name }</a><td/>
	      </tr>
	    </c:forEach>
     </tbody>
	</table>
	<c:if test="${not empty sId}">
		<a href="http://localhost:8181/petCafePrj/adoptInsertForm.do">글쓰기</a>
	</c:if>
	
	<nav aria-label="Page navigatione">
	  <ul class="pagination justify-content-center">
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
	
</body>
</html>