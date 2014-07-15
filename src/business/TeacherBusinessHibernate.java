package business;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Teacher;
import service.TeacherService;
import util.HibernateUtil;

public class TeacherBusinessHibernate implements TeacherService {
	private Session session;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public TeacherBusinessHibernate() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public void addTeacher(Teacher teacher) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(teacher);
		transaction.commit();
	}

	@Override
	public Collection<Teacher> allTeachers() throws Exception {
		// TODO Auto-generated method stub
		session.clear();
		String hqlString = "from Teacher";
		Query query = session.createQuery(hqlString);
		@SuppressWarnings("unchecked")
		List<Teacher> teachers = query.list();
		return teachers;
	}

	@Override
	public Teacher getTeacherById(int id) throws Exception {
		// TODO Auto-generated method stub
		session.clear();
		Teacher teacher;
		String hqlString = "from Teacher where id=?";
		Query query = session.createQuery(hqlString);
		query.setInteger(0, id);
		teacher = (Teacher) query.uniqueResult();
		return teacher;

	}

	@Override
	public void ModifyTeacher(Teacher teacher) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		String hqlString = "update Teacher set tid=?,tname=? where id=?";
		Query query = session.createQuery(hqlString);
		query.setString(0, teacher.getTid());
		query.setString(1, teacher.getTname());
		query.setInteger(2, teacher.getId());
		query.executeUpdate();
		transaction.commit();
		

	}

	@Override
	public void DeleteTeacher(Teacher teacher) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		String hqlString = "delete Teacher where id=?";
		Query query = session.createQuery(hqlString);
		query.setInteger(0, teacher.getId());
		query.executeUpdate();
		transaction.commit();

	}

}
