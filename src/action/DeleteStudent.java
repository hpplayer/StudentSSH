package action;

import service.StudentService;
import bean.Student;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteStudent extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private StudentService studentService;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			studentService.deleteStudent(student);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
