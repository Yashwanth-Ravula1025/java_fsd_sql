package Sampleprograms;

import java.util.Scanner;

public class Swaptemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		int temp,c;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a after swapping is" +a);
		System.out.println("Value of b after swapping is" +b);
		
				
		// TODO Auto-generated method stub

	}

}
