<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body >
<div class="container">
<table border="1" class="table table-bordered">
<tr>
<th>사번</th>
<th>이름</th>
<th>월급</th>
</tr>


<c:forEach items="${empList}" var="emp">
<tr>
	<td>${emp.empNo}</td>
	<td>${emp.empName}</td>
	<td>${emp.empSal}</td>
</tr>
</c:forEach>

</table>

</div>


</body>
</html>