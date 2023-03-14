package Sampleprograms;
import java.util.*;
public class Countvowelscont {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){
			vcount++;
		}
		else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z') {
			ccount++;
			
		}
		}System.out.println("vowels" +vcount);
		System.out.println("constraints" +ccount);
		
		
		// TODO Auto-generated method stub

	}

}
