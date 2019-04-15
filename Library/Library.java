import java.util.ArrayList;

public class Library {
    
    //instance variables
    private ArrayList<Book> library = new ArrayList<Book>(); //creates an ArrayList of type Book

    //returns the book at index i
    public Book getBook(int i) {
      return library.get(i);
    }

    //returns the size of the library
    public int getSize() {
      return library.size(); 
    }

    //adds Book b to the library
    public void addBook (Book b) {
        library.add(b);
    }

    //sorts the books using the BookComparator
    public void sort() {
        library.sort(new BookComparator());
    }


    //prints the Library of books
    public void printLibrary() {
        for(int i = 0; i<library.size();i++){
            System.out.println(library.get(i)); //prints each book individually
        }
    }
}
