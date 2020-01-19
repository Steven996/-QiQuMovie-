<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<%@taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>detail</title>
</head>
<body>
<div class="span12">

<b:forEach items="${hotmoviedetaillist}" var="e">

<embed src="${e.video}" width="1120" height="500">
<p style="color:white">${e.detail}</p>
<style>
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;   
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  
  transform: translateY(4px);
}
</style>

</b:forEach>
<button class="button">收藏</button>

</div>
</body>
</html>
<%@include  file="footer.jsp"%>