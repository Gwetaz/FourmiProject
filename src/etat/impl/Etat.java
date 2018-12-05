package etat.impl;

import general.Action;
import general.Constantes;

import java.awt.Color;

public class Etat implements Action{
	
	protected EtatFourmi etatFourmi;
	protected double poid;
	protected Color color;
	/*public Etat()
	{
		this.tempsNaissance = tempsNaissance;
		this.positionX = positionX;
		this.positionY = positionY;
	}*/
	
	public EtatFourmi getEtatFourmi() {
		return etatFourmi;
	}

	public void setEtatFourmi(EtatFourmi etatFourmi) {
		this.etatFourmi = etatFourmi;
	}

	public double getPoid() {
		return poid;
	}

	public void setPoid(double poid) {
		this.poid = poid;
	}


	protected void changerEtat(EtatFourmi nouvelEtat)
	{
		etatFourmi = nouvelEtat;
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	
	public String toString()
	{
		return etatFourmi.toString();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
