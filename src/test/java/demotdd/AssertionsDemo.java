package demotdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class AssertionsDemo {
	
	private final Person person = new Person("Jane", "Doe");

	@Test
    void standardAssertions() {
		Calculatrice maCalculatrice = new Calculatrice();
		int resultMultiply = maCalculatrice.multiply(2, 3);
		assertTrue(resultMultiply!=0);
    }
	
	
	@Test
    void dependentAssertions() {
        assertAll("properties",
            () -> {
                String firstName = person.getFirstName();
                assertNotNull(firstName);

                assertAll("first name",
                    () -> assertTrue(firstName.startsWith("J")),
                    () -> assertTrue(firstName.endsWith("e"))
                );
            },
            () -> {

                String lastName = person.getLastName();
                assertNotNull(lastName);

                assertAll("last name",
                    () -> assertTrue(lastName.startsWith("D")),
                    () -> assertTrue(lastName.endsWith("e"))
                );
            }
        );
    }
	

	
}
