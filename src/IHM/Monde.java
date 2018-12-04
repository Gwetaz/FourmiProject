package IHM;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import general.Fourmi;

public class Monde extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Fourmi> listeFourmi;
	
	public Monde(int nbOuvriere, int nbSoldat)
	{
		listeFourmi = new ArrayList<Fourmi>();
	}
	
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
