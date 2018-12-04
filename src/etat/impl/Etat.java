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
	
	public EtatFourmi getEtatFourmi() {
		return etatFourmi;
	}

	public void setEtatFourmi(EtatFourmi etatFourmi) {
		this.etatFourmi = etatFourmi;
	}

	public int getTempsNaissance() {
		return tempsNaissance;
	}

	public void setTempsNaissance(int tempsNaissance) {
		this.tempsNaissance = tempsNaissance;
	}

	public double getPoid() {
		return poid;
	}

	public void setPoid(double poid) {
		this.poid = poid;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
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
