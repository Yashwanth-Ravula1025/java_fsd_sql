package Samplearraypgms;
import java.util.*;

public class Copyarray {

	public static void main(String[] args) {
	 int a1[]= new int[4];
	 a1[0]=1;
	 a1[1]=2;
	 a1[2]=3;
	 a1[3]=4;
	 int a2[]= new int[a1.length];
	System.out.println("Elements in 1st array:");
	 for(int i=0;i<a1.length;i++) {
		 
		 System.out.println(a1[i] + " ");
		 
	 }
	 System.out.println("Elements in the 2nd array:");
	 for(int i=0;i<a1.length;i++) {
		 a2[i]=a1[i];
		 System.out.print(a2[i] + " ");
	
	}

	}
}
	 
	 
	


