package com.ontarioinc.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;
	}


	public Course getCourseById(String id) {
		return courseRepository.findById(id).get();
	}


	public void addCourse(Course t) {
		courseRepository.save(t);
	}


	public void updateCourse(Course course) {
		courseRepository.save(course);
	}


	public void deleteCourseById(String id) {
		courseRepository.deleteById(id);
	}
}
