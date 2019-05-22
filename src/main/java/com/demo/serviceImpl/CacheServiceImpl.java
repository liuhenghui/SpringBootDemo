package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import com.demo.bean.Course;
import com.demo.bean.CourseExample;
import com.demo.dao.CourseDao;
import com.demo.service.CacheService;

@Service
public class CacheServiceImpl implements CacheService{
	
	@Autowired
	private CourseDao courseDao;

	
	@CachePut(value="redisCache",key="#course.userId")
	@Override
	public List<Course> updateCourListCache(Course course) {
		CourseExample example = new CourseExample();
		List<Course> cours = courseDao.selectByExample(example);
		return cours;
	}

}
