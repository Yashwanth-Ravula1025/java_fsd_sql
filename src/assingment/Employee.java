package assingment;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator {
	private String employeeid;
	private String employeename;
	private double employeesalary;

	public Employee(String id, String name, double salary) {
		this.employeeid = id;
		this.employeename = name;
		this.employeesalary = salary;
	}


	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getEmployeesalary() {
		return employeesalary;
	}


	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}


	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setSalary(double d) {
		// TODO Auto-generated method stub
		
	}




	
}
