package com.lz.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.lz.test.model.Comment;

@Service("commentService")
public class CommentServiceImpl {

	@Autowired
	MongoTemplate template;
	
	public void save(Comment comment){
		template.insert(comment);
	}
	
	public Comment getById(Integer id){
		return template.findById(id, Comment.class);
	}
	
}
