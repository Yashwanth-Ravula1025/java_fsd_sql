package UST_BATCHNO_3.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class EmployeeTest {
	
	
	@Test
	public void testemployee() {
		
		Employee e=new Employee("yashwanth",23,"java");
		Assert.assertEquals(e.getName(),"yashwanth");
	}
	
	@Test
	public void testemployee1() {
		
		Employee e=new Employee("yashwanth",23,"java");
		Assert.assertEquals(e.getAge(),23);
	}
	
	
}
  