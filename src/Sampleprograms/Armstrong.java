package Sampleprograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0,remainder,temp;
	temp=num;
	while(num!=0) {
		remainder=num%10;
		sum=sum+(remainder*remainder*remainder);
		num=num/10;
		
	}
	if(sum==temp) {
		System.out.println("armstrong" +sum);
	}
	else {
		System.out.println("not armstrong");
	}
	}
	
}

