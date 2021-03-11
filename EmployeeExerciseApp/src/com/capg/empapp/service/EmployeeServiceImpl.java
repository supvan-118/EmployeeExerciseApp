package com.capg.empapp.service;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
import com.capg.empapp.execptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
   // Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
			//System.out.println(" ------------>> inside service "+e);
		
			if(e.getSalary()> 50000)
			{
				throw new WrongSalaryException();
			}
			else return dao.addEmployee(e);		
		
	}

	public Employee[] getAllEmployees() {

		return dao.getAllEmployees();
	}
	
	
	// ================================================================================

	public boolean editSalaryByEmployeeId(int id,int empSal1) throws InvalidEmployeeIdExcption {
		if(!dao.editSalaryByEmployeeId(id,empSal1))
		{
			throw new InvalidEmployeeIdExcption();
		}
		else return dao.editSalaryByEmployeeId(id,empSal1);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIdExcption {
		if(!dao.editExpByEmployeeId(id,empNewExp))
		{
			throw new InvalidEmployeeIdExcption();
		}
		else return dao.editExpByEmployeeId(id,empNewExp);
	}

	public Employee[] getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}
	public Employee[] getEmployessByExperience(int exp) {
		// TODO Auto-generated method stub
		return dao.getEmployeeByExperience(exp);
	}

}