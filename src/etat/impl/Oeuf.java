package etat.impl;


import general.Constantes;
import general.Fourmi;

public class Oeuf extends Etat{
	
	public Oeuf() {
		//this.nbJourEnEtat = 0;
		this.changerEtat(EtatFourmi.Oeuf);
		this.poid = 0;
		this.color = Constantes.couleurOeuf;
	}
	
	
	public void actionEtat(Fourmi f){
		f.setEtat(new Larve());
	}
}
