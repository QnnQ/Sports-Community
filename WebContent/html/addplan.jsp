<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 个人计划</title>
<style type="text/css">
 .button{  
width: 140px;  
line-height: 38px;  
text-align: center;
font-weight: bold;  
color: #black;  
border-radius: 5px;  
position: relative;  
overflow: hidden;  
}
.t_area{
padding: 5px 3px 3px 5px;
height:100px;
width:580px;
overflow-y:visible 
}  
 </style>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/jquery.datetimepicker.css"/>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script src="js/build/jquery.datetimepicker.full.js"></script>
<link rel="stylesheet" href="kindeditor/themes/default/default.css" />
<script charset="utf-8" src="kindeditor/kindeditor-all-min.js"></script>
<script charset="utf-8" src="kindeditor/lang/zh-CN.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" type="text/css" href="css/calendar/iframe.css" media="screen" />
</head>
<body>
<!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">
			<p class="header-para">HERE WE GO!AICHIXIA</p>
				<ul class="sign">
					<c:choose>
					<c:when test="${empty sessionScope.user}"><li><a href="login.jsp" >登录/注册</a></li></c:when>
					<c:otherwise><li><p>欢迎您:<%=session.getAttribute("user") %></p></li><li><a href="#" onclick="logOut()">退出</a></li></c:otherwise>
					</c:choose>			
				</ul>
			</div>
			<div class="clearfix"> </div>
	</div>
	<div class="header-bottom-top">
		<div class="container">
			<div class="search">	
				<input type="text" value="Search website" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
				<input type="submit"  value="">	
			</div>
			<div class="clearfix"> </div>
			<div class="header-bottom">			
				<div class="logo">
					<a href="index.jsp"><img src="images/sport.jpg" alt=" " /></a>
				</div>
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li  ><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">新闻</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>						
						<li><a href="share.jsp" class="scroll">圈子</a></li>
						<li class="active"><a href="plan.jsp" class="scroll">计划</a></li>
					</ul>
					<!--script-->
			 	
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
</div>
<div class="content">
				<div class="content-gear">
				<div class="container">
						<h3>PLAN</h3>
				</div>		
				</div>
			<div class="container" style="width:700px;margin-bottom:60px;">
						<form action="../PlanServlet" method="post" >
						<fieldset>
						<legend> Sport</legend>
						<p><input type="radio" name="selectedsport" value="running" checked="checked">跑步</p>
						<p><input type="radio" name="selectedsport" value="gym" >健身</p>
						<p><input type="radio" name="selectedsport" value="ballgame" >球类运动</p>
						<p><input type="radio" name="selectedsport" value="riding" >骑行</p>
						<p><input type="radio" name="selectedsport" value="outdoor" >户外</p>
						</fieldset>
						<fieldset>
						<legend> Date</legend>
						<label > 时间  </label>
						<input type="text" class="some_class" placeholder="from" id="some_class_1" name="from_time"> 
						<span>~&nbsp;&nbsp;</span><input type="text" class="some_class" placeholder="to" id="some_class_2" name="to_time">
						</fieldset>
						<fieldset>
						<legend> Title</legend>
						<label > 标题  </label>
						<input type="text" name="title">
						</fieldset>
						<fieldset>
						<legend> Event</legend>
						<textarea id="editor_id" name="content" >
				
						</textarea>
						<script>
			        		KindEditor.ready(function(K) {
			                window.editor = K.create('#editor_id',{allowImageUpload:false});
			        		});
						</script>		
						</fieldset>
						<br>
						<input type="submit" class="button" value="提交">
						</form>
			</div>
	</div>		
<div class="footer">
		<div class="container">	
			<div class="foter-bottom">			
				<div class=" nav-top">				
					<ul>
						<li  ><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">新闻</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>					
						<li ><a href="share.jsp" class="scroll">圈子</a></li>
						<li class="active"><a href="plan.jsp" class="scroll">计划</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
			</div>		
</body>
<script>
/*
window.onerror = function(errorMsg) {
	$('#console').html($('#console').html()+'<br>'+errorMsg)
}*/
$('.some_class').datetimepicker();
</script>
<script type="text/javascript">
function logOut(){
	$.ajax({
		type : 'post',
		url : "/sportcommunity/CheckServlet?action=logOut",
		success : function() {
			window.location.href='index.jsp';
		},
		async: false
	});
};
</script>
</html>