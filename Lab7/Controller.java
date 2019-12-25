import java.awt.event.*;

public class Controller implements ActionListener {

	//instance variables
	private Timer model;
	private View[] views;
	private int numberOfViews;

	//constructors
	public Controller(){
		views = new View[2];
		numberOfViews = 0;
		model = new Timer() ;
		register(new GraphicalView(model, this));
		register(new TextView(model));
		update();
	}

	//returns the model
	public Timer getModel() {
		return model;
	}

	//returns the views
	public View[] getViews() {
		return views;
	}

	//adds view to views at index numberOfViews and incremnets numberOfView
	private void register(View view) {
		views[numberOfViews] = view;
		numberOfViews++;
	}

	//updates each view
	private void update() {
		for (int i = 0; i < numberOfViews; i++) {
			views[i].update();
		}
	}

	//if the user clicks a certain button, perform an action
	public void actionPerformed ( ActionEvent e ) {

		//increment hours if the user clicks IncrementHours
		if(e.getActionCommand().equals("IncrementHours")) {
			model.incrementHours();
	
		}

		//increments minutes if the user clicks IncrementsMinutes
		if(e.getActionCommand().equals("IncrementMinutes")) {
			model.incrementMinutes();
		}

		//increment seconds if the user clicks IncrementSeconds
		if(e.getActionCommand().equals("IncrementSeconds")) {
			model.incrementSeconds();
			
		}

		//decrements hours if the user clicks DecrementHours
		if(e.getActionCommand().equals("DecrementHours")) {
			model.decrementHours();
		}

		//decrement minutes if the user clicks DecrementsMinutes
		if(e.getActionCommand().equals("DecrementMinutes")) {
			model.decrementMinutes();
		}

		//decrements seconds if the user clicks DecrementSeconds
		if(e.getActionCommand().equals("DecrementSeconds")) {
			model.decrementSeconds();

		}
		
		//update the timer
		update();
	}
}
