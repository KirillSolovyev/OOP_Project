package project;
import java.util.UUID; // For generating unique ID

public abstract class User {
	private String name;
	private String id;
	private String email;
	private String password;
	
	public User(String name, String password, String email) {
		setName(name);
		setPassword(password);
		setEmail(email);
		setId();
	}
	
	private void setName(String name) {
		if(name.length() < 2) throw new Error("Too short name");
		this.name = name;
	}
	
	private void setPassword(String password) {
		if(password.length() < 6) throw new Error("Too short password");
		this.password = password;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	private void setId() {
		id = UUID.randomUUID().toString();  // Generating of unique ID
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return id + ":: " + name + " " + email;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + name.hashCode();
		result = prime * result + id.hashCode();
		result = prime * result + password.hashCode();
		return result;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof User)) return false;
		User u = (User)obj;
		return this.id.equals(u.id);
	}
}
