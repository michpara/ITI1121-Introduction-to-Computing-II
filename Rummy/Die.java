import java.util.Random;

public class Die{
	

	private Random rand = new Random();

	public static final int MAXVALUE = 6;

	public int die;
	
	public Die(){
		die = rand.nextInt(MAXVALUE - 1 + 1) + 1;

	}

	public int getValue(){
		return die;
	}

	public void roll(){
		die = rand.nextInt(MAXVALUE-1+1)+1;
	}

	public String toString(){
		return "Die (value:" + die + " )";
	}


}