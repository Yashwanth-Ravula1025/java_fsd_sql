
package Array;

public class Count {

	public static void main(String[] args) {
		int array[]= {4,-4,6,8,-9,0,4,-7,56};
		int pcount=0;
		int ncount=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
				ncount++;
			}
			else {
				pcount++;
			}
		}
		System.out.println("count of negative nos" + ncount + "count of positive nos" + pcount);
	}
		// TODO Auto-generated method stub

	

}
