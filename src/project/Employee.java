package project;

public class Employee extends User{
	private int salary = 50000;
	private int workExperience = 0;
	
	public Employee(String name, String password, String email) {
		super(name, password, email);
	}
	
	public Employee(String name, String password, String email, int salary, int workExperience) {
		super(name, password, email);
		setSalary(salary);
		setWorkExperience(workExperience);
	}
	
	private void setSalary(int salary) {
		if(salary < 0) throw new Error("Salary can't be negative");
		this.salary = salary;
	}
	
	private void setWorkExperience(int workExperience) {
		if(workExperience < 0) throw new Error("Work experience can't be negative");
		this.workExperience = workExperience;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getWorkExperience() {
		return workExperience;
	}
	
	public String toString() {
		return super.toString() + " salary: " + salary + " work experience: " + workExperience;
	}
}
