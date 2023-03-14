package Samplearraypgms;
import java.util.*;

public class Frequencyofeachelement {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		int f[]=new int[a.length];
		System.out.println("Enter the elements in array");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			 a[i]=s.nextInt();
		}
		int v=-1;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					f[j]=-1;
				}
			}
			if (f[i]!=v){
				f[i]=count;
			}
		}
		System.out.println("Elements : Frequency");
		for(int i=0;i<f.length;i++) {
			if(f[i]!=v) {
				System.out.println(" " +a[i] + " " + f[i]);
			}
		}
		
		
	

	}

}
