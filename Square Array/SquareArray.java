public class SquareArray{
	
	//creates an array and squares every element
	public static int[] createArray(int size){

		int[] array = new int[size]; 

		for(int i=0;i<array.length;i++){
			array[i] = i*i; 
		}
		return array; 
	}
	
	//test method
	public static void main(String[] args){

		int[] myArray = createArray(13); 
		
		for(int i=0;i<myArray.length;i++){
			System.out.println("The square of " + i +" is: " + myArray[i]); 
		}


	}
}
