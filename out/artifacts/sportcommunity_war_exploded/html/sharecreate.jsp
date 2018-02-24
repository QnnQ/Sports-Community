<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 大牛圈子</title>
<style type="text/css">
.styled-select {
   width: 240px;
   height: 34px;
   overflow: hidden;
   background: url(images/new_arrow.png) no-repeat right #FCFCFC;
}
.styled-select select {
   background: transparent;
   width: 268px;
   padding: 5px;
   font-size: 16px;
   border: 1px solid #ccc;
   height: 34px;
   -webkit-appearance: none; /*for chrome*/
}
.button{  
width: 140px;  
line-height: 38px;  
text-align: center;  
font-weight: bold;  
color: #000000;  
border-radius: 5px;  
position: relative;  
overflow: hidden;  
}  
</style>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/planbootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
<link href="css/planstyle.css" type="text/css" rel="stylesheet" media="all">
<link href="css/ihover.css" type="text/css" rel="stylesheet" media="all">
<link rel="stylesheet" type="text/css" href="css/style1.css"/>
<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/modernizr.custom.53451.js"></script>  
<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
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
		<!--content-->
				<div class="contact">
		<div class="container">
			<div class="contact-top ">
				<h3>Forum</h3>
			</div>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<div class="grid-contact ">
				<div class="col-md-6 contact-bottom animated wow fadeInRight" data-wow-duration="1000ms">
					<table style="width:600px">
					<tbody>
					<tr>
					<td><h4>标题</h4></td><td><input type="text" id="title" ></td>
					</tr>
					<tr>
					<td><h4>内容</h4></td><td><textarea id="content" style = "height:300px"></textarea></td>
					</tr>
					<tr>
					<td><h4>标签</h4></td><td><div class="styled-select"><select id="select">
														  <option value ="basketball">篮球</option>
														  <option value ="football">足球</option>
														  <option value="badminton">羽毛球</option>
														  <option value="gym">健身</option>
														  <option value="running">跑步</option>
														  <option value="swimming">游泳</option>
												</select></div></td>
					</tr>
					<tr>
					<td><h4>验证码</h4></td><td><input style="width:200px;" type="text" id="checkcode"  onfocus="this.value='';" onblur="if (this.value == '') "></td>
					</tr>
					<tr>
					<td></td><td><img id="imagecode" src="/sportcommunity/kaptcha.jpg">&nbsp;&nbsp;<a href="javascript:reload();">看不清楚？</a></td>
					</tr>
					</tbody>
					</table>
					<div style="margin:50px 0;text-align:right;">
					<button class="button" id="submit">提交</button></div>
			</div>
			<div class="col-md-6 contact-bottom animated wow fadeInLeft" data-wow-duration="1000ms">
			<div class="clearfix"> </div>
			</div>
	</div>	
</div>
</div>
	<!--//gallery-->

	<!--letter-starts-->
	<div class="letter">
		<div class="container">
			<div class="letter-top heading3">
				<h3>Forum</h3>
			</div>
			
		</div>
	</div>
	<!--letter-end-->
</body>
<script type="text/javascript">
function reload(){ 
	var time=new Date().getTime();
	document.getElementById("imagecode").src="/sportcommunity/kaptcha.jpg?d="+time;
};
$("#submit").click(function(){
	var newString = document.getElementById("content").value.replace(/\n/g, '_@').replace(/\r/g, '_#');
	newString = newString.replace(/_@/g, '<br/>');
	newString = newString.replace(/\s/g, '&nbsp;');
	var title=$("#title").val();
	var content=newString;
	var myselect=document.getElementById("select");
	var index=myselect.selectedIndex;
	var board=myselect.options[index].value;
	var checkcode=$("#checkcode").val();
	var json={
		"checkcode":checkcode,			
		"title":title,
		"content":content,
		"board":board
			};
	$.ajax({
		type : 'post',
		contentType : "application/json; charset=utf-8",
		url : "/sportcommunity/ShareCreateServlet?action=dopost",
		data : JSON.stringify(json),							
		success : function(returnTemplate) {
			if(returnTemplate.result){
				alert(returnTemplate.errmsg);
				window.location.href="shareboard.jsp?board="+board+"&page=0";
			}else{
				alert(returnTemplate.errmsg);
				document.getElementById("checkcode").value="";
				document.getElementById("title").value="";
				document.getElementById("content").value="";
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