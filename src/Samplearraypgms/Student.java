package Samplearraypgms;

public class Student {
	String name;
	int mark;
	int rollno;


	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Meenu";
		s1.mark=56;
		s1.rollno=1;
		
		Student s2=new Student();
		s2.name="Amisha";
		s2.mark=45;
		s2.rollno=2;
        
		Student s3=new Student();
		s3.name="Devika";
		s3.mark=76;
		s3.rollno=3;
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for( int i=0;i<students.length;i++) {
			System.out.println(students[i].name +" "+students[i].mark);
		}
	}

}
