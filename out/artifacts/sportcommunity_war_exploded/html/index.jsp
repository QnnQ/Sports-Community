<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 官网首页</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
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
					<a href="index.jsp"><img src="images/sport.jpg "  alt=" " /></a>
				</div>
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li class="active" ><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">话题</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>
						<li><a href="share.jsp" class="scroll">圈子</a></li>
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
		<!--banner-->
		 <div class="slider">
			<ul class="rslides" id="slider2">
			  <li><a href="#"><img src="images/ban.jpg" alt="">
			  <div class="banner">
			  <span class=" matter "> </span>
			  </div>
			  </a></li>
			  <li><a href="#"><img src="images/bb.jpg" alt="">
			   <div class="banner">
			  <span class=" matter"> </span>
			  </div>
			   </a></li>
			  <li><a href="#"><img src="images/ban.jpg" alt="">
				<div class="banner">
			  <span class="matter "> </span>
			  </div>
			  </a></li>
			   
			  </a></li>
			</ul>
		</div>
		
		<!--content-->
			<div class="content">
				<div class="content-app">
					<div class="container">
						<h3>体育新闻图片</h3>
						<div class="content-from">
							<div class="col-md-4 from-grid ">
								<a href="http://sports.sina.com.cn/global/"><img class="img-responsive left-pic" src="images/pic.jpg" alt=" " /></a>
								<p>2015 football 7 lineup released</p>								
							</div>
							<div class="col-md-4 from-grid ">
								<a href="http://sports.sina.com.cn/global/"><img class="img-responsive left-pic" src="images/pic1.jpg" alt=" " /></a>
								<p>2015 football cf 7 lineup released</p>								
							</div>
							<div class="col-md-4 from-grid ">
								<a href="http://sports.sina.com.cn/global/"><img class="img-responsive left-pic" src="images/pic.jpg" alt=" " /></a>
								<p>2015 football cf 7 lineup released</p>								
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<!---->
		<div class="content-app-up">
			<div class="container">
			<span class="line"> </span>
			<h3>社交媒体</h3>
			<div class="regard">
				<div class="regard-in">					
					<p><a href="#"> about a day ago we replied to </a></p>
					<p>@danielcook1996 Hi Daniel, we are sorry that we can't get something out to you sooner. If you have any questions regarding...</p>	
					<a href="#"><span> </span></a>
				</div>
				<div class="regard-in">
				<a href="#"><span class="camera"> </span></a>
					<p><a href="#"> about a day ago we replied to </a></p>
					<img class="img-responsive ago" src="images/pe.jpg" alt="">
					<p class="col-d">@Football22 Chris Larsen with the #CL22. #SlowpitchSunday @FootballSP #beast</p>	
				<div class="clearfix"> </div>
				
				</div>
				<div class="regard-in">
					<p><a href="#"> about a day ago we replied to </a></p>
					<p>@danielcook1996 Hi Daniel, we are sorry that we can't get something out to you sooner. If you have any questions regarding...</p>	
					<a href="#"><span class="face"> </span></a>
				</div>
				
				
			</div>
			</div>		
		</div>
		<!---->		
	</div>
	<!--footer-->
	<div class="footer">
		<div class="container">
		
			<div class="foter-bottom">			
				<div class=" nav-top">				
					<ul>
						<li class="active" ><a href="index.jsp" class="scroll">首页</a></li>
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
</html>