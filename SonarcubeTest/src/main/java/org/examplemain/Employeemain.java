package org.examplemain;

import java.util.ArrayList;
import java.util.List;

public class Employeemain {

	public static void main(String[] args) {
	Employee e1=new Employee("yashwanth",23,5,50000);
	Employee e2=new Employee("mennu",21,6,60000);
	Employee e3=new Employee("yash",25,7,70000);
	 List<Employee> employees = new ArrayList<Employee>();
	 employees.add(e1);
	 employees.add(e2);
	 employees.add(e3);
	 employees.stream().forEach(
			 val -> {
				 if(val.getYears()>=1 &&  val.getYears()<=2) {
					 double newsalary=val.getSalary() +(val.getYears()*2.5/100);
					 val.setSalary(newsalary);
				 }
				  if(val.getYears()>=3 &&  val.getYears()<=6) {
					 double newsalary=val.getSalary() +(val.getYears()*5.0/100);
					 val.setSalary(newsalary);
				 
			 }
				 else if(val.getYears()>=7 &&  val.getYears()<=10) {
					 double newsalary=val.getSalary() +(val.getYears()*10.0/100);
					 val.setSalary(newsalary);
				 }
				 else if(val.getYears()>=10) {
					 double newsalary=val.getSalary() +(val.getYears()*12/100);
					 val.setSalary(newsalary);

				 	}
			 }
	);
	 employees.forEach(val->
	 System.out.println(val.getSalary()));
}
}
