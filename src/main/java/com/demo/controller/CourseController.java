package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.bean.Course;
import com.demo.service.CourseService;

@Controller
@RequestMapping(value="/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/getCourList",method=RequestMethod.GET)
	public String getCourList(Course course,ModelMap mp){
		List<Course> list = courseService.getCourList(course);
		mp.put("courList", list);
		return "courList";
	}
	
}
