public class Combination {

   //instance variables
   private int first; //intializes first
   private int second; //initializes second
   private int third; //initializes third

   //constructor
    public Combination( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    //checks if this Combination is equal to other
    public boolean equals( Combination other ) {
        if(first != other.first || second != other.second || third != other.third || other == null){
            return false;
        }
        return true;
    }

    //returns a string representation of the Combination as first:second:third
    public String toString() {

        return first + ":" + second + ":" + third;
       
    }

}
