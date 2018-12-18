public class SortThread extends Thread{
	private ProductsList P;
	private int sort;
	
	public SortThread(ProductsList P, int sort)
	{
		this.P = P;
		this.sort = sort;
	}
	
	public void run()
	{
		if(sort == 4)
		{
			System.out.println("not implemented yet 4!");
		}
		else {
		//	PComparator comp = new PComparator();
			
			System.out.println("also not implemented yet 5!");
			
			
			
		}
		
		
	}
	
	
}
