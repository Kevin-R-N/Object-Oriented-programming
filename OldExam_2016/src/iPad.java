/**
 * iPad class
 * @author kevin
 *
 */
public class iPad extends Products {
	private Boolean wifi;

	/**
	 * Creates object iPad
	 * @param name
	 * @param size
	 * @param processor
	 * @param wifi2
	 * @param color
	 * @param memory
	 * @param price
	 */
	public iPad(String name, String size, String processor, Boolean wifi, String color, String memory, int price) {
		super(name, size, processor, color, memory, price);
		this.wifi = wifi;
	}

	/**
	 * returns true if iPad supports 4G, else wrong
	 * @return
	 */
	public Boolean getWifi() {
		return wifi;
	}
	
	public String getWifi2() {
		if(wifi == true) {
			return "WIFI and 4G technology"; 
		}
		return "only WIFI";
	}


	/**
	 * Creates human-friendly string of object iPad
	 */
	@Override
	public String toString() {
		return getName() + ", " + getSize() + ", " + getProcessor() + ", " + getWifi() + ", " + getColor() + ", "
				+ getMemory() + ", " + getPrice();
	}

	/**
	 * Checks of two objects of instance iPad are equal
	 */
	public boolean equals(Object other) {
		if (other instanceof iPad) {
			iPad that = (iPad) other;

			if ((this.getName()).equals(that.getName()) && (this.getSize() == that.getSize()) && (this.getProcessor().equals(that.getProcessor())))
				return true;
		}
		return false;
	}
	
	@Override
	public String toPrint() {
		return "Apple " + getName() + " with " + getMemory() + " of memory \n\t with an " + getProcessor()
				+ " processor and " + getSize() + " inch screen \n\t having " + getWifi2() + "\n\t " + getPrice()
				+ " euros \n";
	}
}
