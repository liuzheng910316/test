package com.lz.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lz.test.model.User;
import com.lz.test.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value="/add")
//	@ResponseBody
	public void addUser(
//			@RequestParam(name="name")String name,
//			@RequestParam(name="password")
//			@Length(min=6,max=16,message="密码长度在6-16位之间")String password,
//			@RequestParam(name="email")String email,
//			@RequestParam(name="mobile")String mobile,
//			@Min(value=18) Integer age,
			@Validated User user,
			HttpServletRequest req,HttpServletResponse resp) throws Exception{
//		User user = new User();
//		user.setEmail(email);
//		user.setMobile(mobile);
//		user.setName(name);
//		user.setPassword(password);
		userService.addUser(user);
		resp.getWriter().print("创建用户成功");
	}
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
//	@ResponseBody
	public void getUser(
			@RequestParam(name="id") int id,
			HttpServletRequest req,HttpServletResponse resp) throws Exception{
		User user = userService.getUserById(id);
		String email = "email:"+user.getEmail();
		String name = "name:"+user.getName();
		String mobile = "mobile:"+user.getMobile();
		resp.getWriter().print(email+";"+name+";"+mobile);
//		return email;
	}
}
