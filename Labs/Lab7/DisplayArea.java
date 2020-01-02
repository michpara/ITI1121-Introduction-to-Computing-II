import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;

public class DisplayArea extends JPanel implements ActionListener{
		
	public static final int DISPLAY_SIZE = 500;
	
	private Point p;
	private Color c;
	
	public DisplayArea() {
		setBackground(Color.WHITE);
		p = new Point(250, 250);
		c = Color.RED;
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DISPLAY_SIZE, DISPLAY_SIZE);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command;
	    command = e.getActionCommand();

	    if (command.equals("Left")) {
	        p.x -= 10;
	        repaint();
	    } else if (command.equals("Right")) {
	    	p.x += 10;
	        repaint();;
	    } else if (command.equals("Up")) {
	    	p.y -= 10;
	        repaint();;
	    } else if (command.equals("Down")) {
	    	p.y += 10;
	        repaint();;
	    } else {
	        ;
	    }
	    
	    if (e.getSource() instanceof JComboBox) {

		    JComboBox cb;
	        cb = (JComboBox) e.getSource();
		    String color;
	        color = (String) cb.getSelectedItem();

		    if(color == "red"){
		    	c = Color.RED;
		    } else if(color == "black"){
		    	c = Color.BLACK;
		    }
		    else if(color == "blue"){
		    	c = Color.BLUE;
		    }
		    else if(color == "green"){
		    	c = Color.GREEN;
		    }
		    else if(color == "yellow"){
		    	c = Color.YELLOW;
		    }
	    }
	    repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(c);
		g.fillOval(p.x, p.y, 10, 10);
	}
}