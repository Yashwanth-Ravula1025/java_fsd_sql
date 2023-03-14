/**
 * 
 */
package ustbatchno3.junittestcase;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class VehicleRegistration {
	 public String[] getStateAndDistrict(String registrationNumber) {
	        String[] stateAndDistrict = new String[2];
	        String stateCode = registrationNumber.substring(0, 2);
	        String districtCode = registrationNumber.substring(2, 4);
	        
	        // Map state codes to state names
	        Map<String, String> stateMap = new HashMap<>();
	        stateMap.put("TS", "Telangana");
	        // Add more states to the map as needed
	        
	        // Map district codes to district names
	        Map<String, String> districtMap = new HashMap<>();
	        districtMap.put("32", "Nalgona");
	        // Add more districts to the map as needed
	        
	        stateAndDistrict[0] = stateMap.getOrDefault(stateCode, "Telangana");
	        stateAndDistrict[1] = districtMap.getOrDefault(districtCode, "Nalgona");
	        return stateAndDistrict;
	    }
	}

