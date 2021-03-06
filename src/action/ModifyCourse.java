package action;

import service.CourseService;
import bean.Course;

import com.opensymphony.xwork2.ActionSupport;

public class ModifyCourse extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Course course;
	private CourseService courseService;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
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
			setCourse(courseService.getCourseById(course.getId()));
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

	}

}
