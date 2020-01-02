import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

public class GUI extends JFrame{
	
	public GUI() {
		
		setTitle("Move it!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		DisplayArea da = new DisplayArea();
				
		add(da, BorderLayout.NORTH);
		
		JPanel container = new JPanel();
		container.setBackground(Color.WHITE);
		
		String[] colors;
		colors = new String[] {"red", "black", "blue", "green", "yellow"};
		JComboBox colorList;
		colorList = new JComboBox(colors);
		
		JButton left = new JButton("Left");
		JButton right = new JButton("Right");
		JButton up = new JButton("Up");
		JButton down = new JButton("Down");
		
		container.add(left);
		container.add(right);
		container.add(up);
		container.add(down);
		container.add(colorList);
		
		add(container, BorderLayout.CENTER);
		
		left.addActionListener(da);
		right.addActionListener(da);
		up.addActionListener(da);
		down.addActionListener(da);
		colorList.addActionListener(da);
		
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[]) {
		GUI gui = new GUI();
	}
}