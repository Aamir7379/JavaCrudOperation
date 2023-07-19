package Service;

import java.util.List;

import Bean.Employee;

public interface EmployeeService {

	public List<Employee>getEmployeeList();
	public Integer insert(Employee employee);
	public Integer Remove(int Id);
	public Integer Update(int Id,Employee employee);
}
