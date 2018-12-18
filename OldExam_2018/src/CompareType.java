import java.util.Comparator;

public class CompareType implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getType().compareToIgnoreCase(o2.getType());
	}

}
