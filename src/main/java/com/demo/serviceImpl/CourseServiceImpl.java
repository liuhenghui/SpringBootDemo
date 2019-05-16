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
		CourseExample.Criteria criteria = example.createCriteria();
		
		List<Course> cours = courseDao.selectByExample(example);
		
		return cours;
	}

	@Override
	public int addCourse(Course course) {
		return courseDao.insert(course);
	}

	@Override
	public int delteCour(Course course) {
		String courId = course.getCourId();
		return courseDao.deleteByPrimaryKey(courId );
	}

	@Override
	public int updateCourse(Course course) {
		return courseDao.updateByPrimaryKeySelective(course);
	}

	@Override
	public Course getCourseDtlById(String courId) {
		return courseDao.selectByPrimaryKey(courId);
	}


	
}
