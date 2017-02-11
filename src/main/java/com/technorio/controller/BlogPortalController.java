package com.technorio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.technorio.model.BlogPortal;
import com.technorio.service.BlogPortalService;

@Controller
public class BlogPortalController {

	@Autowired
	private BlogPortalService blogPortalService;
	
	@RequestMapping(value="/postarticle", method=RequestMethod.GET)
	public String loadArticleForm(Model model){
		
		return "blogform";
	}
	
	@RequestMapping(value="/postarticle", method=RequestMethod.POST)
	public String postArticle(@Valid @ModelAttribute BlogPortal blog,BindingResult result,Model model){
		 if(result.hasErrors()){
			  return "blogform";
		  }
		
		this.blogPortalService.postArticle(blog);
		return "redirect:/articles";
	}
	
	@RequestMapping(value="/articles",method=RequestMethod.GET)
	public String allArticles(Model model){
		model.addAttribute("bloglist", this.blogPortalService.getAllBlogs());
		return "articles";
	}
	
	
	@RequestMapping(value="/articles/{blogid}",method=RequestMethod.GET)
	public String getArticleById(Model model,@PathVariable long blogid){
		model.addAttribute("blog", this.blogPortalService.getBlogById(blogid));
		return "blog";
	}
	
	@RequestMapping(value="/{tags}/articles",method=RequestMethod.GET)
	public String getArticleByTags(Model model,@PathVariable String tags){
		model.addAttribute("bloglist", this.blogPortalService.getBlogBytags(tags));
		return "tags";
	}
}
