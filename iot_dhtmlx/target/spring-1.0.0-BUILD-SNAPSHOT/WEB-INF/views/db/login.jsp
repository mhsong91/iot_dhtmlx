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


var bodyLatout, aLay, bLay ;
var a,b;
dhtmlxEvent(window,"load",function(){//이벤트를 주기위해 사용한다
   bodyLatout=new dhtmlXLayoutObject(document.body,"2U");
   //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
   aLay=bodyLatout.cells("a")
   aLay.setWidth(700);
   aLay.setText("SingIn");
   a=aLay.attachForm(formObj,true);
   a.attachEvent("onButtonClick",function(id){//이동시킨다
	    if(id=="saveUi"){
	    	if(a.validate()){
	    		a.send("${root}/user/insert","post",callbackui);//callback function임//이것들을 루트로 보냄
	    					
	    	   	}
	    }else if(id=="cancelUi"){
	       a.clear();
	    }
	    
	 })
   //bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
   bLay=bodyLatout.cells("b")
   bLay.setWidth(700);
   bLay.setText("LogIn");
   b=bLay.attachForm(formObj2,true);
	b.attachEvent("onButtonClick",function(id){//이동시킨다
	    if(id=="saveLog"){
	    	if(b.validate()){
	    		b.send("${root}/user/login","post",callbackui);//callback function임//이것들을 루트로 보냄
	    					
	    	   	}
	    }else if(id=="cancelLog"){
	       b.clear();
	    }
	    
	 })
})
   
   

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
 var formObj = [{type:"settings",offsetTop:12,name:"회원가입",lableAlign:"left"},
            {type:"input",name:"uiName",label:"이름",required:true},
            {type:"input",name:"uiId",label:"아이디",required:true},
            {type:"password",name:"uiPwd",label:"비밀번호",validate:"ValidInteger",required:true},
            {type:"input",name:"uiEmail",label:"이메일",required:true},
            {type:"input",name:"admin",label:"보통은0,프리미엄 유저가 되려면 1",required:true},
            {type:"block", blockOffset: 0, list:[
               {type:"button",name:"saveUi",value:"회원가입"},
               {type:"newcolumn"},
               {type:"button",name:"cancelUi",value:"취소"}
            ]}
       ];
       
function callbackui(loader,res){
	   var res=JSON.parse(res);//맵을 제이슨형식으로 받음
	   
	   alert(res.msg);//맵.키값을입력하면 아까던지 (스트링)벨류가 나온다
}
//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
 var formObj2 = [{type:"settings",offsetTop:12,name:"로그인",lableAlign:"left"},
            {type:"input",name:"uiId",label:"아이디",required:true},
            {type:"password",name:"uiPwd",label:"비밀번호",validate:"ValidInteger",required:true},
            {type:"block", blockOffset: 0, list:[
            {type:"button",name:"saveLog",value:"로그인"},
            {type:"newcolumn"},
            {type:"button",name:"cancelLog",value:"취소"}
            ]}
       ];
       
function callbackLog(loader,res){
	   var res=JSON.parse(res);//맵을 제이슨형식으로 받음
	   /* if(res.msg==입력성공){
		   document.location.href="main";
	   }else{
		   alert(회원가입을 해주시기 바랍니다);
	   } */
	   
	   //alert(res.msg);//맵.키값을입력하면 아까던지 (스트링)벨류가 나온다
}

</script>
<body>

</body>
</html>