package project;
import java.util.HashSet;;

public class Runner {

	public static void main(String[] args) {
		Employee e1 = new Employee("Test1", "1234Qwerty", "test@test.com");
		Employee e2 = new Employee("Test2", "112233", "test@test2.com");
		HashSet<Employee> h = new HashSet<Employee>();
		System.out.println(e1.equals(e1));
	}
}
