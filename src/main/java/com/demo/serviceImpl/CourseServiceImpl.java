package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Course;
import com.demo.bean.CourseExample;
import com.demo.dao.CourseDao;
import com.demo.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourList(Course course) {
		
		CourseExample example = new CourseExample();
		List<Course> cours = courseDao.selectByExample(example);
		
		return cours;
	}
}
