public class Cashier{

    private static final String nl = System.getProperty( "line.separator" );

    private Queue<Customer> queue;
    private Customer currentCustomer;

    private int totalCustomerWaitTime;
    private int customersServed;
    private int totalItemsServed;
    
    private boolean serving = false;
	
	public Cashier() {
		queue = new ArrayQueue<Customer>();
		totalCustomerWaitTime = 0;
		customersServed = 0;
		totalItemsServed = 0;
	}
	
	public void addCustomer(Customer c) {
		queue.enqueue(c);
	}
	
	public int getQueueSize() {
		return queue.size();
	}
	
	public void serveCustomers(int currentTime) {
		if(queue.size() == 0) {
			return;
		}
		
		if(!serving) {
			currentCustomer = queue.dequeue();
			serving = true;
		}
		if(serving) {
			if(currentCustomer.getNumberOfItems() > 0) {
				currentCustomer.serve();
				totalItemsServed+=1;
			}
			else {
				serving = false;
				customersServed++;
	            totalCustomerWaitTime += currentTime - currentCustomer.getArrivalTime();
			}
		}
	}
	
	public int getTotalCustomerWaitTime() {
		return totalCustomerWaitTime;
	}
	
	public int getTotalItemsSered() {
		return totalItemsServed;
	}
	
	public int getTotalCustomersServed() {
		return customersServed;
	}
	
	public String toString() {
		StringBuffer results = new StringBuffer();

        results.append( "The total number of customers served is " );
        results.append( customersServed );
        results.append( nl );

        results.append( "The average number of items per customer was " );
        results.append( totalItemsServed / customersServed );
        results.append( nl );

        results.append( "The average waiting time (in seconds) was " );
        results.append( totalCustomerWaitTime / customersServed );
        results.append( nl );

        return results.toString();
	}
}