import java.util.Comparator;

public class CompareBrand implements Comparator<Car> {
	@Override
	public int compare(Car o1, Car o2) {
		return o1.getBrand().compareToIgnoreCase(o2.getBrand());

	}
}
