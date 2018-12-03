package etat.impl;

import java.util.Random;

public class Nymphe extends Etat implements Transformation{

	public Nymphe(int tempsNaissance)
	{
		super(tempsNaissance);
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
	}
	
	@Override
	public Etat transformation() {
		return new Adulte(tempsNaissance);
	}

}
