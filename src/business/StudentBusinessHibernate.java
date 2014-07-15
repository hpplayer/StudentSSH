package business;

import java.util.Collection;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Student;
import service.StudentService;
import util.HibernateUtil;

public class StudentBusinessHibernate implements StudentService{
	private Session session;

	public StudentBusinessHibernate() {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		this.session = sessionFactory.openSession();
	}

	@Override
	public void addStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
	}

	@Override
	public Collection<Student> allStudents() throws Exception {
		// TODO Auto-generated method stub
		session.clear();
		String hqlString="from Student";
		Query query=session.createQuery(hqlString);
		@SuppressWarnings("unchecked")
		List<Student> students=query.list();
		return students;
	}

	@Override
	public Student getStudentById(int id) throws Exception {
		// TODO Auto-generated method stub
		session.clear();
		Student student=null;
		String hqlString="from Student where id=?";
		Query query=session.createQuery(hqlString);
		query.setInteger(0, id);
		student=(Student)query.uniqueResult();
		return student;
		}

	@Override
	public void modifyStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction=session.beginTransaction();
		String hqlString="update Student set sid=?,sname=?,subject=? where id=?";
		Query query=session.createQuery(hqlString);
		query.setString(0, student.getSid());
		query.setString(1, student.getSname());
		query.setString(2, student.getSubject());
		query.setInteger(3, student.getId());
		query.executeUpdate();
		transaction.commit();
	}

	@Override
	public void deleteStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction=session.beginTransaction();
		String hqlString="delete Student where id=?";
		Query query=session.createQuery(hqlString);
		query.setInteger(0, student.getId());
		query.executeUpdate();
		transaction.commit();
	}

}
