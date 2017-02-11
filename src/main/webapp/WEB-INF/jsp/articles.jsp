<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>All Articles</title>
	<link href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<div class="container-fluid">
	<c:forEach items="${bloglist}" var="blog">
		<div class="art">
		<h2><a href="${pageContext.request.contextPath}/articles/${blog.blogid}">${blog.title}</a></h2>
		<p> <a href="${pageContext.request.contextPath}/${blog.tags}/articles"><span>${blog.tags}</span></a></p>
		
		</div>
	</c:forEach>
	</div>
	

	<a href="${pageContext.request.contextPath}/postarticle"> Write A Blog</a>
		
</body>
</html>