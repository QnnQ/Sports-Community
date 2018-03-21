<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 大牛圈子</title>
<style type="text/css">
 .button{  
background:#73BF00;
width: 140px;
line-height: 38px;  
text-align: center;  
font-weight: bold;  
color: #FFFFFF;  
border-radius: 5px;  
margin:0 20px 20px 0;  
position: relative;  
overflow: hidden;  
}  
</style>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <script src="js/responsiveslides.min.js"></script>
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
					<a href="index.jsp"><img src="images/sport.jpg"  alt=" " /></a>
				</div>
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li  ><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">新闻</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>						
						<li class="active"><a href="share.jsp" class="scroll">圈子</a></li>
						<li><a href="plan.jsp" class="scroll">计划</a></li>
					</ul>
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
		<div class="services" >
			<div style="text-align:right;"><button class="button" onClick="location.href='sharecreate.jsp'">我要发帖</button></div>
			<div class="container">
				<div class="serives-bottom">
				<div class="col-md-4 service-left">
				<div class="service-grid">
				<div class="col-md-8 we-do">
				<h6><a href="shareboard.jsp?board=basketball&page=0">篮球</a></h6>
					<p></p>
					</div>
					</div>
					<ul class="service-list"  id="basketball">
					
					</ul>
				</div>
				<div class="col-md-4 service-left">
				<div class="service-grid">
				<div class="col-md-8 we-do">
					<h6><a href="shareboard.jsp?board=football&page=0">足球</a></h6>
					<p></p>
					</div>
					</div>
					<ul class="service-list" id="football">
					
					</ul>
				</div>
				<div class="col-md-4 service-left">
				<div class="service-grid">
				<div class="col-md-8 we-do">
					<h6><a href="shareboard.jsp?board=badminton&page=0">羽毛球</a> </h6>
					<p></p>
					</div>
					</div>
					<ul class="service-list" id="badminton">
					
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="serives-bottom">
				<div class="col-md-4 service-left">
				<div class="col-md-8 we-do">
					<h6><a href="shareboard.jsp?board=gym&page=0">健身</a></h6>
					<p></p>
					</div>
					<ul class="service-list" id="gym">
					
					</ul>
				</div>
				<div class="col-md-4 service-left">
				<div class="col-md-4 we-do">
					<h6><a href="shareboard.jsp?board=running&page=0">跑步</a></h6>
					<p></p>
					</div>
					<ul class="service-list" id="running">
					
					</ul>
				</div>
				<div class="col-md-4 service-left">
				<div class="col-md-8 we-do">
					<h6><a href="shareboard.jsp?board=swimming&page=0">游泳</a> </h6>
					<p></p>
					</div>
					<ul class="service-list" id="swimming">
					
					</ul>
				</div>
				<div class="clearfix"> </div>
</div>
		</div>	
		</div>				
		<!--content-->
	<!--footer-->
	<div class="footer">
		<div class="container">	
			<div class="foter-bottom">			
				<div class=" nav-top">				
					<ul>
						<li  ><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">新闻</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>					
						<li class="active"><a href="share.jsp" class="scroll">圈子</a></li>
						<li><a href="plan.jsp" class="scroll">计划</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
			</div>
</body>
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
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=basketball",
	success:function(returnTemplate) {
		if(returnTemplate.result){
			for(var j=0;j<4;j++)
				{
				var str ="<li><a href=\"sharecontent.jsp?board=basketball&id="+returnTemplate.list[j].id+"\">"+returnTemplate.list[j].title+"</a></li>";
		        $("#basketball").append(str);
				}
			var str ="<li class=\"sed-ut\"><a href=\"sharecontent.jsp?board=basketball&id="+returnTemplate.list[4].id+"\">"+returnTemplate.list[4].title+"</a></li>";
	        $("#basketball").append(str);
		}
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=football",
	success:function(returnTemplate) {
		if(returnTemplate.result){
			for(var j=0;j<4;j++)
				{
				var str ="<li><a href=\"sharecontent.jsp?board=football&id="+returnTemplate.list[j].id+"\">"+returnTemplate.list[j].title+"</a></li>";
		        $("#football").append(str);
				}
			var str ="<li class=\"sed-ut\"><a href=\"sharecontent.jsp?board=football&id="+returnTemplate.list[4].id+"\">"+returnTemplate.list[4].title+"</a></li>";
	        $("#football").append(str);
		}
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=badminton",
	success:function(returnTemplate) {
		if(returnTemplate.result){
			for(var j=0;j<4;j++)
				{
				var str ="<li><a href=\"sharecontent.jsp?board=badminton&id="+returnTemplate.list[j].id+"\">"+returnTemplate.list[j].title+"</a></li>";
		        $("#badminton").append(str);
				}
			var str ="<li class=\"sed-ut\"><a href=\"sharecontent.jsp?board=badminton&id="+returnTemplate.list[4].id+"\">"+returnTemplate.list[4].title+"</a></li>";
	        $("#badminton").append(str);
		}
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=gym",
	success:function(returnTemplate) {
		if(returnTemplate.result){
			for(var j=0;j<4;j++)
				{
				var str ="<li><a href=\"sharecontent.jsp?board=gym&id="+returnTemplate.list[j].id+"\">"+returnTemplate.list[j].title+"</a></li>";
		        $("#gym").append(str);
				}
			var str ="<li class=\"sed-ut\"><a href=\"sharecontent.jsp?board=gym&id="+returnTemplate.list[4].id+"\">"+returnTemplate.list[4].title+"</a></li>";
	        $("#gym").append(str);
		}
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=running",
	success:function(returnTemplate) {
		if(returnTemplate.result){
			for(var j=0;j<4;j++)
				{
				var str ="<li><a href=\"sharecontent.jsp?board=running&id="+returnTemplate.list[j].id+"\">"+returnTemplate.list[j].title+"</a></li>";
		        $("#running").append(str);
				}
			var str ="<li class=\"sed-ut\"><a href=\"sharecontent.jsp?board=running&id="+returnTemplate.list[4].id+"\">"+returnTemplate.list[4].title+"</a></li>";
	        $("#running").append(str);
		}
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=swimming",
	success:function(returnTemplate) {
		if(returnTemplate.result){
			for(var j=0;j<4;j++)
				{
				var str ="<li><a href=\"sharecontent.jsp?board=swimming&id="+returnTemplate.list[j].id+"\">"+returnTemplate.list[j].title+"</a></li>";
		        $("#swimming").append(str);
				}
			var str ="<li class=\"sed-ut\"><a href=\"sharecontent.jsp?board=swimming&id="+returnTemplate.list[4].id+"\">"+returnTemplate.list[4].title+"</a></li>";
	        $("#swimming").append(str);
		}
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
</script>
</html>