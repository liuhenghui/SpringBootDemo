package com.demo.service;

import java.util.List;

import com.demo.bean.Course;

public interface CacheService {

	List<Course> updateCourListCache(Course course);

}
