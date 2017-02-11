package com.technorio.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technorio.dao.BlogPortalDao;
import com.technorio.model.BlogPortal;

@Repository
public class BlogPortalDaoImpl implements BlogPortalDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void postArticle(BlogPortal blog) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(blog);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BlogPortal> getAllBlogs() {
		Session session=this.sessionFactory.getCurrentSession();
		System.out.println("Get All Blogs");
		List<BlogPortal> bloglist=(List<BlogPortal>) session.createQuery("from BlogPortal").list();
		System.out.println(bloglist);
		return bloglist;
	}

	@Override
	public BlogPortal getBlogById(long blogid) {
		Session session=this.sessionFactory.getCurrentSession();
		BlogPortal blog=(BlogPortal) session.load(BlogPortal.class, new Long(blogid));
		return blog;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BlogPortal> getBlogBytags(String tags) {
		Session session=this.sessionFactory.getCurrentSession();
		List<BlogPortal> bloglist=(List<BlogPortal>) session.createQuery("from BlogPortal where tags='"+tags+"'").list();
		return bloglist;
	}

	

	
}
