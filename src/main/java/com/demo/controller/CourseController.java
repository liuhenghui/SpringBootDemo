package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.Course;
import com.demo.redis.RedisServiceImpl;
import com.demo.service.CourseService;

@Controller
@RequestMapping(value="/course")
public class CourseController {

	@Autowired
    private RedisServiceImpl redisService;
	
	@Autowired
	private CourseService courseService;
	
	/**
	 * 获取课程列表
	 * @param course
	 * @param mp
	 * @return
	 */
	@RequestMapping(value="/getCourList",method=RequestMethod.GET)
	public String getCourList(Course course,ModelMap mp){
		List<Course> list = courseService.getCourList(course);
		mp.put("courList", list);
		return "courList";
	}
	
	/**
	 * 跳转表单页面，根据课程编号是否为空判断
	 * @param course
	 * @param mp
	 * @return
	 */
	@RequestMapping(value="/courInput",method=RequestMethod.GET)
	public String courAdd(Course course,ModelMap mp){
		if(course != null && course.getCourId() != null && course.getCourId() != ""){
			Course course2 = courseService.getCourse(course);
			mp.put("course", course2);
		}
		System.out.println(course);
		return "add";
	}
	
	/**
	 * 新增课程，放课程详情缓存，更新列表缓存
	 * @param course
	 * @param mp
	 * @return
	 */
	@RequestMapping(value="/addCour",method=RequestMethod.POST)
	public String Addcour(Course course,ModelMap mp){
		String userId = "t0001";//应该session获取
		course.setCourId(System.currentTimeMillis()+"");
		course.setUserId(userId);
		courseService.addCourse(course);
		return "redirect:/course/getCourList?userId="+userId;
	}
	
	/**
	 * 放课程详情缓存，更新列表缓存
	 * @param course
	 * @param mp
	 * @return
	 */
	@RequestMapping(value="/updateCour",method=RequestMethod.POST)
	public String updateCour(Course course,ModelMap mp){
		course.setUserId("t0001");
		courseService.updateCourse(course);
		return "redirect:/course/getCourList?userId=t0001";
	}
	
	/**
	 * 课程删除 删除详情缓存，更新列表缓存
	 * @param course
	 * @param mp
	 * @return
	 */
	@RequestMapping(value="/deleteCour",method=RequestMethod.GET)
	public String deleteCour(Course course,ModelMap mp){
		course.setUserId("t0001");
		courseService.delteCour(course);
		return "redirect:/course/getCourList?userId=t0001";
	}
	
	
	
	
	
	//==================== redisTemplate 测试 =========================
	@RequestMapping(value="/setCourVal",method=RequestMethod.GET)
	public void setCourVal(String val){
		redisService.set("testkey", val);
	}
	
	@ResponseBody
	@RequestMapping(value="/getCourVal",method=RequestMethod.GET)
	public String getCourVal(String val){
		return redisService.get("testkey");
	}
	
	
	
}
