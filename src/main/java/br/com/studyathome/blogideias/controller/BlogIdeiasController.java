package br.com.studyathome.blogideias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.studyathome.blogideias.model.Post;
import br.com.studyathome.blogideias.services.BlogIdeiasService;

@Controller // stereotype para web controller do spring
public class BlogIdeiasController {

	BlogIdeiasService service;

	@Autowired
	public BlogIdeiasController(BlogIdeiasService service) {
		this.service = service;
	}

	
	// /posts -> URI de acesso e o tipo de Requisição = RequestMethod.GET
	@RequestMapping(value = "/posts", method = RequestMethod.GET )
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = service.findAll();
		mv.addObject("posts", posts);

		return mv;
	}
	
	

}
