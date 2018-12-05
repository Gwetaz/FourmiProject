package etat.impl;

import general.Action;
import general.Constantes;
import general.Fourmi;

import java.awt.Color;

import role.impl.Ouvriere;

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
	
	public void evolutionFourmi()
	{
		System.out.println();
		switch(etatFourmi)
		{
		case Oeuf:
			new Larve();
			break;
		case Larve:
			new Nymphe();
			break;
		case Nymphe:
			new Adulte(new Ouvriere());
			break;
		case Adulte:
			break;
			
		}
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
	public void action(Fourmi f) {
		// TODO Auto-generated method stub
		switch(etatFourmi)
		{
		case Oeuf:
			Oeuf.actionEtat(f);
			//new Larve();
			break;
		case Larve:
			//new Nymphe();
			Larve.actionEtat(f);
			break;
		case Nymphe:
			Nymphe.actionEtat(f);
			//new Adulte(new Ouvriere());
			break;
		case Adulte:
			Adulte.actionEtat(f);
			break;
			
		}
		
	}

}
