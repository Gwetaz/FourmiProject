package etat.impl;

public class Etat {
	
	protected EtatFourmi etatFourmi;
	protected int tempsNaissance;
	protected double poid;
	
	public Etat(int tempsNaissance)
	{
		this.tempsNaissance = tempsNaissance;
	}
	
	protected void changerEtat(EtatFourmi nouvelEtat)
	{
		etatFourmi = nouvelEtat;
	}
	
	
	public String toString()
	{
		return etatFourmi.toString();
	}

}
