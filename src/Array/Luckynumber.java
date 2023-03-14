package Array;

import java.util.Scanner;

public class Luckynumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit;
		int flag1=0;
		int flag2=0;
		int flag3=0;
		while(num>0) {
			digit=num%10;
			if(digit==3) {
				flag1=1;
			}
			if(digit==6) {
				flag2=1;
			}
			if(digit==9) {
				flag3=1;
			}
			num=num/10;
		}
		if(flag1==1 & flag2==1 & flag3==1) {
			System.out.println("luckynumber");
		}
		else {
			System.out.println("not luckynumber");
		}
		// TODO Auto-generated method stub

	}

}
