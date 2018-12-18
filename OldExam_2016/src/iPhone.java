/**
 * iPhone class
 * 
 * @author kevin
 *
 */
public class iPhone extends Products {
	private String modem;
	private Boolean touch;

	/**
	 * Creates object iPhone
	 * 
	 * @param name
	 * @param size
	 * @param processor
	 * @param modem
	 * @param color
	 * @param memory
	 * @param touch
	 * @param price
	 */
	public iPhone(String name, String size, String processor, String modem, String color, String memory, Boolean touch,
			int price) {
		super(name, size, processor, color, memory, price);
		this.modem = modem;
		this.touch = touch;

	}

	public String getModem() {
		return this.modem;
	}

	public Boolean getTouch() {
		return this.touch;
	}

	/**
	 * Creates a human-friendly string from a iPhone object
	 */
	@Override
	public String toString() {
		return getName() + ", " + getSize() + ", " + getProcessor() + ", " + getModem() + ", " + getColor() + ", "
				+ getMemory() + ", " + getTouch() + ", " + getPrice();
	}

	/**
	 * Checks if two objects of instance iPhone are equal
	 */
	public boolean equals(Object other) {
		if (other instanceof iPhone) {
			iPhone that = (iPhone) other;

			if ((this.getName()).equals(that.getName()) && (this.getSize() == that.getSize())
					&& (this.getProcessor().equals(that.getProcessor())))
				return true;
		}
		return false;
	}

	@Override
	public String toPrint() {
		return "Apple " + getName() + " with " + getMemory() + " of memory \n\t with an " + getProcessor()
				+ " processor and " + getSize() + " inch screen \n\t " + getPrice() + " euros \n";
	}

}
