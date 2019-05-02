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
		return size;
	}

	public boolean hasCards(){

		return !deck.isEmpty();
	}

	public Card get(int pos){

		return deck.get(pos);
	}

	public void add(Card card){

		deck.add(card);
		size++;
		

	}

	public void addAll(Deck other){

		for(int i =0;i<other.size();i++){
			deck.add(other.get(i));
			other.remove(other.get(i));
			size++;
		}

	}

	public Card removeLast(){

		Card temp = deck.get(size-1);
		deck.remove(size-1);
		size--;
		return temp;
		
	}

	public Card removeFirst(){

		Card temp = deck.get(0);
		deck.remove(0);
		size--;
		return temp;
	}

	public boolean remove(Card card){

		if(deck.contains(card)){
			deck.remove(card);
			size--;
			return true;
		}
		return false;

	}

	public void removeAll(Deck other){

		for(int i=0;i<other.size();i++){
			if(deck.contains(other.get(i))){

				deck.remove(other.get(i));
				size--;
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
			size--;

		}



		return newDeck;
	}

	public boolean contains(Card card){

		boolean answer = false;
		for(int i = 0 ;i<deck.size()-1;i++){
			for(int j = 1;j<deck.size();j++){
				if(deck.get(i) == deck.get(j)){
					answer = true;				
				}
					answer = false;
			}
		}
			return answer;	

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
		
		sortBySuit();
		boolean answer = true;

		if(deck.size() > 1){
			for(int i = 0; i<deck.size()-1;i++){
				for(int j = 1 ; j<deck.size(); j++){
					if(deck.get(i).getRank() != deck.get(j).getRank()){
						answer = false;
					}
				}
			}
		}
		return answer;

	}

	public boolean isSeq(){

		sortByRank();

		boolean answer = true;

		if(deck.size()>2){
			for(int i = 0; i<deck.size()-1 ;i++){
				for(int j = 1; j<deck.size(); j++){
					if(deck.get(i).getRank() >= deck.get(j).getRank() || deck.get(i).getSuit() != deck.get(j).getSuit()){
						answer = false;
					}
				}
			}
		}
		return answer;

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
