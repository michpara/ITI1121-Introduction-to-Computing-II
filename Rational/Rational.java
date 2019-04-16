public class Rational {

    //instance variables
    private int numerator;
    private int denominator;

    // constructors
    public Rational(int numerator) {
        this(numerator, 1);	     
    }

    public Rational(int numerator, int denominator) {
	 if(denominator < 0){
		 denominator = -1*denominator;
		 numerator = -1*numerator;
	 }
	 this.numerator = numerator;
         this.denominator = denominator;
	 reduce();
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
        if(numerator ==0){ 
            denominator =1; 
        }
	    
        else{
            int reduced = gcd(Math.abs(numerator), denominator); //find the greatest commom divisor of the numerator and denominator
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
        if(numerator == other.numerator && denominator == other.denominator){
		return true;
	}
	return false;
    }
 
    //returns a string representation of the fraction (ex. 1/2)
    public String toString() {
    	
        return numerator + "/" + denominator; //returns the fraction in string form
    }


}

