package etat.impl;

import java.awt.Color;
import java.util.Random;

public class Larve extends Etat implements Transformation{

	public Larve(int tempsNaissance)
	{
		super(tempsNaissance);
		this.changerEtat(EtatFourmi.Larve);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5)*4;
		this.couleur = new Color(255,255,0); 
	}
	
	
	@Override
	public Etat transformation() {
		return new Nymphe(tempsNaissance);
	}

}
