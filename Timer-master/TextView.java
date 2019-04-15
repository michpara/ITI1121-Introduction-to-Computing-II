public class TextView implements View {

	//instance variables
	private Timer model ;

	//constructor
	public TextView (Timer model) {
		this.model = model ; 
	}

	//prints the string representation of the timer
	public void update() {
		System.out.println(model.toString()) ;
	}
}
