import java.util.Comparator;
/**
 * Comparator class for productprice
 * @author kevin
 *
 */
public class PComparator implements Comparator<Products> {


	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Products a, Products b) {

		return (a.getPrice() - b.getPrice());
	}

}
