package Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class EmpoyeeServiceImpl implements EmployeeService{

	EmployeeDao empdao=new EmployeeDaoImpl();
	@Override
	public List<Employee> getEmployeeList() {
		
		return empdao.getAllEmployee();
	}

	@Override
	public Integer insert(Employee employee) {
			
		return empdao.empInsert(employee);
	}

	@Override
	public Integer Remove(int Id) {
		int count=0;
		List<Employee>employee=empdao.getAllEmployee();
		Iterator<Employee>itr=employee.iterator();
		while(itr.hasNext()) {
			
			Employee employee2=itr.next();
			if(employee2.getId()==Id) {
			 count=1;
			}
			if(count>0){
				itr.remove();
				count=0;
			}
		}
		return 1;
	}

	@Override
	public Integer Update(int Id, Employee employee) {
			int status=1;
			EmployeeDao dao=new EmployeeDaoImpl();
			List<Employee>emplist=dao.getAllEmployee();
			Iterator<Employee>emp=emplist.iterator();
			while(emp.hasNext()) {
				Employee employee3=emp.next();
				if(employee3.getId()==employee.getId()) {
					status=1;
				}
				 if(status>0){
					 dao.empUpdate(Id, employee);
				}
				
			}
			
			
			
		return status;
	}

}
