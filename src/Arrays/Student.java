package Arrays;
import java.util.*;
public class Student {
	private int id;
	private String name;
	private int marks;
	private String department;

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.id=245098;
		s1.name="yashwanth";
		s1.marks=80;
		s1.department="cse";
		
		Student s2=new Student();
		s2.id=245498;
		s2.name="meghana";
		s2.marks=70;
		s2.department="ece";
		
		Student s3=new Student();
		s3.id=245068;
		s3.name="sowjanya";
		s3.marks=90;
		s3.department="civil";
		
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].id+ "," +students[i].name+ ","+students[i].marks+ "," +students[i].department);
		}
		
		
		
		
		
	
	}

}
