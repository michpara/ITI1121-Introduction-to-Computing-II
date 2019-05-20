public class Game{

	//instance variables
	private Deck mainDeck;
	private Die die;
	private Deck playerHand = new Deck();
	private Utils utils = new Utils();
	
	//constructor
	public Game(int ranks){
		this.ranks = ranks;
		mainDeck = new Deck(ranks);
		die = new Die();
	}

	//game logic
	public int play(){
		int rounds = 1;
		boolean meld = true;
		int currentDie;

		mainDeck.shuffle();
		playerHand = mainDeck.deal(7);

		while(playerHand.hasCards()){
			
			playerHand.print();

			System.out.println("Welcome to round " + rounds);

			System.out.println("Rolling the die!");

			if(!mainDeck.hasCards()){
				currentDie = 1;
			}

			else{
				die.roll();
				currentDie = die.getValue();
			}

			System.out.println("The die has value " + currentDie);

			if(currentDie > 1){
				System.out.println("Adding (up to) " + currentDie + " cards to your hand.");
			}

			System.out.println("The size of the deck is: " + mainDeck.size()); //remove later
			
			if(currentDie == 1){
				boolean yesOrNo = utils.readYesOrNo("Would you like to discard a card?: ");
				
				if(yesOrNo == true){
					Card cardToDiscard = utils.readCard();
					playerHand.remove(cardToDiscard);
					yesOrNo = false;
				}
				rounds++;

			}

			if(currentDie>1){
				meld = true;
				if(currentDie < mainDeck.size()){
					playerHand.addAll(mainDeck.deal(currentDie));
				}

				if(mainDeck.size() < currentDie){
					playerHand.addAll(mainDeck.deal(mainDeck.size()));
				}

				playerHand.print();
				while(meld == true){
					boolean yesOrNo = utils.readYesOrNo("Do you  have a sequences of three or more cards of the same suit or two or more of a kind? ");

					if (yesOrNo == true){
						Deck meldToDiscard = utils.readCards("Which 3+ sequence or 2+ of a kind would you like to discard? ");

						if(meldToDiscard.isKind() && playerHand.containsAll(meldToDiscard)){
							playerHand.removeAll(meldToDiscard);
						}


						else if(meldToDiscard.isSeq() && playerHand.containsAll(meldToDiscard)){
							playerHand.removeAll(meldToDiscard);
				  		}

				  		else{
				  			System.out.println("Cannot discard those cards!");
				  		}
					}

					if(yesOrNo == false){
						break;
					}
				}
				rounds++;
			}
		}
		return rounds;
	}
}
