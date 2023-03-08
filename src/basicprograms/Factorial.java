package basicprograms;

public class Factorial {
	
	
	//public static int fact(int n) {
		//if(n==0)
			// return 1;
	 // 	else 
	//		return n*fact(n-1);
		
//	}

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
