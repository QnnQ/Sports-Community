<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>热门话题</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
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
					<a href="index.jsp"><img src="images/sport.jpg" alt=" " /></a>
				</div>
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li  ><a href="index.jsp" class="scroll">首页</a></li>
						<li class="active"><a href="topic.jsp" class="scroll">话题</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>						
						<li><a href="share.jsp" class="scroll">圈子</a></li>
						<li><a href="plan.jsp" class="scroll">计划 </a></li>
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
		
		<!--content-->
			<div class="content">
				<div class="content-gear">
					<div class="container">
					<h3><a href="http://nba.hupu.com" >热议Top</a></h3>
						
						<p>Before you can start dropping bombs, you've gotta have the right tool in your hands. The Juggy ASA brings mad pop to the plate with its stacked composite design. The end-loaded triple wall barrel provides a strong, lightweight hitting zone with a springboard surface and a two-piece feel. The Big D end cap tops off the 12" barrel, keeping energy focused on the sweet spot. With a TR3 F.L.O. handle, this bat is a force waiting to explode. As soon as you connect, you can feel the unbridled power of the Juggy ASA.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">...查看更多</a></p>
					</div>
				</div>
				<!---->
				<div class="container">
				<div class="gear-content">
					<h3>茶余饭后</h3>
					<div class="gear-grid">
						<div class="col-md-4">
							<label class="icon-grid" > </label>
							<div class="inner-gear">
								<h5><a href="#">爱跑社区</a></h5>
								<p>The next generation of DoubleWall, Stacked Composite, optimizes multiple walls separated by DeMarini Power Ply for the biggest sweet </p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="col-md-4">
							<label class="icon-grid icon" > </label>
							<div class="inner-gear">
								<h5><a href="#">篮球公园</a></h5>			
								<p>This year, we fused the layers of carbon to create a stronger barrel with less weight. This allows us to distribute the bat weight evenly throughout the bat. A more balanced bat produces faster bat speeds so </p>
							</div>
							<div class="clearfix"> </div>
						</div>
							<div class="col-md-4">
							<label class="icon-grid grid-icon" > </label>
							<div class="inner-gear">
								<h5><a href="#">足球论坛</a></h5>
								<p>The next generation of DoubleWall, Stacked Composite, optimizes multiple walls separated by DeMarini Power Ply for the biggest sweet </p>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="clearfix"> </div>
					</div>
	
				
				</div>
				
		</div>
		</div>
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="foter-bottom">			
				 <p class="footer-grid"></p>
				<div class=" nav-top">				
				<ul>
						<li><a href="index.jsp" class="scroll">首页</a></li>
						<li class="active"><a href="topic.jsp" class="scroll">话题</a></li>
						<li><a href="community.jsp" class="scroll">干货</a></li>						
						<li><a href="share.jsp" class="scroll">圈子</a></li>
						<li><a href="plan.jsp" class="scroll">计划 </a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
			</div>
		</body>
		</html>