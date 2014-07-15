package business;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Course;
import service.CourseService;
import util.HibernateUtil;

public class CourseBusinessHibernate implements CourseService {
	private Session session;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public CourseBusinessHibernate() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
	}

	@Override
	public void addCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(course);
		transaction.commit();

	}

	@Override
	public Collection<Course> allCourses() throws Exception {
		// TODO Auto-generated method stub
		session.clear();
		String hqlString = "from Course";
		Query query = session.createQuery(hqlString);
		@SuppressWarnings("unchecked")
		List<Course> courses = query.list();
		return courses;
	}

	@Override
	public Course getCourseById(int id) throws Exception {
		// TODO Auto-generated method stub
		session.clear();
		Course course = null;
		String hqlString = "from Course where id=?";
		Query query = session.createQuery(hqlString);
		query.setInteger(0, id);
		course = (Course) query.uniqueResult();
		return course;
	}

	@Override
	public void modifyCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		String hqlString = "update Course set cid=?,cname=?,kkxq=?,xs=?,xf=? where id=?";
		Query query = session.createQuery(hqlString);
		query.setString(0, course.getCid());
		query.setString(1, course.getCname());
		query.setString(2, course.getKkxq());
		query.setString(3, course.getXs());
		query.setString(4, course.getXf());
		query.setInteger(5, course.getId());
		query.executeUpdate();
		transaction.commit();

	}

	@Override
	public void deleteCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		String hqlString = "delete Course where id=?";
		Query query = session.createQuery(hqlString);
		query.setInteger(0, course.getId());
		query.executeUpdate();
		transaction.commit();
	}

}
