public class Game{

	private Deck mainDeck;

	private Deck playerHand;

	private Die die;

	private int ranks;

	private Utils utils = new Utils();
	
	public Game(int ranks){
		this.ranks = ranks;
		mainDeck = new Deck();
		die = new Die();
	}

	public int play(){

		int rounds = 0;

		boolean meld = true;

		mainDeck.shuffle();

		playerHand = mainDeck.deal(7);

		while(playerHand.size() > 0){

			die.roll();

			if(die.getValue() == 1){
				boolean yesOrNo = utils.readYesOrNo("Would you like to discard a card?: ");
				if( yesOrNo = true){
					int number = utils.readNumber("Enter the position of the card you would like to discard: ", 0, playerHand.size()-1);
					playerHand.remove(playerHand.get(number));
				}
				rounds++;

			}
			if(die.getValue()>1){
				if(die.getValue() < mainDeck.size()){
					playerHand = mainDeck.deal(die.getValue());
				}
				if(mainDeck.size() < die.getValue()){
					playerHand = mainDeck.deal(mainDeck.size());
				}
				while(meld = true){
					boolean yesOrNo = utils.readYesOrNo("Do you have a meld?: ");
					if (yesOrNo = true){
						Deck cards = utils.readCards("Enter the cards in your deck that form a meld: ");
						cards.sortBySuit();
						if(cards.isKind()){
							playerHand.removeAll(cards);
						}
						cards.sortByRank();
						if(cards.isSeq()){
							playerHand.removeAll(cards);
						}
					}
					else{
						meld = false;
					}
				}
				rounds++;

			}

		}
		return rounds;




	}
}