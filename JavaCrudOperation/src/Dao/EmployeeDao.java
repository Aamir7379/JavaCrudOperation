package Dao;

import java.util.List;

import Bean.Employee;

public interface EmployeeDao {

	public List<Employee>getAllEmployee();
	public Integer empInsert(Employee emp);
	public Integer empRemove(Integer Id);
	public Integer empUpdate(Integer Id,Employee employee);
	
}
