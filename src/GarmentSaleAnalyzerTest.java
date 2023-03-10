package UST_BATCHNO_3.JUNIT5_TESTCASES;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

/**
 * Unit test for simple App.
 */

  public class GarmentSaleAnalyzerTest {
    @Test
    public void testGarmentSaleAnalyzer() {
        List<GarmentProduct> garments = new ArrayList<>();
        garments.add(new GarmentProduct("t-Shirt", 10, 500, LocalDate.of(2023, 3, 10)));
        garments.add(new GarmentProduct("Pants", 5, 200, LocalDate.of(2023, 3, 10)));
        garments.add(new GarmentProduct("Shirt", 5, 250, LocalDate.of(2023, 3, 9)));
        garments.add(new GarmentProduct("Shirts", 5, 500, LocalDate.of(2023, 3, 10)));


        GarmentSaleAnalyzer analyzer = new GarmentSaleAnalyzer(garments);

        Map<String, Double> result = analyzer.analyze(LocalDate.of(2023, 3, 10));

        //assertEquals(2, result.size());
        assertEquals(2500, result.get("Shirts"), 0);
        assertEquals(1000, result.get("Pants"), 0);
    }
}

  