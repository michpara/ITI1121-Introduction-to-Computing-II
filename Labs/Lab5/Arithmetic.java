public class Arithmetic extends AbstractSeries {

    //instance variables
    public int i =1;
    public double count = 0;

    //the ith call to the method next returns S(i-1) + i where i is (1,2,3,4...) and S(i-1) is what was returned by the previous call to the method next()
    public double next() {
    	count = count + i; 
    	i++; 
    	return count;
    }
}
