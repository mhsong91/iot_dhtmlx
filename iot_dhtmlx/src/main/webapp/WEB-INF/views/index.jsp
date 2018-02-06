<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<head>
<meta charset="UTF-8">
<title>Dropdown Menu UI</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel='stylesheet prefetch'	href='https://cdnjs.cloudflare.com/ajax/libs/octicons/3.5.0/octicons.css'>
	<link rel='stylesheet prefetch'	href='http://fonts.googleapis.com/css?family=Lato:300'>
	<link rel="stylesheet" href="css/style.css">
	</head>

<body>

<div class="content">
	<div class="admin-panel"><label for="toggle" class="admin-text">메뉴</label></div>
	<input type="checkbox" id="toggle">
	<label class="cog octicon octicon-gear" for="toggle"></label>
	<div class="menu">
		<div class="arrow"></div>
			<a href="#">Edit Users <span class="icon octicon octicon-person"></span></a>
			<a href="#">Web Statistics <span class="icon octicon octicon-graph"></span></a>
			<a href="#">Upload Settings <span class="icon octicon octicon-cloud-upload"></span></a>
			<a href="#">Edit Slider <span class="icon octicon octicon-pencil"></span></a>
			<a href="#">Edit Slider <span class="icon octicon octicon-pencil"></span></a>
		</div>
	</div>
</div>
</body>
</html>