 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>  
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
  <title >奇趣影院</title>
  <!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap/css/default.css">

<!-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/carousel.css" > -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" >

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script	src="${pageContext.request.contextPath}/css/bootstrap/js/bootstrap.min.js"></script>
<!-- <script src="${pageContext.request.contextPath}/js/common.js"></script> -->

 </head>
 <body>

 <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 ">
		<div class="navbar navbar-inverse">
 			<ol class="breadcrumb text-right" id="info">
					<li id="li1"><span>游客您好，欢迎来到奇趣影院！</span>
					<a href="login.jsp" >[登录]</a>&nbsp;<a href="register.jsp">[注册]</a></li>
					<li><a href="#" onclick="">我的收藏 <span class="badge" id="cartBadge"></span></a></li>
			 </ol>
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header navbar-inverse"">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="${pageContext.request.contextPath}/index.action"><span class="logo">奇趣</span> 影院</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="${pageContext.request.contextPath}/index.action">首页</a>
						</li>
						<li class="active">
							 <a href="movie.action">电影</a>
						</li>
						<li class="active">
							 <a href="session.action">连续剧</a>
						</li>
						<li class="active">
							 <a href="show.action">综艺</a>
						</li>
						<li class="active">
							 <a href="cartoon.action">动漫</a>
						</li>
						<li class="active" >
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">直播<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
							   <c:forEach begin="1" end="3" var="c1" varStatus="vs">								
				                    <c:forEach begin="1" end="2" var="a" varStatus="i">
							  			<li><a href="https://www.panda.tv/cate#jingji">热门竞技</a></li>
							  			<li><a href="https://www.panda.tv/cate#yllm">娱乐联盟</a></li>
							  			<li><a href="https://www.panda.tv/cate#cjsy">吃鸡手游</a></li>
							  			<li><a href="https://www.panda.tv/cate#shouyou">手游专区</a></li>
							  			<li><a href="https://www.panda.tv/cate#zjdj">主机单机</a></li>
							  			<li><a href="https://www.panda.tv/cate#wangyou">网游专区</a></li>
							  			<li><a href="https://www.panda.tv/cate#sports">体育专区</a></li>
							  			<li><a href="https://pandakill.pgc.panda.tv/?channel=web_pgc-tjw-ch_fenleibq1&pdt=1.24.s0.pdk4.4q2raa9krgc">Panda Kill4</a></li>
							  			<li><a href="https://avalon.pgc.panda.tv/?channel=web_pgc-tjw-ch_fenleibq2&pdt=1.24.s0.avalon.1o133e1v9dj">决战阿瓦隆</a></li>
						            </c:forEach>	
						            <li class="divider"></li>							
							   </c:forEach>						
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search" action="find.action" method="post">
						<div class="form-group">
							<input type="text" class="form-control" name="search"/>
						<button type="submit" class="btn btn-default"  >搜索</button>
						</div> 
					</form>
					<ul class="nav navbar-nav navbar-right ">

			</nav>