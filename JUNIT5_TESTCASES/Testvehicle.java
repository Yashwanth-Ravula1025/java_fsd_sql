/**
 * 
 */
package ustbatchno3.junittestcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Testvehicle {
	
	@Test
	
	public void Getstateanddistrict(){
	
	 String registrationNumber = "TS32AB1234"; // Replace with your test registration number
     String expectedState = "Telangana"; // Replace with your expected state
     String expectedDistrict = "Nalgona"; // Replace with your expected district
     
     VehicleRegistration vehicleRegistration = new VehicleRegistration();
     String[] stateAndDistrict = vehicleRegistration.getStateAndDistrict(registrationNumber);
     
     assertEquals(expectedState, stateAndDistrict[0]);
     assertEquals(expectedDistrict, stateAndDistrict[1]);
 }
}

