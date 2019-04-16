/**
*The class <b>Sum<b>
*calculates the sum of integers
*/

public class Sum{

    //calculaets the sum of given integers
    public static void main(String[]args){
    	
    	int sum = 0; 
    	int stringToInt = 0; 
    	for(int i=0; i<args.length;i++){ 
    		stringToInt = Integer.parseInt(args[i]); //converts args[i] to an integer and assigns it to total
    		sum += stringToInt; 

    	}

        System.out.println("The sum is " + sum);
    }
}
