package UST_BATCHNO_3.JUNIT5_TESTCASES;

public class EmployeeOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int countingcoins(int n) {
		
		if(n<=80 && n>=1)
		{
			return 5;
		}
		else if(n>=81 && n<=172)
		{
		return 3;
	}
		else if(n>=173 && n<=266)
		{
		return 1;
	}
		else
		{
		return 0;
	}

}
}
