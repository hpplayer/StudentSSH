package action;

import service.TeacherService;
import bean.Teacher;

import com.opensymphony.xwork2.ActionSupport;

public class ModifyTeacher1 extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Teacher teacher;
	private TeacherService teacherService;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			teacherService.ModifyTeacher(teacher);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (null == teacher.getTid() || "".equals(teacher.getTid())) {
			addFieldError("teacher.tid", "请输入教师职工号");
		}
		if (null == teacher.getTname() || "".equals(teacher.getTname())) {
			addFieldError("teacher.tname", "请输入教师姓名");
		}
	}

}
