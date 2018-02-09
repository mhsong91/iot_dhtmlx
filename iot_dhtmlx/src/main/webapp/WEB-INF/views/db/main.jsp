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
var bodyLayout,bLay, aLay,dbTree;
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
   //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
   bLay = bodyLayout.cells("b");
   bLay.setWidth(750);
   bLay.setText("deleteUser");
   b=bLay.attachForm(formObj,true);
	b.attachEvent("onButtonClick",function(id){//이동시킨다
	    if(id=="savedel"){
	    	if(b.validate()){
	    		b.send("${root}/user/delete","post",callbackdel);//callback function임//이것들을 루트로 보냄
	    					
	    	   	}
	    }else if(id=="canceldel"){
	       b.clear();
	    }
	    
	 })
	 //bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
	cLay = bodyLayout.cells("c");
   cLay.setWidth(750);
   cLay.setText("updateUser"); 
	c=cLay.attachForm(formObj2,true);
	c.attachEvent("onButtonClick",function(id){//이동시킨다
	    if(id=="saveup"){
	    	if(c.validate()){
	    		c.send("${root}/user/update","post",callbackup);//callback function임//이것들을 루트로 보냄
	    					
	    	   	}
	    }else if(id=="cancelup"){
	       c.clear();
	    }
	    
	 })
   
})
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
 var formObj = [{type:"settings",offsetTop:12,name:"삭제 번호",lableAlign:"left"},
            {type:"input",name:"uiNo",label:"삭제번호",required:true},
            {type:"block", blockOffset: 0, list:[
            {type:"button",name:"savedel",value:"삭제"},
            {type:"newcolumn"},
            {type:"button",name:"canceldel",value:"취소"}
            ]}
       ];
function callbackdel(loader,res){

	   var res=JSON.parse(res);
	   alert(res.msg);
}

//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
var formObj2 = [{type:"settings",offsetTop:12,name:"업데이트",lableAlign:"left"},
    {type:"input",name:"uiName",label:"이름",required:true},
    {type:"input",name:"uiId",label:"아이디",required:true},
    {type:"password",name:"uiPwd",label:"비밀번호",required:true},
    {type:"input",name:"uiEmail",label:"이메일",required:true},
    {type:"input",name:"admin",label:"보통은0,프리미엄 유저가 되려면 1",required:true},
    {type:"input",name:"uiNo",label:"수정하려는 번호",required:true},
    {type:"block", blockOffset: 0, list:[
       {type:"button",name:"saveup",value:"수정"},
       {type:"newcolumn"},
       {type:"button",name:"cancelup",value:"취소"}
    ]}
];
function callbackup(loader,res){

	   var res=JSON.parse(res);
	   alert(res.msg);
}
</script>
<body>

</body>
</html>