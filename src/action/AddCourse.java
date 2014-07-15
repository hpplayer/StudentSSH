package action;

import service.CourseService;
import bean.Course;

import com.opensymphony.xwork2.ActionSupport;

public class AddCourse extends ActionSupport {
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
			courseService.addCourse(course);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (null == course.getCid() || "".equals(course.getCid())) {
			addFieldError("course.cid", "请输入课程号");
		}
		if (null == course.getCname() || "".equals(course.getCname())) {
			addFieldError("course.cname", "请输入课程名");
		}
		if (null == course.getKkxq() || "".equals(course.getKkxq())) {
			addFieldError("course.kkxq", "请输入开课学期");
		}
		if (null == course.getXs() || "".equals(course.getXs())) {
			addFieldError("course.xs", "请输入课程学时");
		}
		if (null == course.getXf() || "".equals(course.getXf())) {
			addFieldError("course.xf", "请输入课程学分");
		}
	}

}
