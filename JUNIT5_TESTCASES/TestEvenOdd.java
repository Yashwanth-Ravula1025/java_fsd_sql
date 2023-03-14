/**
 * 
 */
package UST_BATCHNO_3.JUNIT5_TESTCASES;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TestEvenOdd {
	
	

	@Test
	public void testEven() {
		
		int number=10;
		
		boolean result=isEven(number);
		assertTrue(result);
	}
	
	@Test
	public void testOdd() {
		
		int number=9;
		
		boolean result=isEven(number);
		assertFalse(result);
	}
	public boolean isEven(int number)
	{
		return number%2==0;
	}

}
