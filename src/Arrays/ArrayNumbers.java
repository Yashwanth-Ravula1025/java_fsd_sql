package Arrays;

import java.util.Scanner;

public class ArrayNumbers {

	public static void main(String[] args) {
	
		int num[][]=new int[4][4];
		num[0][0]=6;
		num[0][1]=8;
		num[1][0]=9;
		num[1][1]=5;

		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i][0]);
		}
		

	}

}
