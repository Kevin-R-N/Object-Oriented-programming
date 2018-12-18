import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class iPadTest {
	String name = new String("IPHONE 7");
	String size = new String("4");
	String processor = new String("a7");
	Boolean wifi = true;
	String color = new String("JET BLACK");
	String memory = new String("32GB");
	int price = 750;
	iPad ipad1 = new iPad(name, size, processor, wifi, color, memory, price);
	iPad ipad2 = new iPad(name, size, processor, wifi, color, memory, price);

	@Test
	void testToString() {
		assertEquals(ipad1.toString(), "IPHONE 7, 4.0, a7, true, JET BLACK, 32, 750");
	}

	@Test
	void testEqualsObject() {
		assertTrue(ipad1.equals(ipad2));
	}

	@Test
	void testGetWifi() {
		assertEquals(ipad1.getWifi(),"true");
	}

}
