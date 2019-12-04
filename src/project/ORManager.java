package project;
import java.util.Vector;

public class ORManager {
	private String login;
	private String id;
	Vector<Course> regCourses = new Vector();
	Vector<Schedule> makeSchedule = new Vector();
	
	public void addCoursesForReg(Course course)
	{
		regCourses.add(course);
	}
	public void addLessons(Schedule sch)
	{
		makeSchedule.add(sch);
	}
	public void updateUserInfo(String login, String id)
	{
		this.id = id;
		this.login = login;
	}
}
