public class HasLengthTwoRun{
	
	//checks if the array of doubles has at least two consecutive doubles
	public static boolean hasLengthTwoRun(double[]values){ 

		for(int i = 0; i<values.length-1;i++){ 
			if(values[i] == values[i+1]){ 
				return true; 

			}
			
		}
		
	return false; 
		
	}

}
