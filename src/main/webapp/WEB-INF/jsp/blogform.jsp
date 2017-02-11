<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Post Article</title>
	<link href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	<script src="//cloud.tinymce.com/stable/tinymce.min.js"></script>
  	<script>tinymce.init({ selector:'textarea' });</script>
</head>
<body>
	<div class="container-fluid">
	<form:form action="${pageContext.request.contextPath}/postarticle" method="post" >
	
		<div class="form-group clearfix">
		<div class="col-lg-4">
			<label>Title</label>
			<input type="text"  class="form-control"  name="title"/>
			<form:errors path="title"/>
		</div>
		</div>
		
		<div class="form-group clearfix">
			<textarea name="article" class="form-control" style="width: 650px; height: 200px" placeholder="Write article"></textarea>
			<form:errors path="article"/> 
		</div>
		
		<div class="form-group clearfix">
		<div class="col-lg-4">
			<label>Tags</label>
			<input type="text"  class="form-control"  name="tags"/>
			<form:errors path="tags"/>
		</div> 
		</div>
		
		 <div class="form-group">
		 <input type="submit" name="submit" value="Post Article" class="btn btn-primary btn-md pull-left">
		 </div>
		 
	</form:form>
	</div>
	
	<a href="${pageContext.request.contextPath}/articles"> All Blogs</a>
	
		
</body>
</html>