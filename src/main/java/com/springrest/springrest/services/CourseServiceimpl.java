package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	List<Course> list;
	
	
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java core course","this is basics of java"));
		list.add(new Course(14456,"spring course","this is basics rest api in java"));
		
	}

	public List<Course> getCources() {
		
		return list;
	}

	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	
	public Course updateCourse(long courseId, Course course) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==courseId) {
				list.set(i, course);
				return course;
			}
		}
		return null;
	}

	
	public String deleteCourse(long courseId) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==courseId) {
				list.remove(i);
				return "deleted";
			}
		}
		return "not found";
	}

}
