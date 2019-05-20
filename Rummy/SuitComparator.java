import java.util.Comparator;

public class SuitComparator implements Comparator<Card>{

		public int compare(Card a, Card b){

			if(a.getSuit() < b.getSuit()){
				return -1;
			}


			else if(a.getSuit() == b.getSuit()){
				if(a.getRank() < b.getRank()){
					return -1;
				}
				else if(a.getRank() == b.getRank()){
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