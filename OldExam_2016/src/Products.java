import java.util.Scanner;

/**
 * Products, superclass of all products of the company Apple
 * @author kevin
 *
 */
public abstract class Products {
	private String name;
	private String size;
	private String processor;
	private String color;
	private String memory;
	private int price;

	/**
	 * Creates Object Products
	 * 
	 * @param name
	 * @param size2
	 * @param processor
	 * @param color
	 * @param memory
	 * @param price
	 */
	public Products(String name, String size, String processor, String color, String memory, int price) {
		this.name = name;
		this.size = size;
		this.processor = processor;
		this.color = color;
		this.memory = memory;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public String getProcessor() {
		return processor;
	}

	public String getColor() {
		return color;
	}

	public String getMemory() {
		return memory;
	}

	public int getPrice() {
		return price;
	}

	/**
	 * method to read of the scanner is a iPhone or iPad
	 * 
	 * @param sc 
	 * @return
	 */
	public static Products read(Scanner sc) {

		Scanner x = new Scanner(sc.nextLine());
		x.useDelimiter(", ");
		
		String name = x.next();
		String size = x.next();
		String processor = x.next();

		if (name.contains("IPHONE")) {
			
			String modem = x.next();
			String color = x.next();
			String memory = x.next();
			Boolean touch = x.nextBoolean();
			int price = x.nextInt();
			iPhone iphone = new iPhone(name, size, processor, modem, color, memory, touch, price);
			x.close();
			return iphone;
		} else {
			Boolean wifi = x.nextBoolean();
			String color = x.next();
			String memory = x.next();
			int price = x.nextInt();
			iPad ipad = new iPad(name, size, processor, wifi, color, memory, price);
			x.close();
			return ipad;
		} 
	}

	

	public abstract String toString();

	public abstract String toPrint();

	public boolean equals(Object other) {
		if (other instanceof Products) {
			Products that = (Products) other;

			if ((this.getName()).equals(that.getName()) && (this.getSize() == that.getSize()) && (this.getProcessor().equals(that.getProcessor())))
				return true;
		}
		return false;
	}

	
}
