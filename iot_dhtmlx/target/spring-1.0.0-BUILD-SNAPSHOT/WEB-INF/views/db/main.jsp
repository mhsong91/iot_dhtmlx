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
<script>
var bodyLayout, aLay,dbTree;
function callback(res){

   dbTree = aLay.attachTreeView({
       items: res.dbList
   });
   dbTree.setImagePath("${rPath}/dx/skins/web/imgs/dhxtree_web/");
   dbTree.enableDragAndDrop(true);
}
dhtmlxEvent(window,"load",function(){
   bodyLayout = new dhtmlXLayoutObject(document.body,"3L");
   aLay = bodyLayout.cells("a");
   aLay.setWidth(300);
   aLay.setText("Connection Info List");
   var aToolbar = aLay.attachToolbar();
   aToolbar.addButton("adddb",1,"add Connector");
   aToolbar.addButton("condb",2,"Connection");
   aToolbar.attachEvent("onClick",function(id){
      alert(id);
   })
   var au = new AjaxUtil("${root}/connection/db_list",null,"get");
   au.setCallbackSuccess(callback);
   au.send(); 
})
</script>
<body>

</body>
</html>