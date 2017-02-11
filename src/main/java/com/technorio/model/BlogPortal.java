package com.technorio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Proxy;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="blog")
@Proxy(lazy=false)
public class BlogPortal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long blogid;
	
	@Size(min=4, max=15,message = "Please Enter between 4 to 15 characters")
	@NotEmpty(message = "Please enter title for the article")
	private String title;
	
	@Column(length=4000)
	@NotEmpty(message = "Please write the article")
	private String article;
	
	@NotEmpty(message = "Please enter tags for the article")
	private String tags;

	public long getBlogid() {
		return blogid;
	}

	public void setBlogid(long blogid) {
		this.blogid = blogid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
}
