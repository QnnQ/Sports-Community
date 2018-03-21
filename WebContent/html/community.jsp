<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 实用干货</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
						<li class="active"><a href="community.jsp" class="scroll">干货</a></li>						
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
		<!--content-->
		
		<!----start-gallery---->
		<div id="gal" class="gallery">
			<div class="container">
				<div class="head">
					<h3>SKILL</h3>
				</div>
				<div class="gallery-grids">
					<div class="gallery-grids-row1">
						<div class=" gallery-grid3">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="img-responsive port-pic" src="images/basketball.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span>篮球大神干货</span>
										<button>查看</button>
									</h2>
								</div>
							</a>
						</div>
						<div class=" gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="img-responsive port-pic" src="images/g2.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> SPORTS</span>
										<button>View photo</button>
									</h2>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="gallery-grids-row1">
						<div class=" gallery-grid2">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="img-responsive port-pic" src="images/g3.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> SPORTS</span>
										<button>View photo</button>
										
									</h2>
								</div>
							</a>
						</div>
						<div class=" gallery-grid2">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="img-responsive port-pic" src="images/football.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> 足球大神干货</span>
										<button>查看</button>
										
									</h2>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
						
					</div>
					<!----->
					<div class="gallery-grids-row1">
						<div class=" gallery-grid1">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="img-responsive port-pic" src="images/g2.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> SPORTS</span>
										<button>View photo</button>
										
									</h2>
								</div>
							</a>
						</div>
						<div class=" gallery-grid3">
							<a href="#" class="b-link-stripe b-animate-go  thickbox">
								<img class="img-responsive port-pic" src="images/gym.jpg" />
								<div class="b-wrapper">
									<h2 class="b-animate b-from-left    b-delay03 ">
										<span> 健身大神干货</span>
										<button>查看</button>
										
									</h2>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
						
					</div>
				</div>
				<a class="view-gallery-btn" href="#">查看更多运动</a>
			</div>
		</div>
		<!----//End-gallery---->
		<!--content-->
	<!--footer-->
	<div class="footer">
		<div class="container">
		
			<div class="foter-bottom">			
				<div class=" nav-top">				
					<ul>
						<li><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">新闻</a></li>
						<li class="active"><a href="community.jsp" class="scroll">干货</a></li>					
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