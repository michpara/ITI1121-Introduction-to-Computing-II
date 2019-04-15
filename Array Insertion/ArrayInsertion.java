public class ArrayInsertion{
	
	//inserts the value valueToInsert at the index indexToInsert into the array beforeArray
	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){

		int[] afterArray = new int[beforeArray.length+1]; 

		for(int i = 0;i<indexToInsert;i++){ 
			afterArray[i] = beforeArray[i]; 
		}

		for(int i = indexToInsert+1;i<afterArray.length;i++){ 
			afterArray[i] = beforeArray[i-1]; 

		}

		afterArray[indexToInsert] = valueToInsert; 
		
		return afterArray;

	}

	// test method
	public static void main(String[] args){

		int[] beforeArray = new int[]{1,5,4,7,9,6}; 
		int indexToInsert = 3; 
		int valueToInsert = 15;
		int[] afterArray = insertIntoArray(beforeArray, indexToInsert, valueToInsert); 
		
		System.out.println("Array before insertion: ");
		
		for(int i=0;i<beforeArray.length;i++){
			System.out.println(beforeArray[i]); //prints out the elements in beforeArray
		}
		
		System.out.println("Array after insertion of " + valueToInsert + " at position " + indexToInsert + ":");
		for(int i=0;i<afterArray.length;i++){
			System.out.println(afterArray[i]); //prints out the elements in afterArray
		}


	}
}
