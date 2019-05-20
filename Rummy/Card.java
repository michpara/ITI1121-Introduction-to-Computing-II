public class Card{

	//constants
	public static final int DIAMOND =0;
	public static final int CLUB = 1;
	public static final int HEART = 2;
	public static final int SPADE = 3;

	//instance variables
	private int suit;
	private int rank;

	//constructor
	public Card(int suit, int rank){
		this.suit = suit;
		this.rank = rank;
	}

	//returns the value of the suit
	public int getSuit(){
		return suit;
	}

	//returns the value of the rank
	public int getRank(){
		return rank;
	}

	//checks if 'o' is euqal to this card
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

	//returns a string representation of the card
	public String toString(){
		return "{" + suit + "," + rank + "}";
	}
}
