package Database;

import java.util.ArrayList;
import java.util.List;

import Bean.Employee;

public class EmpDatabase {

	public static List<Employee>empList=new ArrayList<Employee>();
	
	static {
		empList.add(new Employee(1,"Ziyad","Ziyad@gmail.com"));
		empList.add(new Employee(2,"Manshad","manshad@gmail.com"));
		empList.add(new Employee(3,"delete","delete@gmail.com"));
		empList.add(new Employee(4,"majid","majid@gmail.com"));

	

	}
}
