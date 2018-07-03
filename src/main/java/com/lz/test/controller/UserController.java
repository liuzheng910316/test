package com.lz.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lz.test.model.User;
import com.lz.test.service.impl.UserServiceImpl;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value="/add")
//	@ResponseBody
	public void addUser(@ModelAttribute User user,
			HttpServletRequest req,HttpServletResponse resp) throws Exception{
		userService.addUser(user);
		resp.getWriter().print("创建用户成功");
	}
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
//	@ResponseBody
	public User getUser(
			@RequestParam(name="id") int id) throws Exception{
		User user = userService.getUserById(id);
		return user;
	}
}
