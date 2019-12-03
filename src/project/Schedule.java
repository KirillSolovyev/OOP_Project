package project;

import java.util.Vector;

public class Schedule {
	Vector <String> lessons = new Vector <String>(); 
	private User user;
	
	public User getUser() {
		return user;
	}
	public void showSchedule()
	{
		System.out.println("Your Schedule:");
		for(int i = 0; i < lessons.size(); i++)
			System.out.println(lessons.get(i));
	}
	public void addLesson(String lesson)
	{
		lessons.add(lesson);
	}
}
