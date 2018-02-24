<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>大牛圈子</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel='stylesheet' id='bootstrap-css-css'  href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='responsive-css-css'  href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='main-css-css'  href='css/main5152.css?ver=1.0' type='text/css' media='all' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <script src="js/responsiveslides.min.js"></script>
 <style type="text/css">
.line-limit-length {
	height:20px;
    width:400px; 
    overflow : hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}
 </style>
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
<body >
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
	<br>
	<article class="format-standard type-post hentry clearfix">
                      <header class="clearfix">
	<div>
	 <div class="span8 main-listing">
	 <div id="boardcontent" >
	 
	 </div>
              <div id="pagination">
                      
              </div>
     </div>
     </div>
     </header>
     </article>
     
</body>
<script type="text/javascript">
var board= "<%= request.getParameter("board")%>";
var page= "<%= request.getParameter("page")%>";
var json={
		"board":board
};
window.onload=sumitPage(page);
$.ajax({
	type: 'post',
	contentType : "application/json; charset=utf-8",
	url:"/sportcommunity/ShareBoardServlet?action=checkpage",
	data : JSON.stringify(json),
	success:function(returnTemplate) {
		if(returnTemplate.result){
			var str="<a href=\"shareboard.jsp?board="+board+"&page=0\" class=\"btn active\">1</a>";
			$("#pagination").append(str);
			for(var i=1;i<returnTemplate.rows;i++)
				{
					var str="<a href=\"shareboard.jsp?board="+board+"&page="+i+"\"  class=\"btn\">"+(i+1)+"</a>";
					$("#pagination").append(str);
				}
			if(returnTemplate.rows>=2)
				{
			var nextpage= page + 1;
			var str1="<a href=\"shareboard.jsp?board="+board+"&page="+nextpage+"\" class=\"btn\">Next »</a>";
			$("#pagination").append(str1);
            var str2="<a href=\"shareboard.jsp?board="+board+"&page="+(returnTemplate.rows-1)+"\" class=\"btn\">Last »</a>";
            $("#pagination").append(str2);
				}
		}	
		else{
			alert(returnTemplate.errmsg);
		}
	},
	dataType : 'json',
	async: false
});	
function sumitPage(index){
	var num1=index*10;
	var json={
		"num1":num1,
		"board":board
	};
	$.ajax({
		type: 'post',
		contentType : "application/json; charset=utf-8",
		url:"/sportcommunity/ShareBoardServlet?action=pagecontent",
		data : JSON.stringify(json),
		success:function(returnTemplate) {
			if(returnTemplate.result){
				$("#boardcontent").empty();
				for(var i=0;i<returnTemplate.list.length;i++){
				var str1="<h3 class=\"post-title\"><a href=\"sharecontent.jsp?board="+returnTemplate.list[i].board+"&id="+returnTemplate.list[i].id+"\">"+returnTemplate.list[i].title+"</a></h3>";
				$("#boardcontent").append(str1);
				var str2="<div class=\"post-meta clearfix\">		        &nbsp;&nbsp;&nbsp;&nbsp;<span class=\"date\">"+returnTemplate.list[i].createtime+"</span>		        	        <span class=\"like-count\">"+returnTemplate.list[i].visitcount+"访问量</span>		</div>";
				$("#boardcontent").append(str2);
				var str3="<p class=\"line-limit-length\">"+returnTemplate.list[i].content+"</p>";
				$("#boardcontent").append(str3);
				}
			}else{
				alert(returnTemplate.errmsg);
			}
		},
		dataType : 'json',
		async: false
	});	
	};
</script>
</html>