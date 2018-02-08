<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

   <style>
      div.controls {
         margin: 0px 10px;
         font-size: 14px;
         font-family: Tahoma;
         color: #404040;
         height: 80px;
      }
      div#winVP {
         position: relative;
         height: 350px;
         border: 1px solid #dfdfdf;
         margin: 10px;
      }
   </style>
   <script >
   var popw,winF;
   $(document).ready(function(){//온로드와 같은기능
	   winF=new dhtmlXWindows();//새윈도우의 기본집합
	   winF.attachViewportTo("winVP");//페이지 밑에설정한것을 연결하려고
	   popw=winF.createWindow("win1",20,30,200,300)//윈도우창설정
		popw.hide(); 
	    popw.setText("안녕하세요 ^^");//헤더 텍스트 저의
	    
	    var formObj = [{type:"settings",offsetTop:12,name:"connectionInfo",lableAlign:"left"},
            {type:"input",name:"ciName",label:"컨넥션이름",required:true},
            {type:"input",name:"ciUrl",label:"접속URL",required:true},
            {type:"input",name:"ciPort",label:"포트번호",validate:"ValidInteger",required:true},
            {type:"input",name:"ciDatabase",label:"접속DB",required:true},
            {type:"input",name:"ciUser",label:"접속유저",required:true},
            {type:"password",name:"ciPwd",label:"접속비밀번호",required:true},
            {type:"input",name:"ciEtc",label:"기타"},
            {type:"block", blockOffset: 0, list:[
               {type:"button",name:"saveBtn",value:"저장"},
               {type:"newcolumn"},
               {type:"button",name:"cancelBtn",value:"취소"}
            ]}
       ];
       
		 /* --1-- formObj.push(setting); */
		
		 var form = popw.attachForm(formObj,true);//폼을 셀에 붙일려고
		 
		 form.attachEvent("onButtonClick",function(id){//이동시킨다
		    if(id=="saveBtn"){
		    	if(form.validate()){
		    		form.send("${root}/connection/insert","post",callback);//callback function임//이것들을 루트로 보냄
		    					
		    	   	}
		    }else if(id=="cancelBtn"){
		       form.clear();
		    }
		    
		 })
		 
		})
		function callback(loader,res){
	   var res=JSON.parse(res);//맵을 제이슨형식으로 받음
	   
	   alert(res.msg);//맵.키값을입력하면 아까던지 (스트링)벨류가 나온다
   }
		
		
		function showpopw(onOff){
		 
		 if(onOff){
			 popw.show();//나와라 ㅗ 띄움
		    return;
		 }
		 popw.hide();//ㅗ를 꺼지게한다

   }
		
			</script>
   <body>
   <div id="winVP"></div>
   <div class="controls">
   
   <button onclick="showpopw(true)">떠라ㅗ^^</button>
   <button onclick="showpopw(false)">꺼져ㅗ^^</button>
   </div>
</body>
</html>