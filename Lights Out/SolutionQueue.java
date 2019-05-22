public interface SolutionQueue{
	
	boolean isEmpty();
	void enqueue(Solution s);
	Solution dequeue();
}