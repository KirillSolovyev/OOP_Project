package project;
import java.util.HashSet;

public class Runner {

	public static void main(String[] args) {
		Employee e1 = new Employee("Test", "test12", "ex@ex.com");
		Employee e2 = new Employee("Test", "test12", "ex@ex.com", 100000, 20);
		HashSet<Employee> h = new HashSet<Employee>();
		h.add(e1);
		h.add(e2);
		h.add(e1);
		for(Employee e : h) {
			System.out.println(e);
		}
	}
}
