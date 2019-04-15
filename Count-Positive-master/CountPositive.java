public class CountPositive{

	//counts the amount of positive doubles in the array doubles
	public static int countPositive(double[]values){ 
		int numberOfPositiveDoubles = 0; 

		for(int i=0;i<values.length;i++){ 
			if(values[i]>0){ 
				numberOfPositiveDoubles = numberOfPositiveDoubles + 1;
			}
		}

		return numberOfPositiveDoubles; 
	}
}
	
