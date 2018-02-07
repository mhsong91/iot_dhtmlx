<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<form action="${root}/emp/update" method="get" >

upate사원이름<input size="7" style="font-size:24pt;height:42px;border:0 " name="upname" type="text" >
upate 월급<input size="7" style="font-size:24pt;height:42px;border:0 " name="upsal" type="text" >
upate 사번<input size="7" style="font-size:24pt;height:42px;border:0 " name="upno" type="text" >
<button class="ghost-button" target="_blank" >수정하려는 사원입력하세요</button>
</form>
</body>
</html>