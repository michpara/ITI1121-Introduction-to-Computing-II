public class Grades{
	
	//test method
	public static void main(String[] args){

		double[] grades = new double[]{10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0};
		System.out.println("The average is " + calculateAverage(grades));
		System.out.println("The median is " +calculateMedian(grades));
		System.out.println("The number of failed grades is " + calculateNumberFailed(grades));
		System.out.println("The number of passed grades is " + calculateNumberPassed(grades));

	}
	
	//calculates the average of the grades
	public static double calculateAverage(double[] notes){
		double total = 0; 
		double result = 0; 
		for(int i =0; i<notes.length;i++){
			total = total + notes[i]; 
		}
		result = total/notes.length; 
		return result;
	}
	
	//calculates the median of the grades
	public static double calculateMedian(double[] notes){
		
		int i, j; 
		int minValueIndex = 0; 	
		double temp; 

		for(i=0;i<notes.length-1;i++){
			minValueIndex=i;
			for(j=i+1;j<notes.length;j++){
				if(notes[j] < notes[minValueIndex]){ 
					minValueIndex = j; 
				}
			}
		}
		temp = notes[minValueIndex]; 
		notes[minValueIndex] = notes[i];
		notes[i] = temp; 

		double middleIndex = notes.length/2; 
		double result; //initializes result

		if(middleIndex%2==0){ 
			result = notes[(int)middleIndex];
		}
		else{ 
			result = (notes[(int)(middleIndex-0.5)] + notes[(int)(middleIndex+0.5)])/2; 
		}

		return result; 
	}
	
	//calculates the number of failed grades
	public static int calculateNumberFailed(double[] notes){
		
		int numberOfFailedGrades = 0; 
		for(int i =0;i<notes.length;i++){
			if(notes[i] < 50){ 
				numberOfFailedGrades++; 
			}

		}
		return numberOfFailedGrades;
	}
	
	//calculates the number of passed grades
	public static int calculateNumberPassed(double[] notes){
		int numberOfPassedGrades = 0; 
		for(int i =0;i<notes.length;i++){
			if(notes[i] >= 50){ 
				numberOfPassedGrades++; 
			}

		}
		return numberOfPassedGrades;
	
	}

}
