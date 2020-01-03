public class Customer{
	
	private static final int MAX_NUM_ITEMS = 25;
	
	private int arrivalTime;
	private int numberOfItems;
	private int initialNumberOfItems;
	
	public Customer(int arrivalTime) {
		this.arrivalTime = arrivalTime;
		this.initialNumberOfItems =  (int) ( ( MAX_NUM_ITEMS - 1 ) * Math.random() ) + 1;
		this.numberOfItems = initialNumberOfItems;
	}
	
	public int getArrivalTime() {
		return arrivalTime;
	}
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	public int getNumberOfServedItems() {
		return initialNumberOfItems - numberOfItems;
	}
	
	public void serve() {
		numberOfItems--;
	}
}