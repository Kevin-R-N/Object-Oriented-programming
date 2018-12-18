import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElectricTest {

	Electric ec = new Electric("Tesla", "model 2", "150KW", "50000Ah", 2);
	Electric ec2 = new Electric("Tesla", "model 2", "150KW", "50000Ah", 2);

	@Test
	void testToString() {
		assertEquals(ec.toString(), "ELECTRIC_CAR Tesla, model 2, 150KW, 50000Ah, 2 euro");
	}

	@Test
	void testEqualsObject() {
		assertTrue(ec.equals(ec2));
	}

	@Test
	void testGetCapacity() {

		assertEquals(ec.getCapacity(), "50000Ah");
	}

}
