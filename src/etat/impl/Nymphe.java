package etat.impl;

import java.awt.Color;
import java.util.Random;

public class Nymphe extends Etat implements Transformation{

	public Nymphe(int tempsNaissance)
	{
		super(tempsNaissance);
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		this.couleur = new Color(255,153,51); 
	}
	
	@Override
	public Etat transformation() {
		return new Adulte(tempsNaissance);
	}

}
