package com.demo.service;

import java.util.List;

import com.demo.bean.Course;


public interface CourseService {

	List<Course> getCourList(Course course);

	int addCourse(Course course);

	int delteCour(Course course);

	int updateCourse(Course course);

	Course getCourse(Course course);

}
