package etat.impl;

import general.Action;
import general.Constantes;
import general.Fourmi;

import java.awt.Color;
import java.util.Random;

import IHM.Monde3;
import role.impl.Ouvriere;
import role.impl.Reine;
import role.impl.RoleFourmi;
import role.impl.Sexuee;
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

	//Cette méthode définit ce que va faire une fourmi selon son état: cf voir document partie 1
	@Override
	public void action(Fourmi f, Monde3 m) {
		
		switch(etatFourmi)
		{
		case Oeuf:
			if(f.nbJourEnOeuf < Constantes.nbJourEnOeuf)
			{
				f.nbJourEnOeuf++;
			}else{
				f.setEtat(new Larve());
			}
			break;
		case Larve:
			if(f.nbJourEnLarve < Constantes.nbJourEnLarve)
			{
				f.nbJourEnLarve++;
			}else{
				f.setEtat(new Nymphe());
			}
			break;
		case Nymphe:
			if(f.nbJourEnNymphe < Constantes.nbJourEnNymphe)
			{
				f.nbJourEnNymphe++;
			}else{
				Random r = new Random();
				int role = r.nextInt(100-0);
				if(role <= Constantes.pourcentOuvriere)
				{
					Random ageR = new Random();
					int age = ageR.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
					f.setNbJourDeMort(age);
					f.setEtat(new Adulte(new Ouvriere()));
					f.setRoleAdulte(RoleFourmi.Ouvriere);
				}else if (role > Constantes.pourcentOuvriere && role <= (Constantes.pourcentOuvriere+Constantes.pourcentSoldat)){
					Random ageR = new Random();
					int age = ageR.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
					f.setNbJourDeMort(age);
					f.setEtat(new Adulte(new Soldat()));
					f.setRoleAdulte(RoleFourmi.Soldat);
				}else{
					Random ageR = new Random();
					int age = ageR.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
					f.setNbJourDeMort(age);
					f.setEtat(new Adulte(new Sexuee()));
					f.setRoleAdulte(RoleFourmi.Sexuee);
				}
			}
			break;
		case Adulte:
			if(f.getNbJourDeMort()-f.getNbJourDeVie() == 0)
			{
				f.setVivante(false);
			}else{
				f.setNbJourDeVie(f.getNbJourDeVie()+1);
				switch(f.getRoleAdulte())
				{
				case Ouvriere:
					Ouvriere.actionOuvriere(f,m);
					break;
				case Soldat:
					Soldat.actionSoldat(f);
					break;
				case Sexuee:
					Sexuee.actionSexuee(f);
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

}
