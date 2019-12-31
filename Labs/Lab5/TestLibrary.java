public class TestLibrary  {

    //test method
    public static void main(String[] args){
        Library library = new Library();

        library.addBook(new Book("D. Knuth","TAOCP",1970));
        library.addBook(new Book("D. Knuth","TAOCP",1971));
        library.addBook(new Book("D. IAmNotKnuth","TAOCP",1970));
        library.addBook(new Book("D. Knuth","TAOCP v2",1970));
        library.addBook(new Book("D. Knuth","TAOCP",1970));
        library.addBook(new Book("A. Munro","Charlie",1979));
        library.addBook(new Book("A. Munro","Bob",1979));
        library.addBook(new Book("A. Munro","Alice",1982));
        library.addBook(new Book("A. Munro","Alice partII",1982));

        System.out.println("before: ");
        library.printLibrary();
        library.sort();
        System.out.println("after: ");
        library.printLibrary();
    }
}
