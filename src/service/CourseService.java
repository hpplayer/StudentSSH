package service;

import java.util.Collection;

import bean.Course;

public interface CourseService {
	public void addCourse(Course course) throws Exception;

	public Collection<Course> allCourses() throws Exception;

	public Course getCourseById(int id) throws Exception;

	public void modifyCourse(Course course) throws Exception;

	public void deleteCourse(Course course) throws Exception;

}
