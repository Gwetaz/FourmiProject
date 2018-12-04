package etat.impl;

import java.awt.Color;

public class Oeuf extends Etat implements Transformation{
	
	public Oeuf(int tempsNaissance) {
		super(tempsNaissance);
		this.changerEtat(EtatFourmi.Oeuf);
		this.poid = 0;
		this.couleur = new Color(255,255,255);
	}
	
	
	@Override
	public Etat transformation() {
		return new Larve(tempsNaissance);
	}

}
