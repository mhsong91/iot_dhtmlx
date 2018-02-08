<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body >
<h1>입사원관리^^</h1>
<form:form commandName="empDTO" action="${root}/emp/insert" method="get">
이름 : <input  type="text" name="empName" id="empName" value="${empDTO.empName}"><br>
월급 : <input   type="text" name="empSal" id="empSal" value="${empDTO.empSal}"><br>
<button class="ghost-button" target="_blank">사원정보 추가</button>

</form:form>

</body>
</html>