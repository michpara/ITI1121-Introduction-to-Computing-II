public class GetLongestRun{
	
	//returns the longest run in an array of doubles
	public static int getLongestRun(double[]double_values){

		if (double_values.length == 0){ 
			return 0; 
		}

		int i = 0; //i will be used as a breaking condition in the while loop
		int max_length = 1; 
		
		while(i<double_values.length-1){ 
			int length_of_run = 1;
			
			while(i<double_values.length-1 && double_values[i] == double_values[i+1]){ 
				length_of_run++;
				i++;
			}
			
			if(length_of_run > max_length){ 
				max_length = length_of_run; 
			}
			
			i++;
		}

		return max_length; 		
	}

	//returns the longest run in an array of strings
	public static int getLongestRun(String[]double_values){

		if (double_values.length == 0){
			return 0; 
		}

		int i = 0;//i will be used as a breaking condition in the while loop
		int max_length = 1; 
		
		while(i<double_values.length-1){
			int length_of_run = 1; 
			
			while(i<double_values.length-1 && double_values[i].equals(double_values[i+1])){																			
				length_of_run++;
				i++; 
			}
			
			if(length_of_run > max_length){ 
				max_length = length_of_run; 
			}
			
			i++;
		}

		return max_length; 
	}
}
