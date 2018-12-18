
/**
 * @author kevin Subclass Electic of superclass Car
 */
public class Electric extends Car {

	private String capacity;

	/**
	 * constructor of Subclass Electric
	 * 
	 * @param brand
	 * @param model
	 * @param power
	 * @param capacity capacity of the engine
	 * @param price
	 */
	public Electric(String brand, String model, String power, String capacity, int price) {
		super(brand, model, power, price);
		this.capacity = capacity;

	}

	/**
	 * getter of capacity of the engine
	 * 
	 * @return capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Car#toString() toString method which overrides the toString in the Car
	 * class
	 */
	@Override
	public String toString() {
		return "ELECTRIC_CAR " + getBrand() + ", " + getModel() + ", " + getPower() + ", " + getCapacity() + ", "
				+ getPrice() + " euro";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Car#equals(java.lang.Object) Checks if two instances of class Electric
	 * are the same
	 */
	@Override
	public boolean equals(Object other) {

		if (other instanceof Electric) {

			Electric that = (Electric) other;
			if ((super.equals(other)) && this.capacity.equals(that.capacity))
				return true;

		}

		return false;
	}

	@Override
	public String getType() {
		
		return "Electric";
	}

}
