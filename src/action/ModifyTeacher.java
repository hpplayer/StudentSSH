package action;

import service.TeacherService;
import bean.Teacher;

import com.opensymphony.xwork2.ActionSupport;

public class ModifyTeacher extends ActionSupport {
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
			setTeacher(teacherService.getTeacherById(teacher.getId()));
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}
	}

}
