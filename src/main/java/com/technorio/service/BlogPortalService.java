package com.technorio.service;

import java.util.List;

import com.technorio.model.BlogPortal;

public interface BlogPortalService {

	public void postArticle(BlogPortal blog);
	
	public List<BlogPortal> getAllBlogs();
	
	public BlogPortal getBlogById(long blogid);
	
	public List<BlogPortal> getBlogBytags(String tags);
}
