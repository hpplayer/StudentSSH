package action;

import java.util.Collection;

import service.StudentService;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;

public class ViewStudents extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<Student> students;
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Collection<Student> getStudents() {
		return students;
	}

	public void setStudents(Collection<Student> students) {
		this.students = students;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			setStudents(studentService.allStudents());
			return SUCCESS;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}
	}
	

}
