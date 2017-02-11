package com.technorio.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technorio.dao.BlogPortalDao;
import com.technorio.model.BlogPortal;
import com.technorio.service.BlogPortalService;

@Service
public class BlogPortalServiceImpl implements BlogPortalService {

	@Autowired
	private BlogPortalDao blogPortalDao;

	@Override
	@Transactional
	public void postArticle(BlogPortal blog) {
		this.blogPortalDao.postArticle(blog);
		
	}

	@Override
	@Transactional
	public List<BlogPortal> getAllBlogs() {
		
		return this.blogPortalDao.getAllBlogs();
	}

	@Override
	@Transactional
	public BlogPortal getBlogById(long blogid) {
		
		return this.blogPortalDao.getBlogById(blogid);
	}

	@Override
	@Transactional
	public List<BlogPortal> getBlogBytags(String tags) {
		
		return this.blogPortalDao.getBlogBytags(tags);
	}
	
	
	
}
