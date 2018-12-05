package etat.impl;

import general.Action;
import general.Constantes;
import general.Fourmi;

import java.awt.Color;

import role.impl.Ouvriere;
import role.impl.Soldat;

public class Etat implements Action{
	
	protected EtatFourmi etatFourmi;
	protected double poid;
	protected Color color;

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
	public void action(Fourmi f) {
		switch(etatFourmi)
		{
		case Oeuf:
			Oeuf.actionEtat(f);
			break;
		case Larve:
			Larve.actionEtat(f);
			break;
		case Nymphe:
			Nymphe.actionEtat(f);
			break;
		case Adulte:
			//Adulte.actionEtat(f);
			//if (f.get)
			switch(f.getRoleAdulte())
			{
			case Ouvriere:
				Ouvriere.actionOuvriere(f);
				break;
			case Soldat:
				Soldat.actionSoldat(f);
				break;
			default:
					break;
			}
			break;
			
		}
		
	}

}
