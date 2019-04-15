public class Rational {

    //instance variables
    private int numerator;
    private int denominator;

    // constructors
    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 2;
	     
    }

    public Rational(int numerator, int denominator) {
	     this.numerator = numerator;
         this.denominator = denominator;
    }

    //returns the numerator
    public int getNumerator() {
	     return numerator;
    }
    //returns the denominator
    public int getDenominator() {
	     return denominator;
    }

    //adds this Rational and other
    public Rational plus(Rational other) {
        //returns this Rational plus the other Rational
	    int newDenominator = denominator * other.denominator; 
        int newNumerator = numerator * other.denominator;
        int newOtherNumerator = other.numerator * denominator;
        int sum = newNumerator + newOtherNumerator;
        return new Rational(sum, newDenominator); 
    }

    //adds Rational a and Rational b
    public static Rational plus(Rational a, Rational b) {
    	return a.plus(b); //cals the plus method to add Rational a with Rational b
    }

    // Transforms this number into its reduced form
    private void reduce() {
        if(numerator ==0){ //if the numerator is 0
            denominator =1; //the denominator will always equal 1

        }
        else{
            int reduced = gcd(numerator, denominator); //find the greatest commom divisor of the numerator and denominator
            numerator = numerator/reduced; //divide the numerator by this gcd
            denominator = denominator/reduced; //divide the denminator by this gcd
        }

    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    //compares other to this Rational
    public int compareTo(Rational other) {
        int thisNewNum = other.denominator * numerator;
        int otherNewNum = other.numerator * denominator;

        return thisNewNum - otherNewNum;

    }

    //checks if this Rational equals other
    public boolean equals(Rational other) {
        Rational ourRational = new Rational(this.numerator, this.denominator); //creates a Rational ourRational
        other.reduce(); //reduces the other Rational
        ourRational.reduce(); //reduces our Rational
        if(ourRational.getNumerator() == other.getNumerator() && ourRational.getDenominator() == other.getDenominator()){
            return true;
        }
        return false;
    }
 
    //returns a string representation of the fraction (ex. 1/2)
    public String toString() {
    	
        return numerator + "/" + denominator; //returns the fraction in string form
    }
	
    //test method
    public static void main(String[] args){

        Rational first = new Rational(5);
        System.out.println(first.getNumerator());
        System.out.println(first.getDenominator());
        Rational second = new Rational(2,4);
        Rational third = new Rational(1,3);
        System.out.println(second.getNumerator());
        System.out.println(third.getDenominator());
        System.out.println(Rational.plus(second, third));
        second.reduce();
        third.reduce();
        System.out.println(second.getNumerator());
        System.out.println(second.getDenominator());
        System.out.println(third.getNumerator());
        System.out.println(third.getDenominator());
        System.out.println(first.compareTo(second));
        Rational fourth = new Rational(2,4);
        System.out.println(second.compareTo(fourth));
        Rational fifth = new Rational(1,2);
        Rational sixth = new Rational(1, 4);
        System.out.println(sixth.compareTo(fifth));
        System.out.println(sixth.equals(fifth));
        System.out.println(first);



    }


}

