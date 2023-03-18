package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCources();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(long courseId,Course course);
	public String deleteCourse(long courseId);
}
