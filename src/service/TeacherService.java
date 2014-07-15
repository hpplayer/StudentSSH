package service;

import java.util.Collection;

import bean.Teacher;

public interface TeacherService {
	public void addTeacher(Teacher teacher) throws Exception;

	public Collection<Teacher> allTeachers() throws Exception;

	public Teacher getTeacherById(int id) throws Exception;

	public void ModifyTeacher(Teacher teacher) throws Exception;

	public void DeleteTeacher(Teacher teacher) throws Exception;

}
