import java.util.Scanner;

/**
 * @author kevin Super Class Car
 */
public abstract class Car {
	private String brand;
	private String model;
	private String power;
	private int price;

	/**
	 * Constructor of object Car
	 * 
	 * @param brand indicates the brand name
	 * @param model indicates the model name
	 * @param power indicates the power of the engine
	 * @param price indicates the price of the car
	 */
	public Car(String brand, String model, String power, int price) {
		this.brand = brand;
		this.model = model;
		this.power = power;
		this.price = price;

	}

	/**
	 * getter for brand name
	 * 
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * getter for model name
	 * 
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * getter for power of the engine
	 * 
	 * @return power
	 */
	public String getPower() {
		return power;
	}

	/**
	 * getter for price of the car
	 * 
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() abstract method of the toString
	 */
	public abstract String toString();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object) Checks if two objects of
	 * instance Car are the same
	 */
	public boolean equals(Object other) {
		if (other instanceof Car) {
			Car that = (Car) other;
			if ((this.brand.equals(that.brand)) && (this.model.equals(that.brand)) && (this.power.equals(that.power))
					&& (this.price == that.price)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param sc file input
	 * @return a object Car after reading the file
	 */
	public static Car readCar(Scanner sc) {
		Scanner line = new Scanner(sc.nextLine());
		Car car;
		String type = line.next();

		if (type.contains("ELECTRIC_CAR")) {
			line.useDelimiter(", | euro");
			String brand = line.next();
			String model = line.next();
			String power = line.next();
			String capacity = line.next();
			int price = line.nextInt();
			car = new Electric(brand, model, power, capacity, price);

		} else if (type.contains("GAS_CAR")) {
			line.useDelimiter(", | euro");
			String brand = line.next();
			String model = line.next();
			String engine = line.next();
			String power = line.next();
			int price = line.nextInt();
			car = new Gas(brand, model, engine, power, price);
		} else {
			line.useDelimiter(", | euro");
			String brand = line.next();
			String model = line.next();
			String engine = line.next();
			String power = line.next();
			String capacity = line.next();
			int price = line.nextInt();
			car = new Hybrid(brand, model, engine, power, capacity, price);
		}
		line.close();
		return car;

	}
	
	public abstract String getType();
}
