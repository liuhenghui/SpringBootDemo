package com.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.User;

@Controller
@RequestMapping(value="/")
public class PageController {

	 @Autowired
	 private ServletContext act;

	@RequestMapping(value="/index")
	public String index(ModelMap mp,HttpServletRequest httpServletRequest,HttpServletResponse resp, HttpSession session){
		
		User user = new User();
		user.setId("00001");
		user.setName("亚瑟");
		user.setAge(18);
		user.setIsAdmin(true);
		user.setChildren(new ArrayList<>());
		user.setRole("1");
		
		User user2 =  new User("0002","后裔",19,false,"男");
		user2.setRole("2");
		
		List<User> children = new ArrayList<>();
		children.add(user);
		children.add(user2);
		//条件判断时演示使用
		user2.setChildren(children);
		
		//迭代演示使用
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user2);
		
		//application 域
		act.setAttribute("appName", "webDemo");
		
		//session 域
		session.setAttribute("suser", user);
		
		//request 域
		mp.put("welcome", "hello thymeleaf");
		mp.put("welcome2", "hello <b>thymeleaf</b>");
		mp.put("users", users);
		mp.put("admin", "1");
		mp.put("user", user);
		httpServletRequest.setAttribute("today", new Date());
		httpServletRequest.setAttribute("req","httpServletRequestVal");
		return "index";
	}
}
