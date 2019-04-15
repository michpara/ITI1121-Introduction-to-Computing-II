public class Average{
	
	//test method
	public static void main(String[] args){
		double[] valuesArray; 
		valuesArray = new double[]{100.0,34.0,72.0,56.0,82.0,67.0,94.0}; 
		System.out.println("The average is: " + calculateAverage(valuesArray)); 
	} 

	//calculates the average of all the element in the array
	public static double calculateAverage(double[] values){
		double result = 0; 
		double total = 0; 

		for(int i=0;i<values.length;i++){
			total = total + values[i]; 
		}

		result = total/values.length; 
		return result;


	}
}
