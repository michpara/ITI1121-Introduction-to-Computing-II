import java.util.Comparator;

	public class RankComparator implements Comparator<Card> {

		public int compare(Card a, Card b){

			if(a.getRank() < b.getRank()){
				return -1;
			}


			else if(a.getRank() == b.getRank()){

				if(a.getSuit() < b.getSuit()){
					return -1;
				}
				else if(a.getSuit() == b.getSuit()){
					return 0;
				}
				else{
					return 1;
				}
			}
			
			else{
				return 1;
			}

		}

	}
