package Bean;

public class Employee {

	private int Id;
	private String name;
	private String email;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
	public Employee(int id, String name, String email) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
	}
	public Employee() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
}
