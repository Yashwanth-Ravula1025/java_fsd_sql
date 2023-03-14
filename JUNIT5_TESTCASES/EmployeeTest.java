package UST_BATCHNO_3.JUNIT5_TESTCASES;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	



	@Test
	public void coins(){
		
		int input=70;
		int expected=5;
		int actual=EmployeeOrg.countingcoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void coins1(){
		
		int input=120;
		int expected=3;
		int actual=EmployeeOrg.countingcoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void coins2(){
		
		int input=210;
		int expected=1;
		int actual=EmployeeOrg.countingcoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void coins3(){
		
		int input=300;
		int expected=0;
		int actual=EmployeeOrg.countingcoins(input);
		assertEquals(expected,actual);
	}
}

