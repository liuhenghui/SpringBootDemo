package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.User;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping(value="/userList",method=RequestMethod.GET)
	public List<User> getUserList(){
		User user = new User();
		user.setId("11111");
		user.setName("zhangsan");
		User user2 = new User();
		user2.setId("22222");
		user2.setName("lisi");
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		return list;
	}

}
