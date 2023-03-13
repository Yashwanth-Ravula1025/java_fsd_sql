package UST_BATCHNO_3.testNG;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;



import org.testng.annotations.Test;

public class ConstructionCompanyTest {
      @Test
      public void Construction(){
    	  int expected =2000;
    	  
    	  Price p1=new Price("Hyderabad", 2000, 900);
    	  String city="Hyderabad";
    	  List<Price> details=Arrays.asList(p1);
    	  int ch=1,sq=1;
    	  
    	  assertEquals(expected, ConstructionCompany.construction(details, ch, city, sq));
    	  ch=2;
    	  
    	  expected=900;
    	  assertEquals(expected, ConstructionCompany.construction(details, ch, city, sq));
    	  
      }
}

