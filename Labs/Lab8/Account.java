public class Account{

   private double balance;

   public Account() {
	    this.balance=0;
   }

   public double getBalance() {
     return balance;
   }

   public void deposit(double amount){
	    this.balance += amount;
	    System.out.println("new balance=" + this.balance);
   }

   public void withdraw(double amount) throws NotEnoughMoneyException{
	    if(amount > this.balance) {
	    	throw new NotEnoughMoneyException(amount, balance);
	    }
    	this.balance -= amount;
    	System.out.println("new balance=" + this.balance);
   }
}