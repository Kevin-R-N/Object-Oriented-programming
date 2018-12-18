import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GasTest {

	Gas ec = new Gas("Honda", "Civic", "1.5L", "80KW", 18000);
	Gas ec2 = new Gas("Honda", "Civic", "1.5L", "80KW", 18000);
	
	@Test
	void testToString() {
		assertEquals(ec.toString(), "GAS_CAR   Honda, Civic, 1.5L, 80KW, 18000 euro");
	}

	@Test
	void testEqualsObject() {
		assertTrue(ec.equals(ec2));
	}


	@Test
	void testGetEngine() {
		assertEquals(ec.getEngine(), "1.5L");
	}

}
