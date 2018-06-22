package com.lz.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.lz.test.model.Comment;

@Service("commentService")
public class CommentServiceImpl {

	@Autowired
	MongoTemplate template;
	
	public void save(Comment comment){
		template.insert(comment);
	}
	
	public List<Comment> getAll(){
		return template.findAll(Comment.class);
	}
	
}
