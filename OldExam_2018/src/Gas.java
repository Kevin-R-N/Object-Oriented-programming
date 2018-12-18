
/**
 * @author kevin Subclass Gas of superclass Car
 */
public class Gas extends Car {

	private String engine;

	/**
	 * Constructor of the subclass Gas
	 * 
	 * @param brand
	 * @param model
	 * @param engine engine displacement of the car
	 * @param power
	 * @param price
	 */
	public Gas(String brand, String model, String engine, String power, int price) {
		super(brand, model, power, price);
		this.engine = engine;
	}

	/**
	 * getter of engine displacement
	 * 
	 * @return engine
	 */
	public String getEngine() {
		return engine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Car#toString() toString method which overrides the toString in the Class
	 * Car
	 */
	@Override
	public String toString() {
		return "GAS_CAR " + getBrand() + ", " + getModel() + ", " + getEngine() + ", " + getPower() + ", " + getPrice()
				+ " euro";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Car#equals(java.lang.Object) Checks if two instances of class Gas are
	 * the same and returns true if so
	 */
	@Override
	public boolean equals(Object other) {

		if (other instanceof Gas) {

			Gas that = (Gas) other;
			if ((super.equals(other)) && this.engine.equals(that.engine))
				return true;

		}

		return false;
	}

	@Override
	public String getType() {

		return "Gas";
	}
	

}
