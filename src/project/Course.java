package project;

public class Course {
	private String courseTitle;
	private String courseID;
	private int courseYear;
	private int creditsNumber;
	private String semesterType;
	public int getCreditsNumber() {
		return creditsNumber;
	}
	public void setCreditsNumber(int creditsNumber) {
		this.creditsNumber = creditsNumber;
	}
	public String getSemesterType() {
		return semesterType;
	}
	public void setSemesterType(String semesterType) {
		this.semesterType = semesterType;
	}
	public int getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(int courseYear) {
		this.courseYear = courseYear;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
}
