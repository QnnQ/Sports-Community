<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 用户界面</title>
<script type="text/javascript" src="../jqlib/jquery-2.1.4.min.js"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <script src="js/responsiveslides.min.js"></script>
 <style type="text/css">
 .button{  
width: 140px;  
line-height: 38px;  
text-align: center;  
font-weight: bold;  
color: #black;  
border-radius: 5px;  
margin:0 20px 20px 0;  
position: relative;  
overflow: hidden;  
}  
.buttonblue{  
border:1px solid #1e7db9;  
box-shadow: 0 1px 2px #8fcaee inset,0 -1px 0 #497897 inset,0 -2px 3px #8fcaee inset;  
background: -webkit-linear-gradient(top,#42a4e0,#2e88c0);  
background: -moz-linear-gradient(top,#42a4e0,#2e88c0);  
background: linear-gradient(top,#42a4e0,#2e88c0);  
}
 </style>
 <script>
    // You can also use "$(window).load(function() {"
    $(function () {
      $("#slider2").responsiveSlides({
        auto: true,
        pager: true,
        speed: 300,
        namespace: "callbacks",
      });
    });
  </script>
</head>
<body>
<!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">
			<p class="header-para">HERE WE GO!AICHIXIA</p>
				<ul class="sign">
					<li ><a href="login.jsp" >登录/注册</a></li>
					<li><a href="#" ><span > </span></a></li>			
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
					<a href="index.jsp"><img src="images/sport.jpg"  alt=" " /></a>
				</div>
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">话题</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>						
						<li><a href="share.jsp" class="scroll">圈子</a></li>
						<li><a href="plan.jsp" class="scroll">计划</a></li>
					</ul>
					<!-- script-nav -->
					<!--script-->
				<script>
					$("span.menu").click(function(){
						$(".top-nav ul").slideToggle(500, function(){
						});
					});
			</script>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		</div>
	</div>
		<!--content-->
		<div class="container">
			<div class="register">
				 <div class="register-top-grid">
					<h3>用户登录</h3>
					<div class="mation">
						<span>账号</span>
						<input type="text" value=""  id="username" name="username"> 
						 <span>密码	</span>
						 <input type="password" value=""  id="password" name="password">
						 <span>验证码</span>
						<input type="text" id="checkcode" value="" name="checkcode" style= "width:200px">
						 <img id="imagecode" src="/sportcommunity/kaptcha.jpg">&nbsp;&nbsp;<a href="javascript:reload();">看不清楚？</a>
					</div>
					 <div class="clearfix"> </div>
					 <button id="login" class="button">登陆</button>&nbsp;&nbsp;&nbsp;<button id="register" class="button">注册</button>
					 </div>
				<div class="clearfix"> </div>
</div>
</div>	
		<!--content-->
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="foter-bottom">			
				<div class=" nav-top">				
					<ul>
						<li><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">话题</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>					
						<li><a href="share.jsp" class="scroll">圈子</a></li>
						<li><a href="plan.jsp" class="scroll">计划</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
			</div>
</body>
<script type="text/javascript">
document.getElementById("password").value="";
document.getElementById("username").value="";
document.getElementById("checkcode").value="";
function reload(){
	var time=new Date().getTime();
	document.getElementById("imagecode").src="/sportcommunity/kaptcha.jpg?d="+time;
};
$("#login").click(function(){
	var checkcode=$("#checkcode").val();
	var id=$("#username").val();
	var password=$("#password").val();
	var json={
		"checkcode":checkcode,
		"id":id,
		"password":password
			};
	$.ajax({
		type : 'post',
		contentType : "application/json; charset=utf-8",//json 的mime类型 application/json
		url : "/sportcommunity/CheckServlet?action=check",
		data : JSON.stringify(json),							
		success : function(returnTemplate) {
			if(returnTemplate.result){
				alert(returnTemplate.errmsg);
				document.getElementById("checkcode").value="";
				document.getElementById("username").value="";
				document.getElementById("password").value="";
				var time=new Date().getTime();
				document.getElementById("imagecode").src="/sportcommunity/kaptcha.jpg?d="+time;
			}else{
				alert(returnTemplate.errmsg);
				document.getElementById("checkcode").value="";
				document.getElementById("password").value="";
				var time=new Date().getTime();
				document.getElementById("imagecode").src="/sportcommunity/kaptcha.jpg?d="+time;
			}
		},
		dataType : 'json',
		async: false
	});
	});
$("#register").click(function(){
	var checkcode=$("#checkcode").val();
	var id=$("#username").val();
	var password=$("#password").val();
	var json={
		"checkcode":checkcode,
		"id":id,
		"password":password
			};
	$.ajax({
		type : 'post',
		contentType : "application/json; charset=utf-8",
		url : "/sportcommunity/CheckServlet?action=register",
		data : JSON.stringify(json),							
		success : function(returnTemplate) {
			if(returnTemplate.result){
				alert(returnTemplate.errmsg);
				document.getElementById("checkcode").value="";
				document.getElementById("username").value="";
				document.getElementById("password").value="";
				var time=new Date().getTime();
				document.getElementById("imagecode").src="/sportcommunity/kaptcha.jpg?d="+time;
			}else{
				alert(returnTemplate.errmsg);
				document.getElementById("checkcode").value="";
				document.getElementById("password").value="";
				var time=new Date().getTime();
				document.getElementById("imagecode").src="/sportcommunity/kaptcha.jpg?d="+time;
			}
		},
		dataType : 'json',
		async: false
	});
	});
</script>
</html>