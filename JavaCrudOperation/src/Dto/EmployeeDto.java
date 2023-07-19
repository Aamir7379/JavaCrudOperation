package Dto;

import Bean.Employee;
import Service.EmployeeService;
import Service.EmpoyeeServiceImpl;

public class EmployeeDto {

	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmpoyeeServiceImpl();
		employeeService.getEmployeeList().forEach(System.out::println);
		
		//-------------------------------------------------------------------------
		
		System.out.println("After save employee Data");
		
		Employee employee=new Employee();
		employee.setId(5);
		employee.setName("mozzam");
		employee.setEmail("mozzam@gmail.com");
		employeeService.insert(employee);
		employeeService.getEmployeeList().forEach(System.out::println);
	
		//-------------------------------------------------------------------------
		
		System.out.println("After Remove EmpData");
		Integer Id=3;
		int count=employeeService.Remove(Id);
		if(count==0) {
			System.out.println("Id Not found Exception");
		}
		else {
			System.out.println("Successfully Delete " +Id);
			employeeService.getEmployeeList().forEach(System.out::println);
		}
		
		//-------------------------------------------------------------------------
		
		System.out.println("After update");
		
		Employee updt=new Employee();
		updt.setId(2);
		updt.setName("Man");
		updt.setEmail("Man@gmail.com");
		
		employeeService.Update(1, updt);
		employeeService.getEmployeeList().forEach(System.out::println);
	}
}
