package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.Course;
import com.demo.service.CourseService;

@Controller
@RequestMapping(value="/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@ResponseBody
	@RequestMapping(value="/getCourList",method=RequestMethod.GET)
	public List<Course> getCourList(Course course){
		return courseService.getCourList(course);
	}
	
	
	
}
