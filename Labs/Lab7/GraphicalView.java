import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicalView extends JFrame implements View {

	//instance variables
	private JLabel input; 
	private Timer model;

	//creates the GUI for the timer
	public GraphicalView (Timer model, Controller controller) {

		setLayout (new GridLayout(2, 3)); //creates a 2 by 3 grid
		this.model = model; //initializes model

		//creates JButton (buttons) for all increments and decrements
		JButton incrementHours = new JButton("IncrementHours");
		JButton decrementHours = new JButton("DecrementHours");
		JButton incrementMinutes = new JButton("IncrementMinutes");
		JButton decrementMinutes = new JButton("DecrementMinutes");
		JButton incrementSeconds = new JButton("IncrementSeconds");
		JButton decrementSeconds = new JButton("DecrementSeconds");

		//initializes the input JLabel
		input = new JLabel();

		//calls the button of same ID and invokes the action
		incrementSeconds.addActionListener(controller);
		incrementMinutes.addActionListener(controller);
		incrementHours.addActionListener(controller);
		decrementSeconds.addActionListener(controller);
		decrementMinutes.addActionListener(controller);
		decrementHours.addActionListener(controller);

		//adds the increments and inputs to the layout
		add(incrementHours);
		add(incrementMinutes);
		add(incrementSeconds);
		add(input);
		add(decrementHours);
		add(decrementMinutes);
		add(decrementSeconds);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default close operation as exiting the application

		setSize(700, 100); //creates the window size

		setVisible(true);
	}

	//sets the text for the input as timer
	public void update () {
		input.setText(model.toString());
	}
}
