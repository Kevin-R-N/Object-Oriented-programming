import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 * Application for the products of Apple
 * @author kevin
 *
 */

public class AppleApplication {
	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);;
	private static ProductsList P;
	
	
	
	/**
	 * main method which displays the menu the user can choose from
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("Please provide text file:");
		String filename = sc.nextLine() + ".txt";
		System.out.println("File recognised");
		P = ProductsList.readProducts(filename);

		while (true) {
			System.out.println(
					"\n Please make your choice:\n" + "1 - Show the entire Apple catalogue\n" + "2 – Add a new iPhone\n"
							+ "3 – Add a new iPad\n" + "4 - Show the entire Apple catalogue sorted by product\n"
							+ "5 – Show the entire Apple catalogue sorted by price (low -> high)\n"
							+ "6 – Write to file\n" + "7 – Stop the program\n");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print(P.toPrint());
				break;
			case 2:
				newProduct(sc, 2, P);
				break;
			case 3:
				newProduct(sc, 3, P);
				break;
			case 4:
				sortProduct(4);
				break;
			case 5:
				sortProduct(5);
				break;
			case 6:
				writeBack(filename, P);
				System.out.println("File: '" + filename +"' has been overwritten!");
				break;
			case 7:
				sc.close();
				System.out.println("\t Programm has been ended!");
				System.exit(0);

			default:
				System.out.println("\t ERROR 42: Wrong input! \n");
			}
		}
	}

	/**
	 * method which creates new Products and adds them to the ProductsList
	 * @param sc
	 * @param a
	 * @param list
	 */

	private synchronized static void newProduct(Scanner sc, int a, ProductsList list) {
		System.out.println(
				"What modelname does the Product have? (IPHONE 7/ IPAD Air \n Please write in capital letters)");
		String name = sc.next() + " " + sc.next();
		System.out.println("What screensize is the Product? (9.6, 10.8)");
		String size = sc.next();
		System.out.println("What processor does the Product have?");
		String processor = sc.next();

		System.out.println("What color is the Iphone?");
		String color = sc.next();
		System.out.println("How much memory does the iPhone have? (8, 32, 64)");
		String memory = sc.next();

		System.out.println("How much does this model cost?");
		int price = sc.nextInt();

		if (a == 2) {
			System.out.println("What modem does the Iphone have? (GSM or CDMA)");
			String modem = sc.next();
			System.out.println("Does the iPhone support 3D touch technology? (yes or no)");
			Boolean touch;
			if (sc.next().equals("yes")) {
				touch = true;
			} else {
				touch = false;
			}
			Products iphone = new iPhone(name, size, processor, modem, color, memory, touch, price);
			list.addProduct(iphone);
			System.out.println("\t Product has been added \n" + iphone + "\n");
		} else

		{

			System.out.println("Does the iPad support 4G? (yes or no");
			Boolean wifi;
			if (sc.next().equals("yes")) {
				wifi = true;
			} else {
				wifi = false;
			}

			Products ipad = new iPad(name, size, processor, wifi, color, memory, price);
			list.addProduct(ipad);
			System.out.println("\t Product has been added \n" + ipad + "\n");
		}
	}
	
	
	/**
	 * @param a
	 */
	public static synchronized void sortProduct(int a)
	{
		SortThread st = new SortThread(P,a);
		st.run();
		
	}
	
	/**
	 * @param a Sets new sorting from option 4 or 5
	 */
	public static void setProductsList(ProductsList a)
	{
		P = a;
	}
	/**
	 * Method which overwrites the file
	 * @param filename
	 * @param list
	 */
	private static void writeBack(String filename, ProductsList list) {
		File name = new File(filename);
		FileWriter fw;

		try {
			fw = new FileWriter(name);
			fw.write(list.toString());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
