import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * List of products
 * @author kevin
 *
 */
public class ProductsList {
	static Set<Products> list;

	/**
	 * creates Set of Products
	 */
	public ProductsList() {
		list = new HashSet<Products>();
	}

	/**
	 * method to add objects to the Set
	 * @param product
	 */
	public void addProduct(Products product) {
		list.add(product);
	}

	/**
	 * method to read file and place all objects created from it to a list
	 * @param name
	 * @return
	 */
	public static ProductsList readProducts(String name) {

		ProductsList P = new ProductsList();

		try {

			Scanner sc = new Scanner(new File(name));
			
			while(sc.hasNextLine()) {
				P.addProduct(Products.read(sc));
				System.out.println("Product added");
			}

			sc.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		return P;

	}

	/**
	 * Checks if two instances of ProductList are equal
	 * @param other
	 * @return
	 */
	public boolean equals(ProductsList other) {

		if (other instanceof ProductsList) {
			ProductsList that = (ProductsList) other;

			if ((this).equals(that))
				return true;
		}
		return false;

	}

	/**
	 * returns a human-friendly string of ProductsList
	 */
	public String toString() {
		Object[] Array = list.toArray();
		int catalogLength = list.size();
		String output = ((Products) Array[0]).toString();

		for (int i = 1; i < catalogLength; i++) {

			output = output + "\n" + ((Products) Array[i]).toString();

		}

		return output;
	}

	public String toPrint() {
		Object[] Array = list.toArray();
		int catalogLength = list.size();
		String output = ((Products) Array[0]).toPrint();

		for (int i = 1; i < catalogLength; i++) {

			output = output + "\n" + ((Products) Array[i]).toPrint();

		}

		return output;
	}

	


}
