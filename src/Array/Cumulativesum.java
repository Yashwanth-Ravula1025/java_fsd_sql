package Array;
import java.util.*;

public class Cumulativesum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int length=sc.nextInt();
		//two array need to created
		int[] array=new int[length];
		int[] cm=new int[length];
		int sum=0;
		//tell the user to add the elements of array
		System.out.println("enter the elements of the array");
		for(int i=0;i<length;i++)
		{
			array[i]=sc.nextInt();
			sum+=array[i];
			cm[i]=sum;
		}
		System.out.println("the final result is");
		for(int i=0;i<length;i++){
			System.out.println(cm[i] + " ");
		}
		// TODO Auto-generated method stub

	}

}
