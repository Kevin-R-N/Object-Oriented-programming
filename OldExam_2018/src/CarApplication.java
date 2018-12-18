import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author kevin Class that contains the main method and runs the programm
 */
public class CarApplication {
	private static Scanner sc = new Scanner(System.in);
	private static CarCatalog cars;

	public static void main(String[] args) {

		System.out.println("Please input filename:\n");
		String str = sc.next();
		try {
			Scanner scan = new Scanner(new File(str));
			cars = CarCatalog.readFile(scan);
			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("\t No file found! restart programm please!");
			System.exit(0);
		}

		while (true) {
			System.out.println("Please make your choice:\r\n" + "1 - Show the entire Mobility4You catalogue\r\n"
					+ "2 – Add a new electric car\r\n" + "3 – Add a new gas-powered car\r\n"
					+ "4 – Add a new hybrid car\r\n"
					+ "5 - Show the entire Mobility4You catalogue sorted by car-type\r\n"
					+ "6 – Show the entire Mobility4You catalogue sorted by brand\r\n" + "(alphabetically)\r\n"
					+ "7 – Write to file\r\n" + "8 – Stop the program\r\n");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println(cars.toString() + "\n");
				break;
			case 2:
				newCar(sc, 2);
				break;
			case 3:
				newCar(sc, 3);
				break;
			case 4:
				newCar(sc, 4);
				break;
			case 5:
				sortCatalog(cars, 5);
				break;
			case 6:
				sortCatalog(cars, 6);
				break;
			case 7:
				Writeback(str);
				break;
			case 8:
				sc.close();
				System.out.println("Programm has been stopped!\n");
				System.exit(0);
			default:
				System.out.print("Wrong input for choice!");
				break;

			}

		}

	}

	/**
	 * This method creates a Car of type Electric, Gas or Hybrid
	 * 
	 * @param sc Scanner that is used for user input
	 * @param a  integer to indicate which option was chosen
	 */
	public synchronized static void newCar(Scanner sc, int a) {
		Car car;
		System.out.println("What is the brand name? (Tesla) ");
		String brand = sc.next();

		System.out.println("What is the model name? (Civic) ");
		String model = sc.next();

		System.out.println("What is the power of the engine? (150KW)");
		String power = sc.next();

		System.out.println("What is the price? (2) ");
		int price = sc.nextInt();

		if (a == 2) {

			System.out.println("What is the capacity? (50000Ah)");
			String capacity = sc.next();
			String model2 = "Model" + model;
			car = new Electric(brand, model2, power, capacity, price);

		} else if (a == 3) {
			System.out.println("What is the engine displacement? (1.5L)");
			String engine = sc.next();

			car = new Gas(brand, model, engine, power, price);
		} else {

			System.out.println("What is the capacity? (50000Ah");
			String capacity = sc.next();
			System.out.println("What is the engine displacement? (1.5L)");
			String engine = sc.next();

			car = new Hybrid(brand, model, engine, power, capacity, price);

		}
		cars.addCar(car);
		System.out.println("Car has been added!\n");

	}

	/**
	 * method which overwrites the current contents of the file with what the user
	 * has added.
	 * 
	 * @param filename String that contains the filename of the file which will be
	 *                 overwritten.
	 */
	public static void Writeback(String filename) {
		FileWriter fw;
		try {
			fw = new FileWriter(new File(filename));
			fw.write(cars.toString());
			fw.close();

		} catch (IOException e) {
			System.out.println("File not overwritten! Something happened to the file!\n");
		}

	}

	/**
	 * This method sorts the catalog and outputs it on the console
	 * 
	 * @param a integer that indicates which option has been chosen.
	 */
	public synchronized static void sortCatalog(CarCatalog cars ,int a) {
		SortThread st = new SortThread(cars, a);
		st.start();

	}

}
