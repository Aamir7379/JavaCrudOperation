package Dao;

import java.util.List;

import Bean.Employee;
import Database.EmpDatabase;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		
		return EmpDatabase.empList;
	}

	@Override
	public Integer empInsert(Employee employee) {
		EmpDatabase.empList.add(employee);
		return 1;
	}

	@Override
	public Integer empRemove(Integer Id) {
		EmpDatabase.empList.remove(Id);
		return 1;
	}

	@Override
	public Integer empUpdate(Integer Id, Employee employee) {
		
		EmpDatabase.empList.set(Id, employee);
		
		return 1;
	}

}
