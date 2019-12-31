public class Geometric extends AbstractSeries {

    //instance variables
    public int i = 1;
    public double count = 0;
    public int count2 =0;
    
    //returns the next partial sum where it is the series like 1 + 1/2 + 1/4 + 1/8...
    public double next() {

    	if(count2==0){ //the first time the method is called
    		count = count/Math.pow(2,i-1) + 1; 
    		count2++; 
    		i++; 
    		return count;
    	}
    	else{ //anytime after the first time the method is called
    		count += count2/Math.pow(2,i-1); 
    		i++; 
    	}
    	return count;

    }
}
