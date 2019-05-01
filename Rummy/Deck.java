import java.util.ArrayList;
import java.util.Collections;

public class Deck{

	private int numOfRanks;

	private int size;

	private ArrayList<Card> deck;

	public Deck(){
		deck = new ArrayList<Card>();
	}

	public Deck(int n){
		numOfRanks = n;
		ArrayList<Card> deck = new ArrayList<Card>(4*n);

	}

	public int size(){
		return deck.size();
	}

	public boolean hasCards(){

		return !deck.isEmpty();
	}

	public Card get(int pos){

		return deck.get(pos);
	}

	public void add(Card card){

		deck.add(card);

	}

	public void addAll(Deck other){

		for(int i =0;i<other.size();i++){
			deck.add(other.get(i));
			other.remove(other.get(i));
		}

	}

	public Card removeLast(){

		Card temp = deck.get(size-1);
		deck.remove(size-1);
		return temp;
	}

	public Card removeFirst(){

		Card temp = deck.get(0);
		deck.remove(0);
		return temp;
	}

	public boolean remove(Card card){

		if(deck.contains(card)){
			deck.remove(card);
			return true;
		}
		return false;

	}

	public void removeAll(Deck other){

		for(int i=0;i<other.size();i++){
			if(deck.contains(other.get(i))){
				deck.remove(other.get(i));
			}
		}

	}

	public void shuffle(){
		Collections.shuffle(deck);
	}

	public Deck deal(int n){

		Deck newDeck = new Deck();
		for(int i = size-1;i>size-(n-1);i--){
			newDeck.add(deck.get(i));
			deck.remove(i);

		}

		return newDeck;
	}

	public boolean contains(Card card){
		return deck.contains(card);

	}

	public boolean containsAll(Deck other){

		for(int i =0;i<other.size();i++){
			if(!deck.contains(other.get(i))){
				return false;
			}
		}
		return true;

	}

	public boolean isKind(){

		ArrayList<Card> temp = deck;

		sortBySuit();

		if(deck.size() > 1 && temp.equals(deck)){
			return true;
		}
		return false;

	}

	public boolean isSeq(){

		ArrayList<Card> temp = deck;

		sortBySuit();

		if(deck.size() > 2 && temp.equals(deck) && temp.equals(deck)){
			return true;
		}
		return false;

	}

	public void sortBySuit(){

		deck.sort(new SuitComparator());

	}

	public void sortByRank(){

		deck.sort(new RankComparator());

	}

	public void print(){

		int count = 0;

		sortBySuit();

		for(int i = 0; i<deck.size();i++){
			if(count == 0){
				System.out.println("[" + deck.get(i) + ",");
			}
			if(count > 0 && count < deck.size() -1){
				System.out.println(deck.get(i) + ",");
			}
			else{
				System.out.println(deck.get(i) + "]");
			}
		}

		sortByRank();


		for(int i = 0; i<deck.size();i++){
			if(count == 0){
				System.out.println("[" + deck.get(i) + ",");
			}
			if(count > 0 && count < deck.size() -1){
				System.out.println(deck.get(i) + ",");
			}
			else{
				System.out.println(deck.get(i) + "]");
			}
		}

	}

	public String toString(){

		String result = "";

		int count = 0;

		for(int i = 0; i<deck.size();i++){
			if(count == 0){
				result += "[" + deck.get(i) + ",";
			}
			if(count > 0 && count < deck.size() -1){
				result += deck.get(i) + ",";
			}
			else{
				result+=deck.get(i) + "]";
			}
		}
		return result;

	}
}