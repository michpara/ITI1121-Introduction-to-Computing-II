public class Book {

    //instance variable
    private String author;
    private String title;
    private int year;

    //constructor
    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    //returns the author
    public String getAuthor() {
        return author; 
    }
    
    //returns the title
    public String getTitle() {
        return title;
    }
    
    //returns the year of publication
    public int getYear(){
        return year;
    }
    
    //returns if other is equal to this Book
    public boolean equals(Object other) {
        if( other == null || getClass() != other.getClass()){
            return false; //if other is null or if other is not the same class
        }

        Book o = (Book) other; //turn other in Book and assign it to o
        if(year != o.year) { 
            return false; 
        }

        if(title == null) { 
            if(o.title != null) { 
                return false;
            }
        }else if(!title.equals(o.title)) { 
            return false;
        }

        if(author == null) { 
            if(o.author != null) { 
                return false;
            }
        } else if(!author.equals(o.author)) { 
            return false;
        }

        return true; //if none of the previous if statements are true, return true
    }
    
    //returns a string representation of the Book as author: title (year)
    public String toString() {
        return(author+ ": " + title + " (" + year + ")"); //print as author: title (year)
    }

}
