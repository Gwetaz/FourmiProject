package IHM;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import etat.impl.Etat;
import etat.impl.Oeuf;
import general.Constantes;
import general.Fourmi;

public class Monde extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Fourmi> listeFourmi;
	private int nbOeufs;
	
	public Monde(int nbOeufs)
	{
		listeFourmi = new ArrayList<Fourmi>();
		this.nbOeufs = nbOeufs;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Constantes.couleurFourmiliere);
		g.fillRect(Constantes.departFourmiliereX,Constantes.departFourmiliereY,Constantes.tailleFourmiliereX,Constantes.tailleFourmiliereY);
		//g.setColor(Color.BLUE);
		Random rx = new Random();
		int posx;
		Random ry = new Random();
		int posy;
		for (int i = 0; i < nbOeufs; i++)
		{
			posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-Constantes.departFourmiliereX)+Constantes.departFourmiliereX;
			posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-Constantes.departFourmiliereY)+Constantes.departFourmiliereY;
			Fourmi f = new Fourmi(true, 1, posx, posy, g);
			listeFourmi.add(f);
		}
		
		for (int i = 0; i < listeFourmi.size(); i++)
		{
			/*Etat etatTest = new Oeuf(1, 2, 3);
			System.out.println(etatTest.toString());
			etatTest = ((Oeuf) etatTest).transformation();*/
			Etat nouvelEtat = listeFourmi.get(i).getEtat();
			nouvelEtat = ((Oeuf) nouvelEtat).transformation();
			listeFourmi.get(i).setEtat(nouvelEtat);
			//listeFourmi.get(i).getEtat();
		}
		for (int i = 0; i < listeFourmi.size(); i++)
		{
			System.out.println(listeFourmi.get(i).toString());
		}
		g.setColor(c);
	}

}















