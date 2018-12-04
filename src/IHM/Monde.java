package IHM;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Monde extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillRect(550,150,500,500);
		g.setColor(Color.BLUE);
		g.fillOval(795,395,20,20);
		g.setColor(c);
	}

}
