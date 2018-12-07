package etat.impl;


import general.Constantes;

public class Oeuf extends Etat{
	
	public Oeuf() {
		this.changerEtat(EtatFourmi.Oeuf);
		this.poid = 0;
		this.color = Constantes.couleurOeuf;
	}
}
