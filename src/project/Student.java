package project;
import java.util.Date;

public class Student extends User{
	private Date entranceYear;
	private Date studyYear;
	private String faculty;
	private double gpa;
	private Mark mark;
	
	public Student(String name, String password, String email) {
		super(name, password, email);
		// TODO Auto-generated constructor stub
	}


	public Date getEntranceYear() {
		return entranceYear;
	}


	public void setEntranceYear(Date entranceYear) {
		this.entranceYear = entranceYear;
	}


	public Date getStudyYear() {
		return studyYear;
	}


	public void setStudyYear(Date studyYear) {
		this.studyYear = studyYear;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public Mark getMark() {
		return mark;
	}


	public void setMark(Mark mark) {
		this.mark = mark;
	}
	

}
