package project;

public class Mark {
	private Grade mark;
	private double gpa;
	private Student student;
	private String course;
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Grade getMark() {
		return mark;
	}

	public void setMark(Grade mark) {
		this.mark = mark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
