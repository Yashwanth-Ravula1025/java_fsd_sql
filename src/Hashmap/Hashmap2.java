package Hashmap;
import java.util.*;

 class Employee {
	private int id;
	private String name;
	private int age;
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
}public class Hashmap2 {
	public static void main(String[]args) {
		Employee emp=new Employee();
		emp.setId(12);
		emp.setName("Meenakshi");
		emp.setAge(25);
		emp.setDepartment("CS");
		
		HashMap<Integer,Employee>map=new HashMap<>();
		map.put(1,emp);
		Employee i=map.get(1);
		System.out.println("employee values are" +i.getAge());
		Employee i=map.remove(i)
		
		
	}
	
}
