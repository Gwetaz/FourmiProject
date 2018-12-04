package etat.impl;

import java.util.Random;

public class Adulte extends Etat{

	public Adulte(int tempsNaissance)
	{
		super(tempsNaissance);
		this.changerEtat(EtatFourmi.Adulte);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		// set role 
	}
	
}
