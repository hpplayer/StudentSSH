package action;

import service.StudentService;
import bean.Student;
import com.opensymphony.xwork2.ActionSupport;

public class AddStudent extends ActionSupport {
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
		try{
			studentService.addStudent(student);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(null==student.getSid()||"".equals(student.getSid())){
			addFieldError("student.sid", "请输入学号");
		}
		if(null==student.getSname()||"".equals(student.getSname())){
			addFieldError("student.sname", "请输入姓名");
		}
		if(null==student.getSubject()||"".equals(student.getSubject())){
			addFieldError("student.subject", "请输入专业");
		}
	}
	

}
