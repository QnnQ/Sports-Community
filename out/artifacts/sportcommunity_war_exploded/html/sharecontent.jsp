<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>大牛圈子</title>
 <link href="css/main.css" rel="stylesheet" type="text/css" />
 <link href="css/buttons.css" rel="stylesheet" type="text/css" />
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
						<li  ><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="topic.jsp" class="scroll">话题</a></li>
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
	<br>
            <div class="buttons">
                <a href="#" class="but1" id="backadress">
                    <span class="icon"></span>
                    <span class="title">返回上一层</span> 
                    <span class="icon2"></span>
                </a>
           	 </div>
			<div class="content">
				<div class="content-gear">
					<div class="container">
					<h1 id="title"></h1>
						<br>
						<p id="date" style="height:20px;"></p>
						<p id="content" style="text-align:left;"></p>
					</div>
				</div>
				</div>
</body>
<script type="text/javascript"> 
document.getElementById("backadress").href =document.referrer;
var board= "<%= request.getParameter("board")%>";
var id= "<%= request.getParameter("id")%>";
var json={
		"board":board,
		"id":id
};
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareServlet?action=content",
	data : JSON.stringify(json),	
	success:function(returnTemplate) {
		if(returnTemplate.result){
			var titlestr=returnTemplate.list[0].title;
			$("#title").append(titlestr);
			var createtime="日期 : "+returnTemplate.list[0].createtime;
			$("#date").append(createtime);
			var contentstr=returnTemplate.list[0].content;
			$("#content").append(contentstr);
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