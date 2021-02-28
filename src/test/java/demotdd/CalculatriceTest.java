package demotdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	@Order(1)
	@RepeatedTest(10)
	public void testAddition() {
		Calculatrice maCalculatrice = new Calculatrice();
		int resultAddition = maCalculatrice.somme(2, 3);
		assertEquals(5, resultAddition);
	}
	
	
	@Test
	@Order(2)
	@Tag("taxes")
    public void testingTaxCalculation() {
		
	}
	
	@Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
		
    }
	
	

}
