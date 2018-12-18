import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class iPhoneTest {

	String name = new String("IPHONE 7");
	String size = new String("4");
	String processor = new String("a7");
	String modem = new String("GSM");
	String color = new String("JET BLACK");
	String memory = new String("32");
	Boolean touch = true;
	int price = 750;
	iPhone iphone1 = new iPhone(name, size, processor, modem, color, memory, touch, price);
	iPhone iphone2 = new iPhone(name, size, processor, modem, color, memory, touch, price);

	@Test
	void testToString() {
		assertEquals(iphone1.toString(), "IPHONE 7, 4.0, a7, GSM, JET BLACK, 32, true, 750");
	}

	@Test
	void testEqualsObject() {
		assertTrue(iphone1.equals(iphone2));
	}


	@Test
	void testGetModem() {
		assertEquals(iphone1.getModem(), modem);
	}

	@Test
	void testGetTouch() {
		assertEquals(iphone1.getTouch(), touch);
	}

}
