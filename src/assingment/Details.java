/**
 * 
 */
package assingment;
import java.util.*;
import java.util.stream.Collectors;

public class Details {

	public static void main(String[] args) {
	
		List<Employee> p=new ArrayList<>();
		
		p.add(new Employee(123,"yashwanth",10000));
		p.add(new Employee(121,"meghana",60000));
		p.add(new Employee(113,"sowjanya",900000));
		
		 List<Employee> updatedEmployees= p.stream()
				 .filter(employee->employee.getSalary() <=200000)
				 .sorted(Comparator.comparing(Employee::getSalary).reversed())
				 .peek(employee -> {
					 double salary=employee.getSalary();
					 if(salary > 100000) {
						 employee.setSalary(salary * 1.05);
					 } else if(salary>50000) {
						 employee.setSalary(salary * 1.1);
					 }
				 })
				 .collect(Collectors.toList());
		 
		 System.out.println(updatedEmployees);
				 
	}

}
