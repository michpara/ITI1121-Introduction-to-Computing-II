import java.utils.ArrayList;

public class ArrayListSolutionQueue implements SolutionQueue{

	//instance variables
	ArrayList<Solution> queue;
	current = 0;

	public ArrayListSolutionQueue(){

		queue = new ArrayList<Solution>();

	}

	public void enqueue(Solution value){
		queue.add(value);
	}	

	public Solution dequeue(){
		tmp = queue.get(current);
		queue.remove(current);
		current++;
		return tmp;
	}

	public boolean isEmpty(){
		return queue.isEmpty();
	}

}