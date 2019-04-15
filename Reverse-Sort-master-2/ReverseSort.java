public class ReverseSort{
	
	//test methods
	public static void main(String[] args){
		char[] unorderedLetters; 
		unorderedLetters = new char[]{'a','b','m','z','a','u'}; 
		reverseSort(unorderedLetters); 
		for(int i = 0; i < unorderedLetters.length; i++)
			System.out.println(unorderedLetters[i]);
	}
	
	//sorts the array and reverses it
	public static void reverseSort(char[] values){

		for(int i = 0; i < values.length - 1; i++){ 
			int maxValueIndex = i;
			for(int j = i + 1; j < values.length; j++){
				if(values[j]>values[maxValueIndex]) { 
					maxValueIndex = j; 
				}
			}
			
			//sorter
			char temp = values[maxValueIndex]; 
			values[maxValueIndex] = values[i]; 
			values[i] = temp; 
		}
	}
}
