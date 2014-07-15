package action;

import java.util.Collection;

import service.CourseService;

import bean.Course;

import com.opensymphony.xwork2.ActionSupport;

public class ViewCourses extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<Course> courses;
	private CourseService courseService;

	public Collection<Course> getCourses() {
		return courses;
	}

	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			setCourses(courseService.allCourses());
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
