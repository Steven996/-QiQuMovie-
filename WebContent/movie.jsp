<%@include file="/header.jsp"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>电影</title>
</head>
<body>
<div class="row">
	<b:forEach items="${movielist}" var="e" varStatus="vs">
 <b:if test="${vs.count<=12}">
        <div class="col-md-2">
        <a href="detail.action">
 		<div class="thumbnail">
        <img class="img2"src="${pageContext.request.contextPath}/${e.picture}"/>
        <p>${e.moviename}</p>
        </a>
  		</div>        
        </div>
	</b:if>
</b:forEach>
	
	</div>
</body>
</html>
<%@include  file="footer.jsp"%>