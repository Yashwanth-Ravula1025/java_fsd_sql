package Array;

public class Maxnumber {

	public static void main(String[] args) {
		int array[]= {5,3,8,1,7,2};
		int max=array[0];
		for(int i=1;i<array.length;i++) {//compare all elements with length
			if(array[i]>max) {
				max=array[i];
			}
		}
	System.out.println("print the max number" + max);	
		
		// TODO Auto-generated method stub

	}

}
