<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="/WEB-INF/views/emp/view.jsp" flush="true"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxLRM0JmtjmWKwZZ3KIhA2NQGzo4bROc00ontiDPg4sDy7NC1ukA">
<form action="${root}/emp/update" method="get" >

upate사원이름<input name="upname" type="text" >
upate 월급<input name="upsal" type="text" >
upate 사번<input name="upno" type="text" >
<button  >수정하려는 사원입력하세요</button>
</form>
</body>
</html>