import java.util.Random;

public class Die{

	//instance variables
	private Random rand = new Random();
	public int die;

	//constant
	public static final int MAXVALUE = 6;
		
	//constructor
	public Die(){
		die = rand.nextInt(MAXVALUE - 1 + 1) + 1;
	}

	//returns value of die
	public int getValue(){
		return die;
	}

	//changes the value of die to a random value
	public void roll(){
		die = rand.nextInt(MAXVALUE-1+1)+1;
	}

	//returns a string representation of the die
	public String toString(){
		return "Die (value:" + die + " )";
	}
}