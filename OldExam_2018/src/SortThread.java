import java.util.Collections;

/**
 * @author kevin Subclass SortThread of the superclass Thread
 */
public class SortThread extends Thread {
	private int a;
	private CarCatalog cars;

	/**
	 * Constructor of class SortThread which takes an integer to see which option
	 * has been chosen
	 * 
	 * @param a
	 */
	SortThread(CarCatalog cars, int a) {
		this.a = a;
		this.cars = cars;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run() run method of class SortThread which runs the
	 * methods of options 5 and 6 in the class Application
	 */
	public void run() {
		if (a == 5) {
			{
				Collections.sort(cars.getCars(), new CompareType());
			}
		} else {
			Collections.sort(cars.getCars(), new CompareBrand());
		}

		System.out.println(cars.toString());
	}

}
