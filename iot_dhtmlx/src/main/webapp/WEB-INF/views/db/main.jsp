<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
    html, body {
        width: 100%;      /*provides the correct work of a full-screen layout*/ 
        height: 100%;     /*provides the correct work of a full-screen layout*/
        overflow: hidden; /*hides the default body's space*/
        margin: 0px;      /*hides the body's scrolls*/
    }      
    div.controls {
         margin: 0px 10px;
         font-size: 14px;
         font-family: Tahoma;
         color: #404040;
         height: 80px;
      }
</style>
<script >
var bodyLatout;
dhtmlxEvent(window,"load",function(){
	bodyLatout=new dhtmlXLayoutObject(document.body,"3L");
	bodyLatout.cells("a").setWidth(300);
	bodyLatout.cells("a").setText("Connection Info List");
	bodyLatout.cells("b").setWidth(900);
	bodyLatout.cells("b").setText("MySql");
	
	
})




</script>
<body>

</body>
</html>