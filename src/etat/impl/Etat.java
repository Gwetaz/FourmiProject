package etat.impl;

import general.Action;
import general.Constantes;
import general.Fourmi;

import java.awt.Color;
import java.util.Random;

import role.impl.Ouvriere;
import role.impl.Reine;
import role.impl.RoleFourmi;
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
			//Oeuf.actionEtat(f);
			//System.out.println("nb jour en Oeuf : "+f.nbJourEnEtat);
			if(f.nbJourEnOeuf < Constantes.nbJourEnOeuf)
			{
				f.nbJourEnOeuf++;
			}else{
				//System.out.println("ELSE NB JOUR OEUF : "+f.nbJourEnOeuf);
				//f.nbJourEnEtat = 0;
				f.setEtat(new Larve());
			}
			break;
		case Larve:
			//System.out.println("nb jour en Larve : "+f.nbJourEnEtat);
			if(f.nbJourEnLarve < Constantes.nbJourEnLarve)
			{
				f.nbJourEnLarve++;
			}else{
				//System.out.println("ELSE NB JOUR LARVE : "+f.nbJourEnEtat);
				//f.nbJourEnEtat = 0;
				f.setEtat(new Nymphe());
			}
			//Larve.actionEtat(f);
			break;
		case Nymphe:
			//System.out.println("nb jour en Nymphe : "+f.nbJourEnEtat);
			if(f.nbJourEnNymphe < Constantes.nbJourEnNymphe)
			{
				f.nbJourEnNymphe++;
			}else{
				//f.nbJourEnEtat = 0;
				Random r = new Random();
				int role = r.nextInt(100-0);
				if(role <= Constantes.pourcentOuvriere)
				{
					f.setEtat(new Adulte(new Ouvriere()));
					f.setRoleAdulte(RoleFourmi.Ouvriere);
				}else{
					f.setEtat(new Adulte(new Soldat()));
					f.setRoleAdulte(RoleFourmi.Soldat);
				}		
				//f.setEtat(new Larve());
			}
			//Nymphe.actionEtat(f);
			break;
		case Adulte:

			switch(f.getRoleAdulte())
			{
			case Ouvriere:
				Ouvriere.actionOuvriere(f);
				break;
			case Soldat:
				Soldat.actionSoldat(f);
				break;
			case Reine:
				Reine.actionReine(f.getFourmiliere());
				break;
			default:
					break;
			}
			break;
			
		}
		
	}

}
