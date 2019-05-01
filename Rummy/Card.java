public class Card{

	public static final int DIAMOND =0;

	public static final int CLUB = 1;

	public static final int HEART = 2;

	public static final int SPADE = 3;

	private int suit;

	private int rank;

	public Card(int suit, int rank){

		this.suit = suit;

		this.rank = rank;

	}

	public int getSuit(){
		return suit;
	}

	public int getRank(){
		return rank;
	}

	public boolean equals(Object o){
		if(!(o instanceof Card)){
			return false;
		}

		Card other;
		other = (Card) o;

		if(other == null && this != null){
			return false;
		}

		if(other.getSuit() != this.getSuit()){
			return false;
		}

		if(other.getRank() != this.getRank()){
			return false;
		}
		else{
			return true;
		}
	}

	public String toString(){

		return "(" + suit + "," + rank + ")";
	}

	public static void main(String[] args){

		Card a, b, c;
		a = new Card(2, 7);
		b = new Card(2,7);
		c = new Card(0,9);
		System.out.println(a);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

	


}