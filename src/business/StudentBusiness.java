package business;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import service.StudentService;

import bean.Student;

import database.DataSource;

public class StudentBusiness implements StudentService {
	public void addStudent(Student student) throws Exception {
		Connection cn = null;
		Statement stmt = null;
		try {
			cn = DataSource.getConnection();
			stmt = cn.createStatement();
			stmt.executeUpdate("insert into student(sid,sname,subject) values('"
					+ student.getSid()
					+ "','"
					+ student.getSname()
					+ "','"
					+ student.getSubject() + "')");
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				stmt.close();
				cn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

	public Collection<Student> allStudents() {
		ArrayList<Student> students = new ArrayList<Student>();// 创建集合对象
		// 从数据库中读取数据
		Connection connection = null;
		Statement statement = null;
		ResultSet rSet = null;
		try {
			connection = DataSource.getConnection();
			statement = connection.createStatement();
			rSet = statement.executeQuery("select * from student");
			while (rSet.next()) {
				Student student = new Student();
				student.setId(rSet.getInt("id"));
				student.setSid(rSet.getString("sid"));
				student.setSname(rSet.getString("sname"));
				student.setSubject(rSet.getString("subject"));
				students.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rSet.close();
				statement.close();
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return students;
	}

	public Student getStudentById(int id) throws Exception {
		Student student = null;
		// 从数据库获取数据
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement
					.executeQuery("select * from student where id=" + id);
			if (resultSet.next()) {
				student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setSid(resultSet.getString("sid"));
				student.setSname(resultSet.getString("sname"));
				student.setSubject(resultSet.getString("subject"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return student;
	}

	public void modifyStudent(Student student) throws Exception {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DataSource.getConnection();
			statement = connection.createStatement();
			String sqlString = "update student set sid='" + student.getSid()
					+ "',";
			sqlString += "sname='" + student.getSname() + "',";
			sqlString += "subject='" + student.getSubject() + "'";
			sqlString += "where id=" + student.getId();
			statement.executeUpdate(sqlString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteStudent(Student student) throws Exception {
		Connection connection = DataSource.getConnection();
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from student where id="
				+ student.getId());
	}

}
