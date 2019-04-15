public class TestBook  {
    
    //test method
    public static void main(String[] args){
        Book b1 = new Book("D. Knuth","TAOCP",1970);
        Book b2 = new Book("D. Knuth","TAOCP",1971);
        Book b3 = new Book("D. IAmNotKnuth","TAOCP",1970);
        Book b4 = new Book("D. Knuth","TAOCP v2",1970);
        Book b5 = new Book("D. Knuth","TAOCP",1970);


        System.out.println(b1 + " equals " + b2 + ": " +
            b1.equals(b2));
        System.out.println(b1 + " equals " + b3 + ": " +
            b1.equals(b3));
        System.out.println(b1 + " equals " + b4 + ": " +
            b1.equals(b4));
        System.out.println(b1 + " equals " + b5 + ": " +
            b1.equals(b5));

        Book b6 = new Book(null,"TAOCP",1971);
        Book b7 = new Book("D. IAmNotKnuth",null,1970);

        System.out.println(b1 + " equals " + b6 + ": " +
            b1.equals(b6));
        System.out.println(b1 + " equals " + b7 + ": " +
            b1.equals(b7));
        System.out.println(b1 + " equals " + null + ": " +
            b1.equals(null));
        System.out.println(b6 + " equals " + b1 + ": " +
            b6.equals(b1));
        System.out.println(b7 + " equals " + b1 + ": " +
            b7.equals(b1));
        System.out.println(b6 + " equals " + b6 + ": " +
            b6.equals(b6));
        System.out.println(b7 + " equals " + b7 + ": " +
            b7.equals(b7)); 
    }
}

