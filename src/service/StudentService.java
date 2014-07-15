package service;

import java.util.Collection;

import bean.Student;

public interface StudentService {
	public void addStudent(Student student) throws Exception;

	public Collection<Student> allStudents() throws Exception;

	public Student getStudentById(int id) throws Exception;

	public void modifyStudent(Student student) throws Exception;

	public void deleteStudent(Student student) throws Exception;

}
