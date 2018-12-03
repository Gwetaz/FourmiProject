package etat.impl;

public class Etat {
	protected EtatFourmi etat;
	
	public Etat() {
		this.etat = EtatFourmi.Oeuf;
	}
	
	
	public void changerEtape(EtatFourmi nouvelEtat)
	{
		this.etat = nouvelEtat;
	}
}
