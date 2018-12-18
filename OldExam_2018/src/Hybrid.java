
/**
 * @author kevin Subclass Hybrid of superclass Car
 *
 */
public class Hybrid extends Car {

	private String engine;
	private String capacity;

	/**
	 * Constructor of the subclass Hybrid
	 * 
	 * @param brand
	 * @param model
	 * @param engine   engine displacement of the car
	 * @param power
	 * @param capacity capacity of the engine of the car
	 * @param price
	 */
	public Hybrid(String brand, String model, String engine, String power, String capacity, int price) {
		super(brand, model, power, price);
		this.engine = engine;
		this.capacity = capacity;

	}

	/**
	 * getter engine displacement
	 * 
	 * @return engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * getter of the capacity of the engine
	 * 
	 * @return capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Car#toString() overrides the toString method of the superclass Car
	 */
	@Override
	public String toString() {
		return "HYBRID_CAR " + getBrand() + ", " + getModel() + ", " + getEngine() + ", " + getPower() + ", "
				+ getCapacity() + ", " + getPrice() + " euro";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Car#equals(java.lang.Object) Checks if two instances of the class Hybrid
	 * are the same
	 */
	@Override
	public boolean equals(Object other) {

		if (other instanceof Hybrid) {

			Hybrid that = (Hybrid) other;
			if ((super.equals(other)) && this.capacity.equals(that.capacity) && this.engine.equals(that.engine))
				return true;

		}

		return false;
	}

	@Override
	public String getType() {

		return "Hybrid";
	}
	
	

}
