<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxLRM0JmtjmWKwZZ3KIhA2NQGzo4bROc00ontiDPg4sDy7NC1ukA">
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="${pPath}/emp/view">HOME</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="${root}/emp/list">LIST</a></li>
            <li><a href="${pPath}/emp/write">INSERT</a></li>
            <li><a href="${pPath}/emp/delete">DELETE</a></li>
            <li><a href="${pPath}/emp/update">UPDATE</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
		<br>
		<br>
		<br>
    <div class="container">
		
      <div class="starter-template">
        <h1>
        <p class="lead">명훈 주식회사</p></h1>
      </div>

    </div>
    </body>
</html>