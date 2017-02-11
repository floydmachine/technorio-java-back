package com.technorio.dao;

import java.util.List;

import com.technorio.model.BlogPortal;

public interface BlogPortalDao {

	public void postArticle(BlogPortal blog);
	
	public List<BlogPortal> getAllBlogs();
	
	public BlogPortal getBlogById(long blogid);
	
	public List<BlogPortal> getBlogBytags(String tags);
	
}
