package IHM;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import general.Constantes;
import general.Fourmi;

public class Monde extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Fourmi> listeFourmi;
	private int nbOuvriere;
	private int nbSoldat;
	
	public Monde(int nbOuvriere, int nbSoldat)
	{
		listeFourmi = new ArrayList<Fourmi>();
		this.nbOuvriere = nbOuvriere;
		this.nbSoldat = nbSoldat;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillRect(550,150,500,500);
		g.setColor(Color.BLUE);
		Random rx = new Random();
		int posx;
		Random ry = new Random();
		int posy;
		for (int i = 0; i < nbOuvriere; i++)
		{
			posx = rx.nextInt(Constantes.tailleJframeX);
			posy = ry.nextInt(Constantes.tailleJframeY);
			Fourmi f = new Fourmi(true, 1.0, 1, posx, posy, g);
			listeFourmi.add(f);
		}
		g.setColor(c);
	}

}















