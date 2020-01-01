import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	//compares Book a to Book b
	public int compare(Book a, Book b){
		if((!a.getAuthor()) < (b.getAuthor())){ 
			return -1;
		}
		if(a.getAuthor().equals(b.getAuthor())){
			if((a.getTitle()) < (b.getTitle())){ 
				return -1;
			}
		}

		return 1; 
	}
}
