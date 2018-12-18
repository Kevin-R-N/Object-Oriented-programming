import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HybridTest {

	Hybrid ec = new Hybrid("Toyota", "Prius", "1.5L", "50KW", "12000Ah", 24000);
	Hybrid ec2 = new Hybrid("Toyota", "Prius", "1.5L", "50KW", "12000Ah", 24000);
	
	
	@Test
	void testToString() {
		assertEquals(ec.toString(), "HYBRID_CAR Toyota, Prius, 1.5L, 50KW, 12000Ah, 24000 euro");
	}

	@Test
	void testEqualsObject() {
		assertTrue(ec.equals(ec2));
	}


	@Test
	void testGetEngine() {
		assertEquals(ec.getEngine(), "1.5L");
	}

	@Test
	void testGetCapacity() {
		assertEquals(ec.getCapacity(), "12000Ah");
	}

}
