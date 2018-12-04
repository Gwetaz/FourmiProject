package etat.impl;

import java.awt.Color;

public class Etat {
	
	protected EtatFourmi etatFourmi;
	protected int tempsNaissance;
	protected double poid;
	protected Color couleur;
	protected int positionX;
	protected int positionY;
	
	public Etat(int tempsNaissance, int positionX, int positionY)
	{
		this.tempsNaissance = tempsNaissance;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	protected void changerEtat(EtatFourmi nouvelEtat)
	{
		etatFourmi = nouvelEtat;
	}
	
	
	public String toString()
	{
		return etatFourmi.toString();
	}

}
