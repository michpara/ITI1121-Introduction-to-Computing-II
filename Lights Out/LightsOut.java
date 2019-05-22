public class LightsOut{


	
	public ArrayList<Solution> solve(int width, int height){

		//instance variables
		SolutionQueue partialSolutions = new ArrayListSolutionQueue();
		ArrayList<Solution> solutions = new ArrayList<Solution>();
		partialSolutions.enqueue(new Solution(width, height));
		Solution current;

		while(!partialSolutions.isEmpty()){
			long startTime = Calendar.getInstance().getTimeInMillis();
			current = partialSolutions.dequeue();
			if(current.isReady() && current.isSuccessful()){
				long endTime = Calendar.getInstance().getTimeInMillis();
				long totalTime = endTime - startTime;
				System.out.println("A solution was found in: " + totalTime);
				solution.add(current);
			}
			else{
				Solution currentExt = new Solution(current);
				current.setNext(true);
				partialSolutions.enqueue(current);
				currentExt.setNext(false);
				partialSolutions.enqueue(currentExt);
			}
		}
		return solutions;

	}

	public static void main(String[] args){

		int firstArg = Integer.parseInt(args[0]);
		int secondArg = Integer.parseInt(args[1]);

		ArrayList<Solution> solutionsFound = solve(firstArg, secondArg);
		int numberOfSolutionsFound = solutionsFound.size();
		System.out.println(numberOfSolutionsFound);

		for(int i =0;i<solutionsFound.size();i++){
			System.out.println(solutionsFound.get(i));
		}

	}
}