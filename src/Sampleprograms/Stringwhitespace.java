package Sampleprograms;
import java.util.*;

public class Stringwhitespace {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=str.replaceAll("\\s", "");
		System.out.println("The string after removing the white spaces is" +str2);
		// TODO Auto-generated method stub

	}

}
