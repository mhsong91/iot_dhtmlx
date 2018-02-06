<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="gridbox" style="with:410px;height:700px;"></div>
<script >
	var mygrid = new dhtmlXGridObject('gridbox'); 
	mygrid.setImagePath("${dpath}/imgs/");
	mygrid.setHeader("사번,이름,월급");
	mygrid.setInitWidths("50,148,200");
	mygrid.setColAlign("left,left,left");
	mygrid.setColTypes("ro,ed,ed");
	mygrid.setColSorting("int,str,int");
	mygrid.setColumnIds("empNo,empName,empSal");
	mygrid.init();
	
	var au = new AjaxUtil("${root}/emp/lista", null, "GET", "json");
	function callback(res){
		mygrid.parse({data:res.empList},"js");
	}
	au.setCallbackSuccess(callback);
	au.send();

</script>

</body>
</html>