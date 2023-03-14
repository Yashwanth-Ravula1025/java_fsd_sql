package Sampleprograms;

import java.util.*;

public class Pallindromestr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		String temp=str;
		for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt( i);
		
		
		}
	

	
	if(temp.equals(rev))	{
		System.out.println("pallindrome");
	}
	else {
		System.out.println("not pallindrome");
	}
		
	}
		// TODO Auto-generated method stub

	}



