package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.bean.Course;
import com.demo.bean.CourseExample;
import com.demo.bean.CourseExample.Criteria;
import com.demo.dao.CourseDao;
import com.demo.service.CacheService;
import com.demo.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CacheService cacheService;
	
	@Autowired
	private CourseDao courseDao;

	/**
	 * 给某个教师的课程列表添加缓存，如果有缓存直接返回缓存结果，没有查询添加缓存
	 */
	@Cacheable(value="redisCache",key="#course.userId")
	@Override
	public List<Course> getCourList(Course course) {
		CourseExample example = new CourseExample();
		CourseExample.Criteria createCriteria = example.createCriteria();
		String userId = course.getUserId();
		if(userId!= null && userId!= ""){
			createCriteria.andUserIdEqualTo(userId);
		}
		List<Course> cours = courseDao.selectByExample(example);
		return cours;
	}
	
	
	/**
	 * 新增课程，并清除该教师下的课程列表缓存
	 */
	@CachePut(value="redisCache",key="#course.courId")
	@Override
	public int addCourse(Course course) {
		int insertSelective = courseDao.insertSelective(course);
		if(insertSelective > 0){
			cacheService.updateCourListCache(course);
		}
		return insertSelective;
	}

	/**
	 * 删除课程，删除课程缓存，更新教师课程列表缓存
	 */
	@CacheEvict(value="redisCache",key="#course.courId")
	@Override
	public int delteCour(Course course) {
		String courId = course.getCourId();
		int deleteNum = courseDao.deleteByPrimaryKey(courId );
		if(deleteNum>0){
			cacheService.updateCourListCache(course);
		}
		return deleteNum;
	}

	@CacheEvict(value="redisCache",key="#course.courId")
	@Override
	public int updateCourse(Course course) {
		
		int updateNum = courseDao.updateByPrimaryKeySelective(course);
		if(updateNum > 0){
			cacheService.updateCourListCache(course);
		}
		return updateNum;
	}
	
	@Cacheable(value="redisCache",key="#course.courId")
	@Override
	public Course getCourse(Course course) {
		return courseDao.selectByPrimaryKey(course.getCourId());
	}

}
