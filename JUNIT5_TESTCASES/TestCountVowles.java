/**
 * 
 */
package UST_BATCHNO_3.JUNIT5_TESTCASES;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TestCountVowles {
	
	@Test
	public void countvowles() {
		String input="Yashwanth";
		int expected=2;
		int actual=CountVowels.vowlesCount(input);
		assertEquals(expected,actual);
	}
	@Test
	public void countvowle() {
		String input="aeiou";
		int expected=5;
		int actual=CountVowels.vowlesCount(input);
		assertEquals(expected,actual);
	}

	
	

}
