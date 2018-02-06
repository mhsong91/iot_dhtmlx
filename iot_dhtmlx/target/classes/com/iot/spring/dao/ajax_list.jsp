<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script >
	var au= new AjaxUtil("${root}/emp/lista",null,"GET","json");
	
	function callback(res){
		$("#empTable").bootstrapTable({
			data:res
		});
		/*var htmlStr="";
		for(var emp of res){
			htmlStr +="<tr>";
			for(var key in emp){
				htmlStr +="<td>"+emp[key]+"</td>";
			}
			htmlStr +="</tr>";
			$("#tbody").html(htmlStr);
		}*/
	}
	au.setCallbackSuccess(callback);
	au.send();
	
	
</script>


<body>
<div class="container">
<table data-toggle="table" id="empTable">
<thead>
<tr>
	<th data-field="empNo">사번</th>
<th data-field="empName">이름</th>
<th data-field="empSal">월급</th>
</tr>
</thead>
<tbody id="tbody">
</tbody>


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