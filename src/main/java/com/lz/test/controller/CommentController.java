package com.lz.test.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
	
	@RequestMapping(value="/get/all")
	public void getCommentByUserId(
			HttpServletResponse response) throws IOException{
		List<Comment> list = commentService.getAll();
		String info="";
		for(Comment comment:list){
			info+=comment.getInfo()+" ";
		}
		response.getWriter().println(info);
	}
	
	@RequestMapping(value="/create")
	public void create(Integer userid,String info,
			HttpServletResponse response) throws IOException{
		commentService.save(new Comment(userid,info,new Date()));
		response.getWriter().println(info);
	}
}
