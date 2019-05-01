import java.util.Comparator;

	public class RankComparator implements Comparator<Card> {

		public int compare(Card a, Card b){

			if(a == null || b == null){
				throw new NullPointerException();
			}

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

	}
