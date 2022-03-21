<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8181/petcafeprj/updatepetlost.do" method="post">
        <input type="hidden" name="adopt_num" value="${adopt.adopt_num }">
        품종 <input type="text" name="kind" value="${adopt.adopt_kind}"><br/>
        이름 <input type="text" name="name" value="${adopt.adopt_name}"><br/>
        나이 <input type="text" name="age" value="${adopt.adopt_name}"><br/>
        성별 <input type="checkbox" name="gender" value="${adopt.adopt_name}"><br/>
        가격 <input type="text" name="price" value="${adopt.adopt_price}"><br/>
        전화번호 <input type="text" name="phone" value="${adopt.adopt_phone}"><br/>
        <input type="submit" value="수정완료">
        <input type="reset" value="초기화">
     </form>
</body>
</html>