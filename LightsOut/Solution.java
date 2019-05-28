public class Solution{

	//instance variables
	public boolean[][] solution;
	public boolean[][] successful;
	public int currentWidth;
	public int currentHeight;
	public int boardSize;
	public int width;
	public int height;

	
	//constructor
	public Solution(int width, int height){
		this.width = width;
		this.height = height;
		solution = new boolean[width][height];
		currentWidth = 1;
		currentHeight = 1;
		boardSize = 0;
	}

	public Solution(Solution other){

	}

	public void setNext(boolean nextValue){

		solution[currentWidth][currentHeight] = nextValue;
		boardSize++;
		
		if(currentWidth<width){
			currentWidth++;
		}
		else if(currentWidth == width && currentHeight < height){
			currentWidth = 1;
			currentHeight++;
		}
		else{
			System.out.println("Cannot call setNext more than there are positions on the board!");
		}
	}

	public boolean isReady(){
		if (boardSize < width*height){
			return false;
		}
		return true;

	}

	public boolean isSuccessful(){
		boolean returnValue = false;
		for(int i = 0; i<solution.length; i++){
			for(int j = 0; j<solution[0].length; j++){
				if(solution[width][height] == true){
					if(successful.length < (solution.length-1)){
						solution[width+1][height] = true;
					}
					if(successful.length > 0){
						solution[width-1][height] = true;
					}
					if(successful[0].length < (solution[0].length-1)){
						solution[width][height+1] = true;
					}
					if(successful[0].length > 0){
						solution[width][height-1] = true;
					}

				}
			}
		}
		for(int i = 0; i<successful.length;i++){
			for(int j = 0; i<successful[0].length;j++){
				if (successful[i][j] != true){
					returnValue = false;
				}
				else{
					returnValue = true;
				}
				
			}
		}
		return returnValue;
		
	}

	public boolean equals(Object other){


		boolean[][] o = (boolean[][]) other;

		if(o == null && solution != null){
			return false;
		}

		for(int i = 0; i<width;i++){
			for(int j = 0; j<height;j++){
				if(o[i][j] != solution[i][j])
					return false;
			}
		}
		return true;

	}

	public String toString(){
		String in = "[";
		String out = "]";
		String array = "";
		int stringHeight = 0;
		
		while(stringHeight < height){
			for(int i = 0; i < width;i++){
				array += solution[i][stringHeight];
			}
			stringHeight++;
			in += array + ",";

		}
		
		in += out;
		return in;




	}

}