package Functioninterface;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	

	public static void main(String[] args) {
		Employee e1=new Employee("123","sasi",100000);
		Employee e2=new Employee("456","devika",10000);
		Employee e3=new Employee("789","meenakshi",50000);
		List<Employee>em=Arrays.asList(e1,e2,e3);
		List<Employee>updated=em.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).peek(t->{
			double salary=t.getSalary();
			if(salary>100000) {
				t.setSalary(salary*1.05);
			}
			else if(salary>50000) {
				t.setSalary(salary*1.1);
			}
		}).collect(Collectors.toList());
		updated.forEach(t->System.out.println(t.getName()+""+t.getSalary()));
		
		// TODO Auto-generated method stub

	}

}
