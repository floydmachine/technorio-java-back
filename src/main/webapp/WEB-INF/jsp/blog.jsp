<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Article</title>
</head>
<body>

		<div class="container product_details">
				<div class="row">
					<h4> <span>Article </span></h4>
				</div>
				
				<div class="col-lg-6 productdetail">
					<h5>Title:${blog.title}</h5>
					<h5>Tags:${blog.tags}</h5>
					
				</div>
				
				<div class="row">
				<div class="product_desc">
				<h5 class="active">Article</h5>
				<p>${blog.article}</p>
				</div>
				</div>
		</div>	
		
		<a href="${pageContext.request.contextPath}/articles"> All Blogs</a>
		<a href="${pageContext.request.contextPath}/postarticle"> Write A Blog</a>
		
</body>
</html>