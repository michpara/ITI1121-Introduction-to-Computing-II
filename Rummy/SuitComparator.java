import java.util.Comparator;

public class SuitComparator implements Comparator<Card>{

		public int compare(Card a, Card b){

			if(a == null || b == null){
				throw new NullPointerException();
			}

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
}