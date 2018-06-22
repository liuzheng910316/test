package com.lz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lz.test.model.Comment;
import com.lz.test.service.impl.CommentServiceImpl;

@Controller
@RequestMapping(value="/comment")
public class CommentController {

	@Autowired
	CommentServiceImpl commentService;
	
	@RequestMapping(value="/get/{id}")
	public void getCommentById(@PathVariable Integer id){
		Comment comment = commentService.getById(id);
		
	}
}
