package Sampleprograms;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0,temp,remainder;
		temp=num;
		while(num!=0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		if(reverse==temp) {
			System.out.println("Pallindrome" + num);
		}
		else {
			System.out.println("Not pallindrome");
		}
		// TODO Auto-generated method stub

	}

}
