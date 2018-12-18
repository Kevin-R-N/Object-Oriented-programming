import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 * @author kevin Class CarCatalog
 */
public class CarCatalog {
	private List<Car> cars;

	/**
	 * Object CarCatalog that contains a set of Cars
	 */
	public CarCatalog() {
		setCars(new ArrayList<Car>());
	}

	/**
	 * getter of the Set cars
	 * 
	 * @return cars
	 */
	public List<Car> getCars() {
		return cars;
	}

	/**
	 * setter of the Set cars
	 * 
	 * @param cars
	 */
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	/**
	 * adds an object Car to the Set cars in CarCatalog
	 * 
	 * @param car
	 */
	public void addCar(Car car) {
		cars.add(car);
	}

	/**
	 * Reads a file and creates an CarCatalog out of it
	 * 
	 * @param sc
	 * @return a CarCatalog
	 */
	public static CarCatalog readFile(Scanner sc) {
		CarCatalog file = new CarCatalog();

		while (sc.hasNextLine()) {
			file.addCar(Car.readCar(sc));
		}

		return file;

	}

	/**
	 * Checks if two instances of CarCatalog are the same
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(CarCatalog other) {

		if (other instanceof CarCatalog) {

			CarCatalog that = (CarCatalog) other;
			if (this.cars.equals(that.cars))
				return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() toString method of the class CarCatalog
	 */
	public String toString() {
		Object[] c = cars.toArray();
		int length = cars.size();

		String result = c[0].toString();
		for (int i = 1; i < length; i++) {
			result = result + "\n" + c[i];
		}
		return result;

	}

}
