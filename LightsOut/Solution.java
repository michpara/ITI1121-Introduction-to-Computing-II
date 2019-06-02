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
		currentWidth = 0;
		currentHeight = 0;
		boardSize = 0;
	}

	public Solution(Solution other){
		this.width = other.width;
		this.height = other.height;
		currentWidth = other.currentWidth;
		currentHeight = other.currentHeight;
		boardSize = other.boardSize;

		solution = new boolean[other.width][other.height];

		for(int i = 0; i < solution.length; i++){
			for(int j = 0; j < solution[0].length; j++){
				solution[i][j] = other.solution[i][j];
			}
		}
	}

	public void setNext(boolean nextValue){

		solution[currentWidth][currentHeight] = nextValue;
		boardSize++;
		
		if(currentWidth<width-1){
			currentWidth++;
		}
		else if(currentWidth == width-1 && currentHeight < height-1){
			currentWidth = 0;
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
		successful = new boolean[width][height];
		boolean returnValue = false;
		for(int i = 0; i<width; i++){
			for(int j = 0; j<height; j++){
				if(solution[i][j] == true){
					successful[i][j] = true;
					if(i < (i-1)){
						successful[i+1][j] = true;
					}
					if(i > 0){
						successful[i-1][j] = true;
					}
					if(j< (j-1)){
						successful[i][j+1] = true;
					}
					if(j > 0){
						successful[i][j-1] = true;
					}
				}
			}
		}
		
		for(int k = 0; k<width;k++){
			for(int l = 0; l<height;l++){
				if (successful[k][l] != true){
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