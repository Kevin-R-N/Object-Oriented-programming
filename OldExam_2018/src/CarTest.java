import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CarTest {

	
	String brand = "Tesla";
	String model = "model 3";
	String power = "150kw";
	int price = 2;
			
	
	@Test
	void testGetBrand() {

	}

	@Test
	void testGetModel() {

	}

	@Test
	void testGetPower() {

	}

	@Test
	void testGetPrice() {

	}

	@Test
	void testEqualsObject() {

	}

	@Test
	void testReadCar() {
		Scanner sc = new Scanner("GAS_CAR Honda, Civic, 1.5L, 80KW, 18000 euro");
		Gas ec = new Gas(" Honda", "Civic", "1.5L", "80KW", 18000);
		
		assertEquals(Car.readCar(sc), ec);

	}

}
